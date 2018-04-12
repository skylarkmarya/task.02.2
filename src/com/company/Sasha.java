package com.company;

public class Sasha {
    Pencil pencil = new Pencil();
    Paper paper = new Paper();
    double count (){
        return pencil.price + paper.price;
    }

}
