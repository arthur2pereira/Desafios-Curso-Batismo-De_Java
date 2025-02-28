package DesafioSeis;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> listDeNinjas = new LinkedList<Ninja>();

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("listDeNinjas = " + listDeNinjas);

        System.out.println("===========================================");

        for (Ninja ninja : listDeNinjas ) {
            System.out.println(ninja);
        }
        listDeNinjas.addFirst(new Ninja("Rock Lee", 15, "Konoha"));

        System.out.println("===========================================");

        for (Ninja ninja : listDeNinjas ) {
            System.out.println(ninja);
        }

        System.out.println("===========================================");

        Ninja removido = listDeNinjas.removeFirst();
        System.out.println("removido = " + removido);

        System.out.println("===========================================");

        for (Ninja ninja : listDeNinjas ) {
            System.out.println(ninja);
        }

        System.out.println("===========================================");
        
        Ninja sextoNinja = listDeNinjas.get(6);
        System.out.println("sextoNinja = " + sextoNinja);        
    }
}
