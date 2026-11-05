package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {
    @Test void ochoEsPositivo() { assertTrue(Validaciones.esPositivo(8)); }
    @Test void ceroNoEsPositivo() { assertFalse(Validaciones.esPositivo(0)); }
    @Test void holaTieneCuatroCaracteres() { assertEquals(4, Validaciones.contarLetras("Hola")); }
    @Test void longitudNoEsCinco() { assertNotEquals(5, Validaciones.contarLetras("Hola")); }
    @Test void saludoEsCorrecto() { assertEquals("Hola Ali", Validaciones.saludar("Ali")); }
    @Test void nombreVacioLanzaExcepcion() { assertThrows(IllegalArgumentException.class, () -> Validaciones.saludar("   ")); }
    @Test void textoNullLanzaExcepcion() { assertThrows(IllegalArgumentException.class, () -> Validaciones.contarLetras(null)); }
}
