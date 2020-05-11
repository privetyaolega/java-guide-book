package com.eis.conspect.java.patterns.creational.factory_method.factory;

import com.eis.conspect.java.patterns.creational.factory_method.entity.Button;
import com.eis.conspect.java.patterns.creational.factory_method.entity.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
