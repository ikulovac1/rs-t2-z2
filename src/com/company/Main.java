package com.company;
import java.util.Scanner;
public class Main {

    public static void sumaCifara (int n) {
        int suma=0;
      int x=n;
        while (x!=0){
            suma=suma+(x%10);
            x=x/10;
        }
        for (int i=1; i<=n; i++ ) {
            if(i%suma==0){
                System.out.println(i);
            }
        }
    }
    public static void main (String[] args) {
        int suma=0;

        Scanner ulaz=new Scanner(System.in);
        int n;
        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();
        sumaCifara(n);

    }
}
