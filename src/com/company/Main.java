package com.company;

public class Main {
    public static void main(String[] args) {
        Sasha sasha = new Sasha();
        Masha masha = new Masha();
        Zhenia zhenia = new Zhenia();

        System.out.println("Price of stationary each manager:");
        System.out.println("Sasha: pencil, paper, total cost - " + sasha.count()+"; ");
        System.out.println("Masha: pencil, paper, pen, total cost - " + masha.count()+"; ");
        System.out.println("Zhenia: pencil, paper, stapler, total cost - "+zhenia.count()+"; ");
    }
}
