package com.eis.conspect.java.se.overloading;

public class Main1 {

	public static void main(String[] args) {
		
		/*
		 * 		����� - �������� ������� ���������������� ����, ��� ������ ����������� ������ ������
		    � ���������� ��� ������ ������ ������ � ����� ��������� � ���� ���������
		
			��������� ������ - ��� ������ + ���������.
			
			����� ���������� �������������� ���� ���������� ��������� ��� ������ � ����� ������ � ������ ������� ����������.
			����� ����������� ������������ �������, �������������, ������������ ���, ����������.
			
			����������� ������ ����� ������������� �������������� � �������� ��� �����������.
			���������� �������� � ������ ������ ������.
			
		*/

		Main1 hello = new Main1();
		hello.helloWorld();
		hello.helloWorld("Oleg");
		
		
		
	}

	private void helloWorld() {
		System.out.println("Hello world!");
	}
	
	private void helloWorld(String name){
		System.out.println("Hello world! From " + name);
	}
	
	
	
}
