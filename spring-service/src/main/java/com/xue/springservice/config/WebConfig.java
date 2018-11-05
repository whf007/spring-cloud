package com.xue.springservice.config;/**
 * Created by Administrator on 2018/11/5.
 */

import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: spring-cloud
 * @description:
 * @author: whf
 * @create: on 2018/11/5.
 **/
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { registry.addResourceHandler("/webjars/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/webjars/");
        //注：ResourceUtils.CLASSPATH_URL_PREFIX就是"classpath:",如果不加这个，就会提示找不到资源
        super.addResourceHandlers(registry);
    }

}
