package Caerang.src.lec01;

import java.util.Scanner;

public class b2530 {
    public static void main(String[] args){
        System.out.println("시 분 초 단위로 입력하세요>");
        Scanner input = new Scanner(System.in);
        int h = input.nextInt(); // hour
        int m = input.nextInt(); // minute
        int s = input.nextInt(); // second
        
        int a = input.nextInt();
        a += s;
        
        h =% 24;
        m =% 60;
        s %= 60;
        
    }
}

