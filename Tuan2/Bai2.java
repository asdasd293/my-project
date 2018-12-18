package Tuan2;

import java.util.*;

public class Bai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        String num = input.nextLine();
        System.out.print("Ket Qua: ");
        for(int i=0; i<num.length(); i++){
            System.out.print(num.charAt(i));
            System.out.print("   ");
        }
    }
}
