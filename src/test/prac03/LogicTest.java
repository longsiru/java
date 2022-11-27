package test.prac03;
/*
 * 逻辑运算符：&， &&， |， ||，！， ^
 * 
 * 说明：1.逻辑运算符操作的都是Boolean类型的变量。
 * 
 */
public class LogicTest {

	public static void main(String[] args) {
	
		//区分&， && = and
		//相同点1： 两者运算结果都是一样的。
		//相同点2： 当符号左边都是true时，二者都会执行右边的运算。
		//不同点： 当符号左边是false时，&继续执行右边的运算，&&则不执行。
		//推荐使用&&
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)) {
			System.out.println("我现在在北京");
		}else {
			System.out.println("我现在在南京");
		}
		System.out.println("num1= " + num1); //num1= 11
		
		
		boolean b2 = true;
		b2= false;
		int num2 = 10;
		if(b2 && (num2++ > 0)) {
			System.out.println("我现在在北京");
		}else {
			System.out.println("我现在在南京");
		}
		System.out.println("num2= " + num2);//num1= 10
		
		
		
		//***************************************************************************************************8
		//区分| ， || = 或
		//相同点1： 两者运算结果都是一样的。
		//相同点2： 当符号左边都是false时，二者都会执行右边的运算。
		//不同点： 当符号左边是true时，|继续执行右边的运算，||则不执行。
		//推荐使用||
		boolean b3 = false;
	    b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)) {
			System.out.println("我现在在北京");
		}else {
			System.out.println("我现在在南京");
		}
		System.out.println("num3= " + num3);  //11
		
		
		boolean b4 = false;
		b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)) {
			System.out.println("我现在在北京");
		}else {
			System.out.println("我现在在南京");
		}
		System.out.println("num4= " + num4); //10
		
		
		
		
		
		
	}

}
