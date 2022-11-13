package kz.narxoz.patterns.mediator.components;

import kz.narxoz.patterns.mediator.mediators.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}