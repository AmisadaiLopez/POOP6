/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Miriam Lopez 
 * Clase que contiene los métodos de los que hace una persona y empieza con mayuscula 
 */
public class Persona {
    private String nombre, direccion;
    private int edad; 

    /**
     * constructor vacio de persona
     */
    public Persona() {
    }
    /** constructor lleno de persona 
     * @param nombre nombre de la persona en String
     * @param direccion direccion de la persona en String 
     * @param edad edad de la persona en primitivo entero (int)
     */

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    /**
     * Metodo get nombre
     * @return regresa el nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo set Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get Direccion
     * @return retorna la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo set Direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo get Edad
     * @return retorna la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo set Edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * metodo que sirve para que la persona hable
     * @param correr lo que la persona esta diciendo
     */
    public void hablar(String correr){
        System.out.println(correr);
    }    
    /**
     * Metodo toString sobre escrito que ahora muestra los valores de los atributos
     * @return regresa una concatenación de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
    
    
}
