package cn.practice;

import java.util.*;

public class TestLambda {

	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//		primes.stream().map(n -> n*n-(int)(Math.random()*50)).forEach(System.out::println);
		primes.stream().map(n -> doSomething(n)).forEach(System.out::println);
//		System.out.println("Hello world !");
	}
	private static String doSomething(Integer n){
//		System.out.println(i);
		String s = n+"!=1";
		long x = 1;
//		List<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			s+="*"+i;
			x*=i;
		}
		return s+"="+x;
	}
}
