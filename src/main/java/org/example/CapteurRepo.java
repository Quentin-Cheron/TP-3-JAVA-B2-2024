package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

interface CapteurRepo {
    public final static String CHEMIN_FICHIER = "C:\\Users\\Quent\\codelab\\Java\\TP3\\src\\main\\resources\\renault.json";

    public default List<ReleveCapteur> getAllReleveCapteur() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<ReleveCapteur> releves = null;

        try {
            releves = objectMapper.readValue(new File(CHEMIN_FICHIER), new TypeReference<List<ReleveCapteur>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return releves;
    }
}