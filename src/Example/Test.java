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
public class Test {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new ObserverA(sub);
        new ObserverB(sub);
        new ObserverC(sub);
        
        sub.setState(10);
    }
}
