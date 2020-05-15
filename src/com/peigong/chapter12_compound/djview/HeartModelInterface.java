package com.peigong.chapter12_compound.djview;

/**
 * @author: lilei
 * @create: 2020-05-15 15:11
 **/
public interface HeartModelInterface {

    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

}
