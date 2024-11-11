package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        return (clock >= 0 && clock <= 23) && (isBarking && (clock >= 20 || clock < 8));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        // yas 13 ile 19 arasinda ise true don
        return  (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        // yaz mevsimi degilse 25-35 arasi sicaklik oyun oynanir
        if (!isSummer) {
            return temp >= 25 && temp <= 35;
        }
        // yaz mevsimi ise 25-45 arasi sicaklik oyun oynanir
        return temp >= 25 && temp <= 45;
    }

    public static double area(double width, double height) {
        if ( height <0 || width < 0) {
            return -1; //neg. hata kodu
        }
        return height * width; //alan hesabi dondur.
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI; //alani hesapla dondur.
    }
}
