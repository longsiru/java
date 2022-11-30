package test.prac05;

public class FamilyAccount {
	public static void main(String[] args) {
		
		boolean isFlag = true;
		//用于记录用户的收入和支出详情
		String details = "수지조회\t금액\t\t수지금액\t\t설  명\n";
		//初始金额
		int balance = 10000;
		
		while(isFlag) {
			
			System.out.println("-----------------가계부-----------------\n");
			System.out.println("		1 수지조회");
			System.out.println("		2 수입등록");
			System.out.println("		3 지출등록");
			System.out.println("		4  ESC\n");
			System.out.println("		선택하세요(1-4): ");
			
			//获取用户的选择：1-4
			char selection = Utility.readMenuSelection();
			
			switch(selection) {
			case '1':
				//System.out.println("1. 수지명세");
				System.out.println("-----------------현제 수입지출 명세 기록----------------");
				System.out.println(details);
				System.out.println("-------------------------------------------------");
				break;
			case '2':
				//System.out.println("2. 수입등록");
				
				System.out.println("수입 금액： ");
				int money = Utility.readNumber();
				System.out.println("수입 설명： ");
				String info = Utility.readString();
				//处理balance
				balance += money;
				//处理details
				details += ("수입\t" + balance + "\t\t" + money + "\t\t" + info + "\n");
				
				System.out.println("---------------------등록 성공---------------------\n");
				break;
				
			case '3':
				//System.out.println("3. 登记支出");
				System.out.println("지출 금액： ");
				int money1 = Utility.readNumber();
				System.out.println("지출 설명： ");
				String info1 = Utility.readString();
				//处理balance
				if(balance >= money1) {
					balance -= money1;
					//处理details
					details += ("지출\t" + balance + "\t\t" + money1 + "\t\t" + info1+ "\n");
				}else {
					System.out.println("잔액부족, 지불실패!");
				}
				
				System.out.println("---------------------등록 성공---------------------\n");
				break;
				
				
			case '4':
				//System.out.println("4. 退    出");
				System.out.println("Esc(Y/N): ");
				char isExit = Utility.readConfirmSelection();
				if(isExit =='Y') {
					isFlag = false;
				}
				//break;
			}
			
			
			//isFlag = false;
		}
		
		
		
		
		
	}

}
