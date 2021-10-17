package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(256);
        boss.setColor("Чёрный");
        boss.setBreed("Мафиозник");
        boss.setViews("Томсон");
        System.out.println("Оружие Босса: " + boss.getViews());
    }
}
