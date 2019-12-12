package com.cvit.gmall.user.controller;

import java.util.Random;

public class RandomPeople {

    public static void main(String[] args) {
        Random col = new Random();
        Random row = new Random();

        int lie = col.nextInt(5) + 1;
        int hang = row.nextInt(5) + 1;

        System.out.println("有请第"+lie+"列第"+hang+"行");
    }
}
