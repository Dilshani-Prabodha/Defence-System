/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defence_system;

/**
 *
 * @author Dilshani
 */
public interface Observer {
    public void clear(boolean clear);
    public void message(String msg, boolean checkSend, int index);
    public void strenth(int stren);
 
}
