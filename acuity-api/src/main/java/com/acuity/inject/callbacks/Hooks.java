package com.acuity.inject.callbacks;

/**
 * Created by Zachary Herridge on 6/7/2017.
 */
public class Hooks {

    public static void callHook(String name, int index, Object object){
        System.out.println("HOOKS callHook(" + name + ", " + index + ", " + object + ")");
    }
}