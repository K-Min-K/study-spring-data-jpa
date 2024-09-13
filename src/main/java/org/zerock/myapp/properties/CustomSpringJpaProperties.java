package org.zerock.myapp.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.jpa")
public class CustomSpringJpaProperties {

    private String database;
    private String hibernateDdlAuto;
    private String generateDdl;
    private String showSql;
    private String propertiesHibernateFormat_sql;
    private String propertiesHibernateTransactionJtaPlatform;
    private String deferDatasourceInitialization;
    private String hibernateNamingImplicitStrategy;
    private String hibernateNamingPhysicalStrategy;
    private String openInView;

} // end class
