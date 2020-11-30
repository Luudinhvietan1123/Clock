/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hour extends Thread{
    
    private JLabel hourLabel; 
    
    public Hour(JLabel hourLabel) throws InterruptedException{
        this.hourLabel = hourLabel;
        this.start();
    }
    
    public void run(){
        Calendar c = Calendar.getInstance();
        while(true){
            hourLabel.setText(String.valueOf(c.get(Calendar.MINUTE)));
        }
    }
}
