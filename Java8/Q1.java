package Java8;
//1) First number is greater than second number or not
//Parameter (int ,int ) Return boolean
@FunctionalInterface
interface Operational1
{
    boolean operation(int a,int b);
}
//2) Increment the number by 1 and return incremented value
//Parameter (int) Return int

@FunctionalInterface
interface Operational2
{
    int increase(int a);
}

//3) Concatination of 2 string
//Parameter (String , String ) Return (String)

@FunctionalInterface
interface Operational3
{
    String Concat(String a, String b);
}

//4) Convert a string to uppercase and return
//Parameter (String) Return (String)

@FunctionalInterface
interface Operational4
{
    String Convert(String a);
}

 class myClass1 {
    public static void main(String[] args)
    {
        //1) first operation is performed
        Operational1 op1=(a,b)-> {
            if (a > b)
                return true;
            else
                return false;
        };
        System.out.println("check weather a number is greater or not : " + op1.operation(2,3));

        //2) second operation is performed
        Operational2 op2=(a)-> {
            return a+1;
        };
        System.out.println("The value of a number is increment by 1 : " +op2.increase(9));

        //3) third operation is performed
        Operational3 op3=(a,b)-> {
            return a+b;
        };
        System.out.println("The string is concatenated : " + op3.Concat("Hello","World"));

        //4) fourth operation is performed
        Operational4 op4=(a)-> {
            return a.toUpperCase();
        };
        System.out.println("The string is converted into uppercase : " + op4.Convert("tothenew"));
    }
}


