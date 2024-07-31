package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitroenCapteurRepo implements CapteurRepo {
    public final static String CHEMIN_FICHIER_CSV = "C:\\Users\\Quent\\codelab\\Java\\TP3\\src\\main\\resources\\citroen.csv";

    public List<ReleveCapteur> getAllReleveCapteur() {
        List<ReleveCapteur> releves = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(CHEMIN_FICHIER_CSV))) {
            List<String[]> lignes = csvReader.readAll();
            for (String[] ligne : lignes) {
                if (ligne.length == 3) {
                    String id = ligne[0];
                    String typeMachine = ligne[1];
                    double valeurReleve = Double.parseDouble(ligne[2]);
                    ReleveCapteur releve = new ReleveCapteur(id, typeMachine, valeurReleve);
                    releves.add(releve);
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return releves;
    }

}