package com.eis.conspect.java.patterns.behavioral.command.commands;

import com.eis.conspect.java.patterns.behavioral.command.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
