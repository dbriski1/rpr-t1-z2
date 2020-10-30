package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int a){
        int suma=0;
        do{
            int b=a%10;
            suma+=b;
            a/=10;
        }while(a!=0);
        return suma;
    }
    public static void main(String[] args) {
        
    }
}
