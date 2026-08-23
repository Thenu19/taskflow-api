package TaskFlow.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .dispatcherTypeMatchers(DispatcherType.ERROR).permitAll()
                        .requestMatchers(HttpMethod.GET, "/api/tasks", "/api/tasks/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/tasks").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/api/tasks/**").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/api/tasks/**").permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}