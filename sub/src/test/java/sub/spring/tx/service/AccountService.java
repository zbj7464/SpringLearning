package sub.spring.tx.service;

public interface AccountService {
	/**
	 * 
	 * @param out	:ת���˺�
	 * @param in	��ת���˺�
	 * @param money ��ת�˽��
	 */
	public void transfer(String out,String in,Double money);
}
