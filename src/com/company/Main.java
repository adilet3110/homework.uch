package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Adilet";
        names[1] = "Ulan";
        names[2] = "Ivan";
        for (int i = 0; i < names.length; i++) {


            switch (i) {

                case 0:
                    System.out.println("Good morning " + names[0]);
                    break;
                case 1:
                    System.out.println("Good afternoon " + names[1]);
                    break;
                case 2:
                    System.out.println("Good evening " + names[2]);
                    break;
            }

        }
    }
}

