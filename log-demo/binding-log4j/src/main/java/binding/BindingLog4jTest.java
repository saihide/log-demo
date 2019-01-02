package binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体绑定
 *
 * @date: 2018/12/24
 **/
public class BindingLog4jTest {
    
    public static final Logger logger = LoggerFactory.getLogger(BindingLog4jTest.class);

    public static void main(String[] args) {
        logger.info("binding log4j test");
    }
}
