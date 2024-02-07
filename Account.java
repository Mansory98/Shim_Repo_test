package objectClass;
//은행계좌(통장) 클래스
public class Account { //클래스 이름 : Account
	//멤버변수(필드, 속성) : 내 클래스안에 정의된 변수
	static final String BANKNAME="신한은행"; // final 타입을 이용해 변수를 상수로 변환. 수정을 막을 때 사용.변수를 상수처리 할 때는 대문자로 표기하자 
//   절대 바꿀수 없음. 클래스 변수는 인스턴트 변수 앞에 static을 붙여 선언 
	String accountNo; //계좌번호 
	String ownerName; //예금주이름 
	int balance; // 통장 잔액
	
	//생성자 (멤버변수와 매서드와 달리 이름을 만들필요없음. 클래스명과 동일하게 설정한다
	
	public Account() {
		
	}
	
	//Source >> Generate constructor...
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


	//예금하는 메서드 deposit
	void deposit (int amount) { //외부로부터 값을 받을 수 있는 밸런스 멤버변수 amount
		balance+=amount;} //+= : 누적명령
	
		
	//인출하는 메서드 withdraw
		
	int withdraw(int amount) throws Exception{	 //throws Exception : 예외처리. 출금한도 넘어가는것 방지
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
		}
	balance-=amount;
	return amount;
	 }
	
	}
	
		
	
	
	

