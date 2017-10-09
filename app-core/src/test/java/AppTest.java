import com.company.service.InfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:core-context.xml")
public class AppTest {

    @Autowired
    InfoService infoService;

    private static final Logger logger =
            LoggerFactory.getLogger(AppTest.class);

    @Test
    public  void contextLoad() throws SQLException {
        logger.info("RUN TEST");
        logger.info("REUSLT : {}",infoService.getDs());
        logger.info("END RUN TEST");
    }
}
