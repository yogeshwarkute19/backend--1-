package Student.Management.backend.crosConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CrosConfig implements WebMvcConfigurer {
	
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("http://127.0.0.1:5500/") // Allow frontend domain
	                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed HTTP methods
	                .allowedHeaders("*") // Allow all headers
	                .allowCredentials(true); // Allow credentials if needed
	    }

}
