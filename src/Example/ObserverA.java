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
public class ObserverA extends Observer {

    public ObserverA(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    void update() {
           System.out.println("ObserverA : state = " + this.subject.getState());
    }
    
}
