/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splash;

import javax.swing.JProgressBar;

/**
 *
 * @author Les
 */
public class cargar extends Thread{
    JProgressBar progress;
    public cargar (JProgressBar progress){
        super();
        this.progress = progress;
    }
    @Override
    public void run(){
        for(int i = 1; i<= 100; i++){
            progress.setValue(i);
        pausa(100);
    }
    
}
public void pausa(int mlSeg) {
    try{
        Thread.sleep(mlSeg);
}
    catch (Exception e){

        }

    }
}