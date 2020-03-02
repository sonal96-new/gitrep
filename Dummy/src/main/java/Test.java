import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class Test
{
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Test.class.getName());
        BasicConfigurator.configure();
        logger.info("Hello world");
        logger.warn("we are in logger info mode");
    }
}
