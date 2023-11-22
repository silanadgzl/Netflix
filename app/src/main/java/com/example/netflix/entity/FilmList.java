package com.example.netflix.entity;
import java.util.ArrayList;

public class FilmList {
    static ArrayList<Film> populer = new ArrayList<>();
    static ArrayList<Film> gundemdekiler = new ArrayList<>();
    static ArrayList<Film> yenidenIzle = new ArrayList<>();


    public static ArrayList<Film> getGundemdekiler() {
        Film g1 = new Film(1,"resim7");
        Film g2 = new Film(2,"resim8");
        Film g3 = new Film(3,"resim9");
        Film g4 = new Film(4,"resim10");
        Film g5 = new Film(5,"resim11");
        Film g6 = new Film(6,"resim12");
        gundemdekiler.add(g1);
        gundemdekiler.add(g2);
        gundemdekiler.add(g3);
        gundemdekiler.add(g4);
        gundemdekiler.add(g5);
        gundemdekiler.add(g6);
        return gundemdekiler;
    }


    public static ArrayList<Film> getPopuler() {
        Film p1 = new Film(1,"resim1");
        Film p2 = new Film(2,"resim2");
        Film p3 = new Film(3,"resim6");
        Film p4 = new Film(4,"resim5");
        Film p5 = new Film(5,"resim3");
        Film p6 = new Film(6,"resim4");
        populer.add(p1);
        populer.add(p2);
        populer.add(p3);
        populer.add(p4);
        populer.add(p5);
        populer.add(p6);
        return populer;
    }


    public static ArrayList<Film> getYenidenIzle() {
        Film y1 = new Film(1,"resim13");
        Film y2 = new Film(2,"resim14");
        Film y3 = new Film(3,"resim15");
        Film y4 = new Film(4,"resim16");
        Film y5 = new Film(5,"resim17");
        Film y6 = new Film(6,"resim18");
        yenidenIzle.add(y1);
        yenidenIzle.add(y2);
        yenidenIzle.add(y3);
        yenidenIzle.add(y4);
        yenidenIzle.add(y5);
        yenidenIzle.add(y6);
        return yenidenIzle;
    }




}
