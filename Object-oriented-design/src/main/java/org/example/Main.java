package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>)
                        (json, type, jsonDeserializationContext) ->
                                LocalDateTime.parse(
                                        json.getAsJsonPrimitive().getAsString(),
                                        DateTimeFormatter.ISO_DATE_TIME))
                .create();


        try (FileReader reader = new FileReader("src/main/resources/box.json")) {

            Box box = gson.fromJson(reader, Box.class);

            System.out.println("From: " + box.getFrom());
            System.out.println("Material: " + box.getMaterial());
            System.out.println("Color: " + box.getColor());
            System.out.println("Max Lifting Capacity: " +
                    box.getMaxLiftingCapacity().getValue() +
                    " " + box.getMaxLiftingCapacity().getUnit());
            System.out.println("Cargo Name: " + box.getCargo().getName());
            System.out.println("Cargo Class: " + box.getCargo().getCargoClass());
            System.out.println("Delivery Date: " + box.getDeliveryDate());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}