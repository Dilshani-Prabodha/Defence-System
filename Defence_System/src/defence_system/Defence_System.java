/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence_system;

/**
 *
 * @author Dilshani
 */
public class Defence_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Helicopter helicopter = new Helicopter();
        helicopter.setVisible(true);
        
        Submarine submarine = new Submarine();
        submarine.setVisible(true);
        
        Tank tank = new Tank();
        tank.setVisible(true);
        
        Observable observable = new Observable();
        observable.addObserver(helicopter);
        observable.addObserver(tank);
        observable.addObserver(submarine);
        
        new MainController(observable).setVisible(true);
    }
    
}
