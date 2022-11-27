package test.prac03;
/*
 *比较运算符： ==， ！=， <, > , <=, >=, instanceof(检查是否是类的对象).
 *比较运算符的结果都是布尔值。true和false。 
 *要区分==和=的区别,==:比较， =：赋值比较。
 *
 *
 */
public class CompaeTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i == j); //false
		System.out.println(i = j);  //20
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b2 == b1); //false
		System.out.println(b2 = b1);  //true
		
		
	
	}

}
