package com.eis.conspect.java.patterns.behavioral.controller.components;

import com.eis.conspect.java.patterns.behavioral.controller.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}