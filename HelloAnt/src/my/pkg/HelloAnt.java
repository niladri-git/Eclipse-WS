package my.pkg;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloAnt {
    static Logger logger = Logger.getLogger(HelloAnt.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Hello Ant!!!");          // the old SysO-statement
    }
}
