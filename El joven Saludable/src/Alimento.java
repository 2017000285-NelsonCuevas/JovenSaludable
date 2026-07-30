/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NICU
 */
public class Alimento {
    // Correlativo del alimento
    private int correlativo;

    // Tiempo de comida
    private String tiempoComida;

    // Tipo de alimento
    private String tipo;

    // Nombre del alimento
    private String nombre;

    // Calorías del alimento
    private int calorias;

    // Constructor
    public Alimento(int correlativo,
                     String tiempoComida,
                     String tipo,
                     String nombre,
                     int calorias) {

        this.correlativo = correlativo;
        this.tiempoComida = tiempoComida;
        this.tipo = tipo;
        this.nombre = nombre;
        this.calorias = calorias;

    }

    // Métodos GET

    public int getCorrelativo() {
        return correlativo;
    }

    public String getTiempoComida() {
        return tiempoComida;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }

}
