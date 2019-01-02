package legacy;

import java.util.logging.Logger;

/**
 * @Description: jul遗留服务
 *
 * @date: 2018/12/25
 **/
public class JulLegacyService {
    private static Logger logger = Logger.getLogger(JulLegacyService.class.getName());

    public static void foo(){
        logger.info("JulLegacyService.foo() invoked");
    }

    public static void main(String[] args) {
        foo();
    }
}
