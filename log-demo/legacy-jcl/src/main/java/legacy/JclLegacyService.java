package legacy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description: jcl遗留服务类
 *
 * @date: 2018/12/25
 **/
public class JclLegacyService {
    public static Log logger = LogFactory.getLog(JclLegacyService.class);

    public static void foo(){
        logger.info("JclLegacyService.foo() invoked");
    }

    public static void main(String[] args) {
        foo();
    }
}
