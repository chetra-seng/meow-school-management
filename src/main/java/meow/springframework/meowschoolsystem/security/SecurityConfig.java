package meow.springframework.meowschoolsystem.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final SuccessLoginHandler successLoginHandler;

    public SecurityConfig(SuccessLoginHandler successLoginHandler) {
        this.successLoginHandler = successLoginHandler;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("meow_adminStudent").password(passwordEncoder().encode("chetra.admin")).authorities("STUDENT_ADMIN")
                .and()
                .withUser("meow_adminDepartment").password(passwordEncoder().encode("chetra.admin")).authorities("DEPARTMENT_ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/*").permitAll()
                .antMatchers("/css/*").permitAll()
                .antMatchers("/students").permitAll()
                .antMatchers("/students/*").permitAll()
                .antMatchers("/teachers").permitAll()
                .antMatchers("/admin/students/*").hasAuthority("STUDENT_ADMIN")
                .antMatchers("/admin/students/**").hasAuthority("STUDENT_ADMIN")
                .antMatchers("/admin/departments/*").hasAuthority("DEPARTMENT_ADMIN")
                .antMatchers("/admin/departments/**").hasAuthority("DEPARTMENT_ADMIN")
                .anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                .failureUrl("/login?error=true")
                .successHandler(successLoginHandler)
                .and()
                .logout().logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID");
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resource/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
