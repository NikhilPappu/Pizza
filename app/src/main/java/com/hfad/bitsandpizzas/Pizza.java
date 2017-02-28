package com.hfad.bitsandpizzas;

/**
 * Created by pappu on 08-01-2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("In a nearby neighbourhood, Find its highest point and take a photo of the view from there. Some research might be necessary. ",R.drawable.diavolo),
            new Pizza("Quick! Some unknown people are in dire need of a song to be written! Dust off any microphone or recording equipment (or use your phone's voice recorder). Write 10 vereses of any length, about a crazy light or bee.",R.drawable.diavolo),
            new Pizza("Play a role plaing video game but before hand imagine a character, note down their personality,likes and dislikes, strengths and weaknesses. Play the video game as if you are this character. This works best for open ended or online games.",R.drawable.funghi),
            new Pizza("Visit an ATM. ",R.drawable.funghi)
    };
    private Pizza(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
}
