/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hecman
 */
public class Alumno {
     // Atributos de la clase Alumno
    private String nombre;
    private int edad;
    private int calificacion;

    // Constructor de la clase Alumno
    public Alumno(String nombre, int edad, int calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad del alumno
    public int getEdad() {
        return edad;
    }

    // Método para obtener la calificación del alumno
    public int getCalificacion() {
        return calificacion;
    }

    public static void main(String[] args) {

        // Crear instancias de la clase Alumno
        Alumno alumno1 = new Alumno("Juan", 20, 90);
        Alumno alumno2 = new Alumno("María", 22, 85);
        Alumno alumno3 = new Alumno("Carlos", 21, 95);
        Alumno alumno4 = new Alumno("Ana", 23, 88);
        Alumno alumno5 = new Alumno("Pedro", 22, 92);

        // Lista de alumnos
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);

        // Escribir la información de los alumnos en un archivo CSV
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("alumnos.csv")))) {

            // Escribir encabezados
            writer.println("Nombre, Edad, Calificación");

            // Escribir información de cada alumno
            for (Alumno alumno : alumnos) {
                writer.println(alumno.getNombre() + ", " + alumno.getEdad() + ", " + alumno.getCalificacion());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer la información de los alumnos desde el archivo CSV
        try (BufferedReader reader = new BufferedReader(new FileReader("alumnos.csv"))) {

            // Leer e imprimir encabezados
            String encabezados = reader.readLine();
            System.out.println(encabezados);

            // Leer e imprimir información de cada alumno
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
