package com.satya.JOOQDemo;

import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
@EnableTransactionManagement
public class JooqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooqDemoApplication.class, args);
	}

	@Autowired
	private DataSource dataSource;

	@Bean
	public DataSourceConnectionProvider connectionProvider() {
		return new DataSourceConnectionProvider
				(new TransactionAwareDataSourceProxy(dataSource));
	}

//	@Bean
//	public DefaultDSLContext dsl() {
//		return new DefaultDSLContext(configuration());
//	}
//
//	public DefaultConfiguration configuration() {
//		DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
//		jooqConfiguration.set(connectionProvider());
//		jooqConfiguration
//				.set(new DefaultExecuteListenerProvider(exceptionTransformer()));
//
//		return jooqConfiguration;
//	}


}
