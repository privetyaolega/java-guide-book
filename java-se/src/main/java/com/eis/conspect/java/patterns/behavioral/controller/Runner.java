package com.eis.conspect.java.patterns.behavioral.controller;

import com.eis.conspect.java.patterns.behavioral.controller.components.*;
import com.eis.conspect.java.patterns.behavioral.controller.mediator.Editor;
import com.eis.conspect.java.patterns.behavioral.controller.mediator.Mediator;

import javax.swing.*;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Runner {

    public static void main(String[] args) {

        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}