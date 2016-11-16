package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B209 on 11/12/2016.
 */
public class MyMethod {

    /*public static int getNumbSubjects(boolean student, boolean work) {
        int numbSubjects = 6;

        if (work) {
            numbSubjects = 6;

        } else if (!student && !work) {
            numbSubjects = 5;
        } else {
            numbSubjects = 7;
        }

        return numbSubjects;*/

   /*public static int getNumb() {
        int student;

        switch (student) {
            case 1:
                System.out.println("Regular Student");
                break;
            default:
                System.out.println("not regular");
                break;


        }
        }*/

    /*public static String looper(int counter) {
        int num = 1;
        String printThis = "";
        while (num <= counter) {

            printThis += "[" + num + "]";
            num++;


        }
        return printThis;*/


   /* public static int sixInt() {
        int num = 1;
        int sum = 0;

        while (num <= 6) {
            sum += num;
            num++;
        }
        return sum;

    }*/

    /*public static int doWhile(int n) {
        int num = n;
        int output = 1;

        do {
            System.out.print("[" + output + "]");
            output++;

        }
        while (output <= n);
        return output;


    }*/

    public static String myFriends() {
        List<String> Flist = new ArrayList<String>();

        Random rand = new Random();
        int getRandamNum = rand.nextInt(2);

        Flist.add("Joshua");
        Flist.add("Marlon");
        Flist.add("Richard");
        Flist.add("Larrobis");
        Flist.add("Vens");

        return Flist.get(getRandamNum);
    }

        public static String relationships() {
            List<String> Rlist = new ArrayList<String>();

            Random rand = new Random();
            int getRandamNum = rand.nextInt(2);

            Rlist.add(" Love ");
            Rlist.add(" Hate ");
            Rlist.add(" Misses ");
            Rlist.add(" Cheat ");
            Rlist.add(" Kiss ");

            return Rlist.get(getRandamNum);
        }

    public static String girlfriends() {
        List<String> Glist = new ArrayList<String>();

        Random rand = new Random();
        int getRandamNum = rand.nextInt(2);

        Glist.add ("Taylor");
        Glist.add("Sarah");
        Glist.add("Lee Min Ho");
        Glist.add("Camille ");
        Glist.add("Olivia Culpo");

        return Glist.get(getRandamNum);
    }










}



