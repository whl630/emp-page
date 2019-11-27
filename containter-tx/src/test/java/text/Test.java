package text;

import com.config.ConfigHelper;
import com.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void empTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigHelper.class);
        EmpService empService = context.getBean(EmpService.class);
        empService.getTx();
    }
}
