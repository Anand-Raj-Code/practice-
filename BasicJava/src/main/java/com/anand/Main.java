package com.anand;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           Sum s1=new Sum();
           System.out.println(s1.m1(11,12));
           Sub s2=new Sub();
           System.out.println(s2.m2(10,2));
           Mul mul=new Mul();
           System.out.println(mul.m3(12,13));
           Divsion div=new Divsion();
           System.out.println(div.devison(15,3));
    }
}