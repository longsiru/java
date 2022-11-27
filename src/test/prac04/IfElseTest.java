package test.prac04;
/*
 * 分支结构中的if-else（条件判断结构）。
 * if的三种格式：1.if(条件表达式){
 * 						执行代码块
 * 				  }
 * 
 * 				2.if(条件表达式){
 * 						执行代码块1
 * 				  }else{
 * 						执行代码块2
 * 				  }
 * 
 * 				3.if(条件表达式){
 * 						执行代码块1
 * 				  }else if(条件表达式){
 * 						执行代码块1}...
 * 				   else{
 * 						执行代码块n
 * 				  }
 */
public class IfElseTest {

	public static void main(String[] args) {
		//举例1
		int hearBeats = 79;
		if(hearBeats < 60 || hearBeats > 100) {
			System.out.println("您需要进一步检查");
		}
		System.out.println("您检查结束，您很健康，请继续保持");
		
		//举例2
		int age = 23;
		if(age < 18) {
			System.out.println("你还可以看动画片");
		}else {
			System.out.println("你已经成年了");
		
		}
		
		
		//举例3
		if(age < 0) {
			System.out.println("你输入的年龄非法");
		}else if(age < 18) {
			System.out.println("青少年时期");
		}else if(age < 35) {
			System.out.println("青壮年时期");
		}else if (age < 60) {
			System.out.println("中年时期");
		}else if(age < 120){
			System.out.println("老年时期");
		}else {
			System.out.println("你要成仙了");
		}
		

	}

}
