package com.qin.kt04;

/**
 * Created by Qin on 2017/9/29.
 */
public class ConsoleParamInJava {
    public static void main(String... args) {
        for (String arg : args) {
            String[] splits = arg.split("_");
            for (String split : splits) {
                System.out.print(split);
                System.out.print(" ");
            }
        }
    }
}
