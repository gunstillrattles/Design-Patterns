package kz.narxoz.patterns.command;

import kz.narxoz.patterns.command.editor.Editor;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
