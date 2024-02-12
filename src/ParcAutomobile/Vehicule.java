package ParcAutomobile;

import java.util.concurrent.atomic.AtomicInteger;

public class Vehicule {

    private int matricule;
    private String immatruculation;
    private int année;
    private String modèle;
    private int Prix;

    public String Démarer() {
        return "Le Véhicule Démarre";
    }

    public String Freiner() {
        return "Le Véhicule Freine";
    }

    public String Arret() {
        return "Le Véhicule s'arrete";
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
        public String getImmatruculation () {
            return immatruculation;
        }

        public void setImmatruculation (String immatruculation){
            this.immatruculation = immatruculation;
        }

        public int getAnnée () {
            return année;
        }

        public void setAnnée ( int année){
            this.année = année;
        }

        public String getModèle () {
            return modèle;
        }

        public void setModèle (String modèle){
            this.modèle = modèle;
        }

        public int getPrix () {
            return Prix;
        }

        public void setPrix ( int prix){
            Prix = prix;
        }
    }

