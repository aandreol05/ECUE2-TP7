package net.lecnam.ecue2.tp7.nuancier;

import java.util.ArrayList;
import java.util.List;

public class Nuancier {

    // Déclaration sans initialisation
    private List<String> couleurs;

    public Nuancier() {
        // Initialisation avec une ArrayList
        this.couleurs = new ArrayList<>();

        // Ajout des couleurs
        this.couleurs.add("noir");
        this.couleurs.add("rouge");
        this.couleurs.add("vert");
        this.couleurs.add("marron");
        this.couleurs.add("blanc");

        // Ajout d'un doublon (autorisé dans une List)
        this.couleurs.add("rouge");

        // Insertion en première position (index 0) sans modifier le code précédent
        this.couleurs.add(0, "cyan");
    }

    public List<String> getCouleurs() {
        return couleurs;
    }
}