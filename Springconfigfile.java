package in.smartprogramming.Spjdbcfirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Springconfigfile {
	@Bean
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ spring_jdbc_db");
		dataSource.setUsername("root");
		dataSource.setPassword("Vikash@484");
		
		
		return dataSource;
	}

    @Bean 
	public JdbcTemplate  myjdbcTemplate()
	{
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	
    	jdbcTemplate.setDataSource(myDataSource());
    	return jdbcTemplate;
}
}
	


