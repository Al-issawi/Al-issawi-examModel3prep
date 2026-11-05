package com.examen;

public class Validaciones {
    public static boolean esPositivo(int numero) { return numero > 0; }

    public static int contarLetras(String texto) {
        if (texto == null) throw new IllegalArgumentException("El texto no puede ser null");
        return texto.length();
    }

    public static String saludar(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacío");
        return "Hola " + nombre.trim();
    }
}
