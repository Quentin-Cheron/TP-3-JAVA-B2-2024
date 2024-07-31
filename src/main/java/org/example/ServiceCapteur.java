package org.example;
import java.util.List;

public class ServiceCapteur {
    private CapteurRepo capteurRepo;
    private String marque;

    public ServiceCapteur(CapteurRepo capteurRepo, String marque) {
        this.capteurRepo = capteurRepo;
        this.marque = marque;
    }

    public List<ReleveCapteur> getReleve() {
        return capteurRepo.getAllReleveCapteur();
    }

    public String getMarque() {
        return this.marque;
    }
}


