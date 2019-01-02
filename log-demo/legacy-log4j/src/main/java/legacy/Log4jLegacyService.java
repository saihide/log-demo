package legacy;

import org.apache.log4j.Logger;

/**
 * @Description: 遗留的log4j服务
 *
 * @date: 2018/12/25
 **/
public class Log4jLegacyService {
    private static Logger logger = Logger.getLogger(Log4jLegacyService.class);

    public static void foo(){
        logger.info("Log4jLegacyService.foo() invoked");
    }

    public static void main(String[] args) {
        foo();
    }
}
