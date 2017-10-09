package com.company.service;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * Created by f.putra on 2/16/2017.
 */
@Service
public class InfoService {

    public DataSource getDs(){
        ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
        BasicDataSource ds = (BasicDataSource) context.getBean("dataSource");
        return ds;
    }
}
