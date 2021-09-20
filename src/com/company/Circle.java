package com.company;
import java.lang.*;
import java.util.Scanner;
public class Circle {
    private double R =0;
    private double L =0;
    private double D =0;
    private double S =0;
    private double P =0;


    public Circle() {
        System.out.println("Введите значение радиуса окружности");
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        this.R=R;
        L=2*Math.PI*R;
        D=2*R;
        S=Math.PI*R*R;
        P=2*Math.PI*R;
    }

    public double getR(){
        return R;
    }

    public double getL(){
        return L;
    }

    public double getD(){
        return D;
    }

    public double getS(){
        return S;
    }

    public double getP(){
        return P;
    }

}