package com.eis.conspect.java.patterns.creational.factory_method;

import com.eis.conspect.java.patterns.creational.factory_method.entity.Button;
import com.eis.conspect.java.patterns.creational.factory_method.factory.WindowsDialog;

public class Runner {

    public static void main(String[] args) {

        Button button = new WindowsDialog().createButton();
        button.render();

    }
}
