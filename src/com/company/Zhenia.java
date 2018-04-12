package com.company;

public class Zhenia {
    Pencil pencil = new Pencil();
    Paper paper = new Paper();
    Stapler stapler = new Stapler();
    double count (){
        return pencil.price + paper.price + stapler.price;
    }
}
