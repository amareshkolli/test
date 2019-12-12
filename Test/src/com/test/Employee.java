package com.test;

public class Employee implements I2 {

	public Integer cm1() {
		return null;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

class child extends Employee {

//	@Override
	public Integer cm1() {
		return null;
	}

}

interface I1 {
	public void m1();
}

interface I2 extends I1 {
	public void m2();
}
