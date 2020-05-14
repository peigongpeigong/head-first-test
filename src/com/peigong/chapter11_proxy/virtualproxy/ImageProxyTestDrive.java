package com.peigong.chapter11_proxy.virtualproxy;

import javax.swing.*;
import java.net.URL;

/**
 * @author: lilei
 * @create: 2020-05-14 11:16
 **/
public class ImageProxyTestDrive {

    public static void main(String[] args) throws Exception {
        Icon icon = new ImageProxy(new URL("https://vthumb.ykimg.com/054104085A520F0900000114110CC95C.jpg"));
        ImageComponent imageComponent = new ImageComponent(icon);
        JFrame frame = new JFrame("CD Cover Viewer");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

}
