package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "welcome to java10";
        Scanner input = new Scanner(System.in);
        System.out.println("nhập kí tự muốn đếm");
        char ch = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của kí tự "+ch+"trong chuỗi là: "+count);
    }

}
