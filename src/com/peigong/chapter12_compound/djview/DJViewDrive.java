package com.peigong.chapter12_compound.djview;

/**
 * @author: lilei
 * @create: 2020-05-15 15:07
 **/
public class DJViewDrive {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
        /*HeartModel model = new HeartModel();
        ControllerInterface controller = new HeartController(model);*/
    }

}
