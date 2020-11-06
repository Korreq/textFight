package Klasy;

import java.util.Random;

public class Rolls {

    Random rand = new Random();


    public void roll(int n){
        int go = rand.nextInt(n);
        System.out.println("Twój wynik na k"+n+" wynosi:"+go);

    }

}
