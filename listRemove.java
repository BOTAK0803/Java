import java.util.*;
class Solution{
	/**
	java list相关的操作：易错点
	- 是在foreach循环list的时候，不能在循环体中用add与remove方法，不然会爆出非法修改错误
	- 在利用for 循环remove的时候，list中的元素会自动向前补齐，会导致元素没有删除完毕的问题，解决的方案主要有倒着遍历以及遍历一个之后修改i
	*/
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};
		for(int i:a) arr.add(i);
		/**
		for(int i:arr){
			System.out.println(i);
			// arr.add(9);
			// arr.remove(1);
		}
		*/
		/**
		出现最后的size不是0的原因是因为，remove之后，后面的元素会自动向前移，在i=i+1的时候，就越过了这个元素，也就是说没有访问这个元素
		*/
		System.out.println("tets 1 ,from 0 to n , before remove , the arr`s length is "+arr.size());
		for(int i = 0;i<arr.size();i++) arr.remove(i);
		System.out.println("test 1 , from 0 to n , after remove , the arr`s length is "+arr.size());
		/**
		解决这个问题，方法1:从n到0进行遍历
		*/
		arr.clear();
		for(int i:a) arr.add(i);
		System.out.println("tets 2 ,from n to 0 , before remove , the arr`s length is "+arr.size());
		for(int i = arr.size() - 1;i>=0;i--) arr.remove(i);
		System.out.println("test 2 , from n to 0 , after remove , the arr`s length is "+arr.size());
		/**
		解决这个问题，方法2:每移除一个元素以后再把i移回来
		*/
		for(int i:a) arr.add(i);
		System.out.println("tets 2 ,from n to 0 , before remove , the arr`s length is "+arr.size());
		for(int i = 0;i<arr.size();i++) {
			arr.remove(i);
			i-=1;
		}
		System.out.println("test 2 , from n to 0 , after remove , the arr`s length is "+arr.size());

		
	}
}