package com.runnerclass;

import com.pojo.PojoA;

public class PojoB {

	public static void main(String[] args) {

		PojoA a = new PojoA();

		String name = a.getName();

		System.out.println("Before setters : " + name);

		a.setName("AJ");

		String name0 = a.getName();

		System.out.println("After setters : " + name0);

	}

}