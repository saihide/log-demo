package bridge;

import legacy.JclLegacyService;
import legacy.JulLegacyService;
import legacy.Log4jLegacyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * @Description: 桥接test
 *
 * @date: 2018/12/25
 **/
public class BridgeTest {
    public static final Logger logger = LoggerFactory.getLogger(BridgeTest.class);

    public static void main(String[] args) {
        logger.info("bridge test");

        //log4j
        Log4jLegacyService.foo();

        //jul
        SLF4JBridgeHandler.install();
        JulLegacyService.foo();

        //jcl
        JclLegacyService.foo();
    }
}
