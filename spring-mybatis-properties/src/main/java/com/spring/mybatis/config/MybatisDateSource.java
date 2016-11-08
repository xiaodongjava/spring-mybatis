package com.spring.mybatis.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan("com.spring.mybatis.domain.mapper")
public class MybatisDateSource {
	@Value("${jdbc.driver}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String userName;
	@Value("${jdbc.password}")
	private String password;

	/**
	 * 创建数据源
	 * 
	 * @return
	 */
	@Bean(initMethod = "init", destroyMethod = "close")
	public DruidDataSource createDataSource() {
		DruidDataSource source = new DruidDataSource();
		source.setDriverClassName(driverClassName);
		source.setUrl(url);
		source.setUsername(userName);
		source.setPassword(password);
		return source;
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception{
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setDataSource(createDataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sfb.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
		return sfb;
	}
	
	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
