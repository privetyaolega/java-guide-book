package com.eis.conspect.java.patterns.creational.abstract_factory.app;

import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.Button;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.eis.conspect.java.patterns.creational.abstract_factory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
