package com.eis.conspect.java.se.override;

import java.io.IOException;


/*
 * 
 * 1 - ����� � �������� ������ ������ ����� �� �� ���������, ��� � � ������������ ������
 * 2 - ����� � �������� ������ ������ ����� ��� �� ����������� ������� ��� ���� (����� ��������� ����������� �������)
 * 3 - ����� � �������� ������ ������ �� ����� ������� ����� Exce[tion ��� ������� Exception ���� (����� ������ exceptions)
 * 4 - ������������ ��� ������ ���� ����� �� ��� SUB (����������) ����� ����. CO VARIANT RETURN TYPE
 * 5 - static �������������� ��� nonstatic ������!
 * 
 */


class SuperCl {

    protected void drive() {}

    public void swim() throws Exception {}

    public void swim2() throws IOException {}

    public void swim3() {}

    String getStr() {return "";}

    Number getNum() {return 1;}

    private void go() {}

    static void stat(){System.out.println("1");}

}

public class OverrideDemo extends SuperCl {

    public void drive() {System.out.println("...");}
//    void drive(){} 									// ������ ����������� �� package-private
//    private void drive(){}

    public void swim() throws IOException {} 			// ������ Exception
//    public void swim() throws Throwable{} 			// ��������� Exception

    public void swim2() {}
//    public void swim2() throws Exception{}

//    public void swim3() throws Exception{}
    public void swim3()throws RuntimeException {} 

    String getStr() {return "Hello";}
//    Integer getStr(){return new Integer(1);}

    Double getNum() {return 10.0;}

    public void go() {}

    static void stat(){System.out.println("11111");}
//    void stat(){System.out.println("11111");}
}