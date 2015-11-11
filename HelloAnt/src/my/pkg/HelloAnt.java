package my.pkg;

import org.apache.log4j.Logger;

public class HelloAnt {
    static Logger logger = Logger.getLogger(HelloAnt.class);

    public static void main(String[] args) {
        logger.info("Hello Ant!!!");          // the old SysO-statement
    }
}
