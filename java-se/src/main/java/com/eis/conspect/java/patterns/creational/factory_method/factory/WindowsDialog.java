package com.eis.conspect.java.patterns.creational.factory_method.factory;

import com.eis.conspect.java.patterns.creational.factory_method.entity.Button;
import com.eis.conspect.java.patterns.creational.factory_method.entity.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
