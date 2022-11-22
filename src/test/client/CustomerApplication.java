package test.client;

import java.util.ArrayList;

public class CustomerApplication {
	//Customer 객체(고객)를 저장할  ArrayList를 생성
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();

	public static void main(String[] args) {
		//일반 고객(silver)
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		
		//gold customer
		Customer customerHong = new GoldCustomer(10030, "홍길동");    // 자동 변환: parentclass variable = new childclass type
		Customer customerYul = new GoldCustomer(10040, "정약용");  //Customer:Customer type field, new GoldCustomer(10040, "정약용"):child type object 대입.
		
		//vip customer
		Customer customerKim = new VIPCustomer(10050, "이율곡", 12345);
		
		
		//add()메소드로 배열 추가.
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		
		showAllCustomer();
		
		//id로 고객찻기
		Customer customer = findCustomer(10050);  //customer객체를 받는다
		
		//id로 찻은 고객의 실제 지불금액, 보너스 포인트 출력.
		if (customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			// 고객의 실제 지불금액, 보너스 포인트 출력
			showPriceBonus(customer, 10000);  //10000: 상품 가격
		}
		
		
	}
	
	//모든 고객정보 출력
	//main메소드에서 객체를 생성하지 않고 바로 호출하기 위해 static으로 빼준다!
	public static void showAllCustomer() {  //static 객채 생성 안해도 바로 쓸 수 잇다.
		System.out.println("======모든 고객정보 출력======");
		for(Customer customer : customerList) {   // ":" 用来遍历数组中的元素
			System.out.println(customer.showCustomerInfo());
		}
	}
			
	
	//id로 해당 고객객체를 찾아주는 메소드
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		
		for(Customer customer : customerList) {
			//해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교한다
			if(customer.getCustomerID() == customerID) {
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer; //해당 객체를 찾지 못하면 NULL을 리턴해 준다
	}
	
	
	
	
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("====== 해당 고객의 할인율과 보너스 포인트 계산 =====");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점");
	}

}
