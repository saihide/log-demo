package binding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 具体绑定
 *
 * @date: 2018/12/24
 **/
public class BindingLogbackTest {
    
    public static final Logger logger = LoggerFactory.getLogger(BindingLogbackTest.class);

    public static void main(String[] args) {
        logger.info("binding test");
    }
}
