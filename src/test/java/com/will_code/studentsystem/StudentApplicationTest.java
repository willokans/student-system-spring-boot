package com.will_code.studentsystem;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTest {

    public static Logger logger = (Logger) LoggerFactory.getLogger(StudentApplicationTest.class);

    @Test
    public void contextLoads(){
        logger.info("Test case executing...");
        assertEquals(true, true);
    }
}
