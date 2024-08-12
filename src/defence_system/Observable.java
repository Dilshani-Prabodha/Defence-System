/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

import java.util.ArrayList;

/**
 *
 * @author Dilshani
 */
public class Observable {
    private final ArrayList<Observer> observerList = new ArrayList<>();
    
    private boolean clear;
    public String msg;
    private int strenth;
    private boolean checkSend;
    private int index;
    
public void addObserver(Observer ob){
    observerList.add(ob);
}

public void setClear(boolean clear){
    if(this.clear!=clear){
        this.clear=clear;
        notifyDevices1();
    }
}

public void setMsg(String msg, boolean checkSend, int index){
    if(this.msg!=msg){
        this.msg=msg;
        this.index = index;
        this.checkSend=checkSend;
        notifyDevices2();
    }
}

public void setStrenth(int strenth){
    if(this.strenth!=strenth){
        this.strenth=strenth;
        notifyDevices3();
    }
}

public void notifyDevices1(){
    for(Observer ob : observerList){
        ob.clear(clear);
    }
}

public void notifyDevices2(){
    for(Observer ob : observerList){
        ob.message(msg,checkSend,index);
    }
}

public void notifyDevices3(){
    for(Observer ob : observerList){
        ob.strenth(strenth);
    }
}
}

