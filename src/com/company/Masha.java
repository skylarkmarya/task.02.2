package com.company;

public class Masha {
    Pencil pencil = new Pencil();
    Paper paper = new Paper();
    Pen pen = new Pen();
    double count (){
        return pencil.price + paper.price + pen.price;
    }
}
