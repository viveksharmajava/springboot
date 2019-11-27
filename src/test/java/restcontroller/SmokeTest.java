package restcontroller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import question.Question;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = applauncher.SpringBootFirstWebApplication.class)
public class SmokeTest {

    @Autowired
    private Question controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}