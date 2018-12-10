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
public class ProgressThread extends Thread{
JProgressBar progress;

public ProgressThread(JProgressBar progress1){
        super();
        this.progress=progress1;
       
            }
    public void run(){
            for (int i = 1; i<= 100; i++){
                progress.setValue(i);
                pausa(100);

            }
    }


    private void pausa(int mlSeg) {
   try{
    Thread.sleep(mlSeg);          
       }
       catch(Exception e){}
    
    }
    
}