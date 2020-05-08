package com.peigong.chapter7_adapter_facade.facade;

/**
 * @author: lilei
 * @create: 2020-05-08 13:14
 **/
public class HomeTheaterFacadeRunner {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                new Amplifier(),new Tuner(),new DvdPlayer(),new CdPlayer(),
                new Projector(),new TheaterLights(),new Screen(),new PopcornPopper()
        );
        homeTheaterFacade.watchMovie("movie");
        homeTheaterFacade.endMovie();
    }

}
