package com.selenium.class03;

class Box<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T dataFromUser) {
		data = dataFromUser;
	}
}

public class GenericConcept {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setData(40);
		System.out.println(b1.getData());

		Box<String> b2 = new Box<String>();
		b2.setData("Hello!");
		System.out.println(b2.getData());
	}
}
