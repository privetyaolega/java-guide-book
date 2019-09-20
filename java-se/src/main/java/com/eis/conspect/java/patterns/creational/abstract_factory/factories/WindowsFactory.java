package com.eis.conspect.java.patterns.creational.abstract_factory.factories;

import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.Button;
import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.WindowsButton;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
