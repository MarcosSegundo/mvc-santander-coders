package br.com.controller;

public abstract class Controller<T, E> {
    protected T model;
    protected E view;

    public Controller(T model, E view) {
        this.model = model;
        this.view = view;
    }

    public abstract void atualizarView();
}
