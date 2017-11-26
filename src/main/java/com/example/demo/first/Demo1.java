package com.example.demo.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sleepycat.je.log.LogUtils;

public class Demo1 {
//设计一个从1加到10000的方法
	private Integer sum=0;
	private static Integer MAX  =10000;
	private Logger log =LoggerFactory.getLogger(Demo1.class);
	public void plus(){
		
		for(int i =1;i<=MAX;i++){
			sum+=i;
			log.debug("第{}次计算的结果是:{}",i ,sum);
		}
		System.out.println(sum);
		log.debug("最后的结果是:{}",sum);
	}
	public static void main(String[] args) {
		Demo1 demo =new Demo1();
		demo.plus();
	}
}
