public class Main {

    public static void main(String[] args) {
    
    }

    static boolean getTwoNumber(int a, int b) {
        int z;
        z = a + b;
        if( z >= 10 & z <= 10) {
            return true;
        } else return false;
    }

    static void PositiveOrNegativeNumber(int a) {
        if(a >= 0) {
            System.out.println("Положительное число");
        } else System.out.println("Отрицательное число");
    }
    static boolean WhatIsNumber(int a) {
        if(a >= 0) {
            return false;
        } else return true;
    }
    static void StringWrriter(int a, String b) {
        for(int i = 0; i < a; i++){
            System.out.println(b);
        }
    }
    static boolean YearOfTheYear(int year) {
        int visok = year % 4;
        int g = year % 100;
        int x400 = year % 400;
        if(visok == 0 & g != 0 || x400 == 0 ) {
            return true;
        } else return false;
    }
}
