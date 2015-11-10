package my.pkg;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class AntWorld {
    static Logger logger = Logger.getLogger(AntWorld.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Ant World");          // the old SysO-statement
    }
}