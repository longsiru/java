package test.prac16.reflection;
/*
 * reflection反射相关的类（重要）：import java.lang.reflect
 * 		1.Class类：用途：代表类的实体，在运行的Java应用程序种表示类和接口。
 * 		2.Field类：用途：代表类的成员变量/类的属性
 * 		3.Method类：用途：代表类的方法
 * 		4.Constructor类：用途：代表类的构造方法
 * 
 * 一、Class类
 * 1.Class类：java文件被编译后，生成了.class文件，JVM此时就要去解读.class，被编译的Java文件.class也被JVM解析为一个对象，这个对象就是java.lang.Class.
 * 			  这样当程序运行时，每个Java文件最终变成了Class类对象的一个实例。
 * 			--通过Java的反射机制应用到这个实例，就可以去获得甚至去添加改变这个类的属性和动作，使得这个类成为一个动态类。
 * 
 * 2.Class类中的相关方法：-getClassLoader(): 获得类的加载器。
 * 						 -getDeclaredClasses(): 返回一个数组，数组中包含该类中所有的类和接口类的对象（包括private).
 * 						 -forName(String className):根据类名返回类的对象。（已明确类的全路径名）。
 * 						 -newInstance():创建类的实例
 * 						 -getName():获得类的完整路径名字
 * 3.在反射之前，我们需要做的第一步就是先拿到当前需要反射的类的class对象，然后铜鼓class对象的核心方法，达到反射的目的。
 * 
 * 
 * 二、Field类
 * 1.常用获得类中属性的相关方法：-getField(String name):获得某个共有的属性对象
 * 							   -getFields():获得所有共有的属性对象
 * 							   -getDeclaredField(String name):获得某个属性对象
 * 							   -getDeclaredFields():获得所有属性对象
 * 
 * 
 */
public class ClassLei {

}
