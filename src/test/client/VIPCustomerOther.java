package test.client;

public class VIPCustomerOther extends Customer {
	//field
		private int agentID;  //상담원 아이디
		double saleRatio;  //할인비율
		
		
		//생성자
		public VIPCustomerOther(int customerID, String customerName, int agentID) {
			super(customerID, customerName);
			super.customerGrade = "VIP";
			super.bonusRatio = 0.03;
			this.saleRatio = 0.2;
			this.agentID = agentID;
		}

		
		//method
		@Override
		public int calcPrice(int price) {
			bonusPoint += (price * bonusRatio);
			return price - (int)(price * saleRatio);
		}
		
		@Override
		public String showCustomerInfo() {
			return showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
		}
		
		public int getAgentID() {
			return agentID;
		}

}
