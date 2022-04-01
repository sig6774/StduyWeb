package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.stone")
// 웹서버를 시작할 때 com.stone 패키지 하위에 있는 것 중 Component라고 적혀 있는 애들이 있으면 객체를 생성해서 자동으로 관리하라 라는 뜻
// Spring이 관리하는 객체라는 뜻 
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/",".jsp");
	
	}
}
