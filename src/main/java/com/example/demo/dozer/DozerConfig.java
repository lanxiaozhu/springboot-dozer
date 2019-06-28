package com.example.demo.dozer;

/**
 * @Auther: wishm
 * @Date: 2019/6/18 23:47
 * @Description:
 */

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * 各个模块的dozer配置文件
 */
@Configuration
public class DozerConfig {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozer() {
        //这里是配置文件的路径  多xml 路径(classpath*:dozer/*.xml)
        List<String> mappingFiles = Arrays.asList("dozer/dozer.xml");
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }
}

