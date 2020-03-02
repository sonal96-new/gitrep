import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Test {


        public static void main(String[] args) {
            Logger logger = Logger.getLogger(Test.class.getName());
            BasicConfigurator.configure();
            logger.info("Hello world");
            logger.info("we are in logger info mode");
        }
    }


