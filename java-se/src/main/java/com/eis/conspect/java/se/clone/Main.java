package com.eis.conspect.java.se.clone;

import java.util.ArrayList;

/*
	  	** Для клонирования объекта в Java можно пользоваться тремя способами:
		1) Переопределение метода clone() и реализация интерфейса Cloneable();
		2) Использование конструктора копирования;
		3) Использовать для клонирования механизм сериализации



	 	1) Чтобы класс поддерживал возможность клонирование, необходимо: implements Clonable
	 	2) обьекты могут клонироваться сами себя с помощью protected clone();
	 	3) чтобы обьект мог клонировать не себя, а другой обьект, класс второго обьекта должен override PUBLIC clone();
	 	4) при выполнении clone нужно делать явное приведение типов т.к возвращает Object

	 	Существует два вида клонирования:
	 	1) Глубокое (нужно переопределить и выполнить логику)
	 	2) Поверхностное. Происходит копирование значений ее переменных (простого и ссылочного типа - копирование ссылки)

	 */

class Student implements Cloneable {

    private int id = 1000;
    private String name;
    private int age;
    private ArrayList<Byte> markList = new ArrayList<>();

    public ArrayList<Byte> getMarkList() {
        return markList;
    }

    public Student clone() {
        Student copy = null;
        try {
            copy = (Student) super.clone();
            copy.markList = (ArrayList<Byte>) markList.clone();
            // если не сделать этого, то произойдет поверхностное копирование
            // и копия, и клонированный обьект будут ссылатся на ОДИН И ТОТ ЖЕ обьект

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student);
        System.out.println("-----------");

        Student newStudent = student.clone();
        System.out.println(newStudent);
        System.out.println("-----------");

        System.out.println(student.getMarkList() == newStudent.getMarkList());
        System.out.println(student.getMarkList().equals(newStudent.getMarkList()));
    }

}
