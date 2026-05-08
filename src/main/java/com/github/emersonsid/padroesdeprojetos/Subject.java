package com.github.emersonsid.padroesdeprojetos;

import java.util.ArrayList;

// Subject
public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.atualizar(mensagem);
        }
    }
}
