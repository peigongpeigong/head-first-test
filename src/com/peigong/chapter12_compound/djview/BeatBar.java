package com.peigong.chapter12_compound.djview;

import javax.swing.*;

/**
 * @author: lilei
 * @create: 2020-05-15 14:24
 **/
public class BeatBar extends JProgressBar implements Runnable {

    private JProgressBar progressBar;
    private Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for(;;){
            int value = getValue();
            value = (int) (value * 0.75);
            setValue(value);
            repaint();
            try {
                thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
