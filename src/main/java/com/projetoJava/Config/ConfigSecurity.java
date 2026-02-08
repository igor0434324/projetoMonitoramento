package com.projetoJava.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ConfigSecurity {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // desabilita CSRF
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // libera todas as rotas
                )
                .httpBasic(Customizer.withDefaults()); // mantém compatibilidade, mas não exige login

        return http.build();
    }
}
