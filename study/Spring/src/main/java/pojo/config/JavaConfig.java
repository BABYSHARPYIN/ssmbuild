package pojo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

/**
 * -*- coding = utf-8 -*-
 *
 * @Author: Created by rio on 2022/10/8 09:55
 * @PACKAGE: pojo.config
 * @Software: IntelliJ IDEA
 */
@Configuration
@ComponentScan("pojo")
@Import(JavaConfig2.class)
public class JavaConfig {
    /**
     * JavaConfig类等价于下面的 Spring XML：
     * <import resource="JavaConfig2.xml"/>
     * <context:component-scan base-package="pojo"/>
     * <beans>
     *     <bean id="user" class="pojo.User"/>
     * </beans>
     * */
    @Bean
    public User user() {
        return new User();
    }

}
