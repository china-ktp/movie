package com.movie.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    //访问路径:http://localhost:10010/druid/login.html 或者 http://localhost:10010/movie

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource druidDataSource(){

        return new DruidDataSource();
    }

    //后台监控 ServletRegistrationBean类似于之前写的xml文件
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        bean.addUrlMappings("/movie");//增加监控页面的映射也就是说访问/xuan也能进入到druid监控主页面
        String servletName = bean.getServletName();
        System.out.println(servletName);    //statViewServlet
        //后台账号密码
        Map<String, String> initParameters=new HashMap<>();
        //增加配置
        initParameters.put("loginUsername","admin");
        initParameters.put("loginPassword","admin");
        //允许谁能访问
        initParameters.put("allow","");
        //禁止谁能访问
        //initParameters.put("deny","192.168.11.11");
        initParameters.put("deny","192.168.11.11");
        //设置初始化参数
        bean.setInitParameters(initParameters);
        return bean;
    }

    //配置过滤器
    @Bean
    public FilterRegistrationBean webStatServlet(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, String> initParameters=new HashMap<>();
        //增加配置 这些不过滤
        initParameters.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;
    }

}