package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
       // basePackages = "hello.core.member", member 패키지 하단에서만 조회 가능
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //configuration 어노테이션 붙은거 뺌
)
public class AutoAppConfig {

}
