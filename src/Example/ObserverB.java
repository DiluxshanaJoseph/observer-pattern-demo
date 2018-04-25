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
public class ObserverB extends Observer {

    public ObserverB(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("ObserverB : state = " + this.subject.getState());
    }
    
}
