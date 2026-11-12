package net.lecnam.ecue2.tp7;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Execute {

    public static void main(String[] args) {

        exercice1();

        exercice2();

        exercice3();

        exercice4();

        exercice5();

        exercice6();


    }

    private static void exercice1() {
        Nuancier nuancier = new Nuancier();
        List<String> couleurs = nuancier.getCouleurs();

        // Afficher le nombre d'éléments (7)
        System.out.println("Nombre d'éléments : " + couleurs.size());
        System.out.println("----------------");

        // 1er parcours : boucle for classique
        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }
        System.out.println("----------------");

        // 2ème parcours : boucle foreach
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
        System.out.println("----------------");

        // 3ème parcours : Iterator
        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");

        // Vérifier que "cyan" est en première position
        if ("cyan".equals(couleurs.get(0))) {
            System.out.println("Vérification OK : cyan est bien en première position.");
        }
        System.out.println("----------------");

        // Trier la liste et la parcourir une fois
        Collections.sort(couleurs);
        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }


    private static void exercice2() {



    }

    private static void exercice3() {



    }


    private static void exercice4() {



    }

    private static void exercice5() {



    }

    private static void exercice6() {



    }


}
