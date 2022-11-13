package kz.narxoz.patterns.mediator;

import kz.narxoz.patterns.mediator.components.*;
import kz.narxoz.patterns.mediator.mediators.Editor;
import kz.narxoz.patterns.mediator.mediators.Mediator;

import javax.swing.*;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Application {
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
