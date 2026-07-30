/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NICU
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerCSV {

    public ArrayList<Alimento> leerArchivoCSV() {

        // Lista donde se guardarán los alimentos leídos
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();

        // Ruta donde se encuentra el archivo CSV
        String ruta = "resources/alimentos.csv";
        // Se utiliza try-catch para controlar posibles errores al abrir el archivo
try {

    // Abrir el archivo CSV
    BufferedReader archivo = new BufferedReader(new FileReader(ruta));
   // Variable para guardar cada línea del archivo
        String linea;

        // Leer y descartar la primera línea (encabezados)
        archivo.readLine();

        // Leer todas las líneas del archivo
        while ((linea = archivo.readLine()) != null) {

            // Por ahora solo mostraremos la línea en la consola
            String[] datos = linea.split(",");

// Obtener cada dato del arreglo
int correlativo = Integer.parseInt(datos[0]);
String tiempoComida = datos[1];
String tipo = datos[2];
String nombre = datos[3];
int calorias = Integer.parseInt(datos[4]);

// Crear un objeto Alimento
Alimento alimento = new Alimento(
        correlativo,
        tiempoComida,
        tipo,
        nombre,
        calorias);

// Agregar el alimento a la lista
listaAlimentos.add(alimento);

        }

        // Cerrar el archivo
        archivo.close();

    }
catch (IOException e) {

    // Mostrar un mensaje en la consola si ocurre un error
    System.out.println("Error al leer el archivo: " + e.getMessage());

}



        // Aquí comenzaremos a leer el archivo



        // Devuelve la lista con todos los alimentos
        return listaAlimentos;

    }

}