package com.example.autos;
import java.time.LocalDate;

public class Auto {
    private String brand, model;
    private Integer year;

    public Auto(String b, String m, Integer y){
        this.brand = b;
        this.model = m;
        this.year  = y;
    }

    public Auto(){
        this.brand = "VW";
        this.model = "Sedan";
        this.year  = 1968;
    }

    public String toString(){
        String cadena = "\nMarca: " + this.brand + "\nModelo: " + this.model + "\nAño: " + this.year;
        return cadena;
    }

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if (this.year<year){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }
}