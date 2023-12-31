package com.fercejor.repuestofercejor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((authorize) -> authorize
        .requestMatchers("/login/*").permitAll()
        .anyRequest().authenticated())
        .formLogin((formLogin) -> {formLogin.defaultSuccessUrl("/fercejor/", true).loginPage("/login/");})
        .logout((logout) -> {logout.permitAll();});
        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() throws Exception{
        return (web) -> {web.ignoring().requestMatchers("/css/**","/js/**","/assets/**");};
    }

    @Bean
    public InMemoryUserDetailsManager configureAutheticator(){
        List<UserDetails> listaUsuarios = new ArrayList<>();
        List<GrantedAuthority> rolesAdministradores = new ArrayList<>();
        List<GrantedAuthority> rolesUsuarios= new ArrayList<>();
        rolesAdministradores.add(new SimpleGrantedAuthority("ADMIN"));
        rolesUsuarios.add(new SimpleGrantedAuthority("USER"));
        listaUsuarios.add(new User("nico", "{noop}123456", rolesAdministradores));
        listaUsuarios.add(new User("dave", "{noop}123456", rolesUsuarios));
        return new InMemoryUserDetailsManager(listaUsuarios);
    }
}
