package com.iesam.ryanair.features.pasajero.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.ryanair.features.demo.domain.Demo;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PasajeroFileLocalDataSource {
    private String nameFile = "Pasajeros.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Pasajero>>() {
    }.getType();
    public void save(Pasajero pasajero) {
        List<Pasajero> pasajeros = findAll();
        pasajeros.add(pasajero);
        saveToFile(pasajeros);
    }
    public Pasajero obtain(String id) {
        List<Pasajero> pasajeros = findAll();
        for (Pasajero pasajero : pasajeros) {
            if (Objects.equals(pasajero.getDni(), id)) {
                return pasajero;
            }
        }
        return null;
    }
    private void saveToFile(List<Pasajero> pasajeros) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(pasajeros));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }
    public List<Pasajero> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }
}
