package com.eis.conspect.java.patterns.behavioral.command;

import com.eis.conspect.java.patterns.behavioral.command.editor.Editor;

public class Runner {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}