/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author Shalitha Suranga
 */
public abstract class Observer {
    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }


    
    abstract void update();
}
