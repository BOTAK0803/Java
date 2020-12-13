import java.util.*;
class Solution{
	/**
	String,StringBuilder,StringBuffer的区别
	- 运行速度：StringBuilder > StringBuffer > String
		String最慢的原因是：String为字符串常量，但是StringBuilder和StringBuffer均为字符串变量，也就是说String字符串常量一旦经过创建之后就不可以修改了，但是后两者是变量，是可以进行修改的。
	- 线程安全:在线程方面StringBuilder是线程不安全的，StringBuffer是线程安全的

	- 总结：
		String适用于少量字符串操作的情况
		StringBuilder：适用于单线程下，在字符串缓冲区进行大量操作的情况
		StringBuffer：适用于多线程下在字符串缓冲区进行大量操作的情况。

	*/
	public static void main(String[] args) {
		testTime();
	}
	public static void testTime(){
		/**
		下面代码块中的代码，会输出"hello world"，看起来是初始的str对象被修改了，但是，其实上这只是一种假象，JVM对于字符串常量的修改是这样进行的
			首先，我们创建了一个字符串常量str，并且赋值给字符串常量str
			在str进行"+"号的时候，其实从本质上而言，JVM又创建了一个字符串常量str，然后把相加之后的值赋予给新的str字符串常量，而原来的str会被JVM的垃圾回收机制(GC)回收.
			相比而言，StringBuilder和StringBuffer的对象是变量，对变量的操作就是直接对对象进行相应的修改，而不涉及回收以及创建的操作，所以速度会比较慢。
		*/
		//----------------------------------------
		long start1=System.nanoTime();   //获取开始时间
		String str = "hello ";
		str = str+"world";
		long end1=System.nanoTime(); //获取结束时间
		System.out.println("String +"+(end1-start1)+"ns");
		System.out.println(str);
		//----------------------------------------
		long start2=System.nanoTime(); 
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" world");
		long end2=System.nanoTime();
		System.out.println("StringBuilder sb "+(end2-start2)+"ns");
		System.out.println(sb.toString());
		//----------------------------------------
		long start3=System.nanoTime(); 
		StringBuffer sb2 = new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		long end3=System.nanoTime();
		System.out.println("StringBuffer sb2 "+(end3-start3)+"ns");
		System.out.println(sb2.toString());
	}
	public static void testThreadSecurity(){
		/**
		在线程方面StringBuilder是线程不安全的，StringBuffer是线程安全的
		*/

	}
}