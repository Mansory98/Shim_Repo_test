package objectClass;
//�������(����) Ŭ����
public class Account { //Ŭ���� �̸� : Account
	//�������(�ʵ�, �Ӽ�) : �� Ŭ�����ȿ� ���ǵ� ����
	static final String BANKNAME="��������"; // final Ÿ���� �̿��� ������ ����� ��ȯ. ������ ���� �� ���.������ ���ó�� �� ���� �빮�ڷ� ǥ������ 
//   ���� �ٲܼ� ����. Ŭ���� ������ �ν���Ʈ ���� �տ� static�� �ٿ� ���� 
	String accountNo; //���¹�ȣ 
	String ownerName; //�������̸� 
	int balance; // ���� �ܾ�
	
	//������ (��������� �ż���� �޸� �̸��� �����ʿ����. Ŭ������� �����ϰ� �����Ѵ�
	
	public Account() {
		
	}
	
	//Source >> Generate constructor...
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


	//�����ϴ� �޼��� deposit
	void deposit (int amount) { //�ܺηκ��� ���� ���� �� �ִ� �뷱�� ������� amount
		balance+=amount;} //+= : �������
	
		
	//�����ϴ� �޼��� withdraw
		
	int withdraw(int amount) throws Exception{	 //throws Exception : ����ó��. ����ѵ� �Ѿ�°� ����
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	balance-=amount;
	return amount;
	 }
	
	}
	
		
	
	
	

