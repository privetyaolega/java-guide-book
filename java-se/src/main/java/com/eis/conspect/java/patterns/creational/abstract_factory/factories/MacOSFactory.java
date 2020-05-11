package com.eis.conspect.java.patterns.creational.abstract_factory.factories;

import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.Button;
import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.MacOSButton;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
