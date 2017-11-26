package com.example.demo.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Demo1 {
//设计一个从1加到10000的方法
	private Integer sum=0;
	private static Integer MIN=1;
	private static Integer MAX  =3000;
	private Logger log =LoggerFactory.getLogger(Demo1.class);
	public void plus(){
		Long a =System.currentTimeMillis();
		System.out.println("starting@@@@@");
		for(int i =MIN;i<=MAX;i++){
			sum+=i;
			log.debug("第{}次计算的结果是:{}",i ,sum);
		}
		System.out.println(sum);
		log.debug("最后的结果是:{}",sum);
		Long b =System.currentTimeMillis();
		System.out.println("ending@@@@@"+(b-a)/1000+"sec");
	}
	public static void main(String[] args) {
		Demo1 demo =new Demo1();
		demo.plus();
	}
}
