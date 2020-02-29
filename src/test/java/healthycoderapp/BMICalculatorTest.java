package healthycoderapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
 //private String environment="dev";

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("Before all unit test cases ");
    }
    @AfterAll
    static void afterAll()
    {
        System.out.println("After all unit test cases");
    }
    @Nested
    class IsDietRecommendedTest
    {
        @ParameterizedTest(name="weight={0},height={1}")

        @CsvSource(value={"89.0,1.72","95.0,1.75","110.0,1.78"})
            //@ValueSource(doubles = {89.0,95.0,98.0})
        void should_ReturnTrue_When_DietRecommended(Double coderWeight)
        {
            //given
            double weight=coderWeight;
            double height=1.72;
            //when
            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            //then
            assertTrue(recommended);
        }

    /*@Test
   void should_ReturnTrue_When_DietRecommended()
    {
        //given
        double weight=89.0;
        double height=1.72;
        //when
        boolean recommended=BMICalculator.isDietRecommended(weight,height);
        //then
        assertTrue(recommended);
    }*/
    @Test
    void should_ReturnFalse_When_DietNotRecommended()
    {
        double weight=50.0;
        double height=1.92;
        boolean recommended=BMICalculator.isDietRecommended(weight,height);
        assertFalse(recommended);
    }

        @Test
        void should_ThrowArithmeticException_When_HeightZero()
        {
            //given
            double weight=50.0;
            double height=0.0;
            //when
            Executable executable = ()-> BMICalculator.isDietRecommended(weight,height);
            //then
            assertThrows(ArithmeticException.class, executable);
        }
    }
    @Nested
    class FindCoderWithWorstBMITests
    {
        @Test
        void should_ReturnCoderWithWorstBMIIN1Ms_When_CoderHas1000Elements()
        {

            //given

            List<Coder> coders = new ArrayList<>();
            for(int i=0;i<1000;i++)
            {
                coders.add(new Coder(1.0 + i,10.0 +i));
            }
            //when
            Executable executable= ()-> BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertTimeout(Duration.ofMillis(10),executable);
        }

        @Test
        void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty()
        {
            //given
            List<Coder> coders=new ArrayList<>() ;
            coders.add(new Coder(1.80,60.0));
            coders.add(new Coder(1.92,98.0));
            coders.add(new Coder(1.82,64.7));
            //when
            Coder coderWorstBMI=BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertAll(
                    ()->assertEquals(1.92,coderWorstBMI.getHeight()),
                    ()->assertEquals(98.0,coderWorstBMI.getWeight())
            );
        }
        @Test
        void should_ReturnNullWorstBMICoder_When_CoderListNotEmpty()
        {
            //given
            List<Coder> coders=new ArrayList<>() ;


            //when
            Coder coderWorstBMI=BMICalculator.findCoderWithWorstBMI(coders);
            //then
            assertNull(coderWorstBMI,"The list is empty");
        }
    }
    @Nested
    class GetBMIScoresTests {


        @Test
        void should_ReturnCorrectBMIScoresArray_When_CoderListNotEmpty() {
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.92, 98.0));
            coders.add(new Coder(1.82, 64.7));
            double[] expected = {18.52, 26.58, 19.53};
            //when
            double[] bmiScores = BMICalculator.getBMIScores(coders);
            //then
            assertArrayEquals(expected, bmiScores);
        }
    }


}