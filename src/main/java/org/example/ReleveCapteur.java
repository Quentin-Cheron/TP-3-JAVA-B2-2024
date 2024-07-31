package org.example;

public class ReleveCapteur {
    private String id;
    private String typeMachine;
    private double valeurReleve;

    public ReleveCapteur(String id, String typeMachine, double valeurReleve) {
        this.id = id;
        this.typeMachine = typeMachine;
        this.valeurReleve = valeurReleve;
    }

    public ReleveCapteur() {
        this.id = id;
        this.typeMachine = typeMachine;
        this.valeurReleve = valeurReleve;
    }

    public String getId() {
        return this.id;
    }

    public String getTypeMachine() {
        return this.typeMachine;
    }

    public double getValeurReleve() {
        return this.valeurReleve;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public void setValeurReleve(double valeurReleve) {
        this.valeurReleve = valeurReleve;
    }

    public String toString() {
        return "Valeur:" + valeurReleve + "type:" + typeMachine;
    }
}
