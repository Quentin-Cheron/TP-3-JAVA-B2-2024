package org.example;

import java.lang.reflect.Constructor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> repoClass = Class.forName("org.example.RenaultCapteurRepo");

            Constructor<?> constructor = repoClass.getConstructor();

            CapteurRepo capteurRepo = (CapteurRepo) constructor.newInstance();

            ServiceCapteur serviceCapteur = new ServiceCapteur(capteurRepo, "renault");

            System.out.println("Relevés " + serviceCapteur.getMarque() + ":");
            List<ReleveCapteur> releves = serviceCapteur.getReleve();
            for (ReleveCapteur releve : releves) {
                System.out.println(releve);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}