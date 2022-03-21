package Caerang.src.lec01;

import java.util.Scanner;

import static java.lang.System.*;

public class b2884 {
    public static void main(String[] args){
        System.out.println("Scan H and M");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();

        if (m >= 45) {
            m -= 45;
        }
        if(m == 0){
            m += 15;
            h -= 1;
            if(h<=1){
                h = 24;
            }
        }
        else {
            m += 15;
            h -= 1;
            if(h<=1){
                h = 24;
            }
        }
        System.out.println(h+" "+m);
    }
}

