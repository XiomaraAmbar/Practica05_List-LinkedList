package Actividades;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String nombre;
    private String apellidos;
    private int edad;

    public Person(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ">>>>" + "nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", edad=" + edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return edad == person.edad &&
               Objects.equals(nombre, person.nombre) &&
               Objects.equals(apellidos, person.apellidos);
    }

    @Override
    public int compareTo(Person otro) {
        int nombreCompare = this.nombre.compareTo(otro.nombre);
        if (nombreCompare != 0) {
            return nombreCompare;
        }

        int apellidosCompare = this.apellidos.compareTo(otro.apellidos);
        if (apellidosCompare != 0) {
            return apellidosCompare;
        }

        return Integer.compare(this.edad, otro.edad);
    }
}
