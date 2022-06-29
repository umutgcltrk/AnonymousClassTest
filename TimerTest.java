package com.company.callBack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) {

        Timer timer = new Timer(1_000,  new ActionListener() { //1 Saniyede 1 "Selaaammmm :)" yazdırıyor.

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selaaammmm :)");
            }

        });
        timer.start();

        //Burada , "Timer" nesnesi bir "İnterface" olan "ActionListener'ı" nesne olarak new leyip geçiyor ve
        //Class scop'u açıyor ardından ActionListener'ın içindeki "actionPerformed" metodunu "override" ediyor.
        //Java da tip olan Interface newlenemez ! ancak tek kullanımlık "event" tarzı olaylarda sanki nesne oluşturuluyormuş
        //gibi newlenir ve interface in içinde olan metot override edilebilir. Buna "Anonymous Class(İsimsiz class)" denir.

    }
}
