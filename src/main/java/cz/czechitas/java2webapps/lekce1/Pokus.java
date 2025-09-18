package cz.czechitas.java2webapps.lekce1;

import java.util.List;

public class Pokus {
    private String jmeno;
    private String prijmeni;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Pokus(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getCeleJmeno() {
        return jmeno + " " + prijmeni;
    }

    public void pokus() {
        if (jmeno.equals("Eva")) {
            System.out.println("Kde je Adam?");
        } else {
            System.out.println("Kde je Eva?");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        List<String> jmena = List.of("Eliška", "Petr", "Soňa");
        for (String jmeno : jmena) {
            System.out.println(jmeno);
        }
    }
}
