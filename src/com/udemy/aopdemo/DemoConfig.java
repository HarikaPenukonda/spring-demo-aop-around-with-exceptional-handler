package com.udemy.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // Spring pure java Configuration
@EnableAspectJAutoProxy // Spring AOP Proxy Support
@ComponentScan("com.udemy.aopdemo") // ccomponent scan for components and aspects, Recurse packages
public class DemoConfig {

}
