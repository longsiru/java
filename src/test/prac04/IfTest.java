package test.prac04;
/*
 * 说明：
 * 1.else结构是可选的。
 * 2.针对于条件表达式：
 * 		如果多个条件表达式之间是互斥的关系（没有交集），哪个判断和执行语句在上面都无所谓。
 * 		如果多个条件表达式之间是有交集的关系，需要根据实际情况考虑清楚，应该将哪个结构声明在上面。
 * 		如果多个条件表达式有包含关系的话，通常情况下，需要将小范围的声明在范围大的上面。否则范围小的就没有机会实行了。不会报错只是没办法实行。
 */
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入月小鹏的成绩");
		int score = scan.nextInt();
		
		if(score == 100) {
			System.out.println("奖励宝马");
		}else if(80 < score&& score <= 90) {
			System.out.println("奖励手机");
		}else if (score >= 60 && score <= 80) {
			System.out.println("ipad");
		}else {
			System.out.println("nothing");
		}
		

	}

}
