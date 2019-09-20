package com.eis.conspect.java.patterns.creational.abstract_factory.factories;

import com.eis.conspect.java.patterns.creational.abstract_factory.buttons.Button;
import com.eis.conspect.java.patterns.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}