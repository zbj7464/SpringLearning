package sub.spring.tx.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import sub.spring.tx.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {

	private JdbcTemplate jdbcTemplate;
	
public void setDataSource(DriverManagerDataSource dataSource){
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ?,modtime = sysdate where name = ?";
		System.out.println(out+" transfer out " + money);
		jdbcTemplate.update(sql,money,out);

	}

	@Override
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ?, modtime = sysdatewhere name = ?";
		System.out.println(in+" transfer in " + money);
		jdbcTemplate.update(sql,money,in);

	}
	

}
