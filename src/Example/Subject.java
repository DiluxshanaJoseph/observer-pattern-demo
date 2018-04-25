/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.util.ArrayList;

/**
 *
 * @author Shalitha Suranga
 */
public class Subject {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    int state = 0;
    
    void attach(Observer o) {
        this.observers.add(o);
    }
    
    void detach(Observer o) {
        this.observers.remove(o);
    }

    public int getState() {
        return state;
    }
    
    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    void notifyAllObservers() {
        for(Observer o : this.observers){
            o.update();
        }
    }
}
