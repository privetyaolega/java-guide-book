package com.eis.conspect.java.patterns.creational.abstract_factory;

import com.eis.conspect.java.patterns.creational.abstract_factory.app.Application;
import com.eis.conspect.java.patterns.creational.abstract_factory.factories.GUIFactory;
import com.eis.conspect.java.patterns.creational.abstract_factory.factories.MacOSFactory;
import com.eis.conspect.java.patterns.creational.abstract_factory.factories.WindowsFactory;

public class Runner {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {

        boolean isAppMac = System.getProperty("os.name").toLowerCase().contains("windows");
        System.out.printf("Your operation system is '%s'\n", System.getProperty("os.name"));
        GUIFactory factory = isAppMac ? new WindowsFactory() : new MacOSFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
