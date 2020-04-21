package sub.spring.tx.service.impl;

import sub.spring.tx.dao.AccountDao;
import sub.spring.tx.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
}
