import java.util.*;
class Solution{
	public static void main(String[] args) {
		/**
		At first
		Scanner是一个扫描器，我们录取到键盘的数据，先存到缓存区等待读取。
		next() 遇到任何一个空白符都会终止 空白符例如 空格 换行 tab
		nextLine() 遇到回车符号才会结束
		nextInt()函数在缓冲区中遇到“空格”、“回车符”等空白字符时会将空白字符前的数据读取走，但空白字符不会被处理掉，
		nextLine()函数是在缓冲区中读取一行数据，这行数据以“回车符”为结束标志，nextLine()会把包括回车符在内的数据提走
		*/
		// read1();
		// read2();
		// read3();
		// read4();
		// read6();
		read7();
	}
	/**
	4
	1 2 3 4
	*/
	public static void read1(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
		for(int i:nums) System.out.print(i + " "); 
	}
	/**
	rose lbj hml tj
	*/
	public static void read2(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.trim().split(" ");
		for(String s:strs) System.out.print(s + " ");
	}
	/**
	1 2 3 4 5
	*/
	public static void read3(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.trim().split(" ");
		int[] nums = new int[strs.length];
		for(int i = 0;i<strs.length;i++) nums[i] = Integer.parseInt(strs[i]);
		for(int i:nums) System.out.print(i+" ");
	}
	/**
	3 4
	1 2 3 4
	5 6 7 8
	9 8 7 6
	*/
	public static void read4(){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] nums = new int[m][n];
		for(int i = 0;i<m;i++) for(int j = 0;j<n;j++) nums[i][j] = sc.nextInt();
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++) System.out.print(nums[i][j]+" ");
			System.out.println();
		}
	}
	/**
	rose    
	rando     
	lbj		  
	*/
	public static void read5(){
		Scanner sc = new Scanner(System.in);
		List<String> strs = new ArrayList<String>();
		String str = sc.nextLine();
		while(str!=null && str !=""){
			strs.add(str);
			str = sc.nextLine();
		}
		System.out.println(strs);
	} 
	/**
	3
	rose
	rando
	lbj
	*/
	public static void read6(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();// 很重要，跳到第二行
		String[] strs = new String[n];
		for(int i = 0;i<n;i++) strs[i] = sc.nextLine();
		for(String str:strs) System.out.print(str+" ");
	}
	/**
	3
	1 2 3
	4 5
	6 7 8 0
	*/
	public static void read7(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] strs = new String[n];
		for(int i = 0;i<n;i++) strs[i] = sc.nextLine();
		for(String str:strs) System.out.print(str + " | ");
	}

}