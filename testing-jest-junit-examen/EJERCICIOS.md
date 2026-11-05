# Ejercicios y simulacro de examen

## Parte A — Teoría

Responde sin mirar la guía:

1. ¿Qué hace `npm install --save-dev jest`?
2. ¿Para qué sirve el script `test` de `package.json`?
3. ¿Qué significan `--coverage` y `--verbose`?
4. ¿Para qué se utiliza `module.exports`?
5. ¿Por qué se importan las funciones con `require("./main.js")`?
6. ¿Qué diferencia hay entre `toBe()` y `toEqual()`?
7. ¿Qué hace `expect()`?
8. ¿Para qué sirve `@Test` en JUnit?
9. ¿Dónde se guardan las pruebas de Maven?
10. ¿Qué diferencia hay entre `assertEquals()`, `assertTrue()` y `assertFalse()`?
11. ¿Qué comando ejecuta los tests de Jest?
12. ¿Qué comando ejecuta los tests de Maven?

Las respuestas están en [RESPUESTAS-EXAMEN.md](RESPUESTAS-EXAMEN.md).

## Parte B — Práctica JavaScript (Jest)

Crea en `src/main.js` estas funciones y expórtalas:

1. `multiplicar(a, b)`: devuelve el producto.
2. `esPositivo(numero)`: devuelve true si el número es mayor que cero.
3. `contarLetras(texto)`: devuelve la longitud del texto.
4. `saludar(nombre)`: devuelve `"Hola " + nombre`.

Escribe tests para estos casos:

- 3 × 4 devuelve 12.
- 0 × 9 devuelve 0.
- 3 × 4 no devuelve 13.
- 8 es positivo.
- 0 no es positivo.
- "Hola" tiene 4 caracteres.
- "Ali" devuelve "Hola Ali".

## Parte C — Práctica Java (JUnit 5)

Crea una clase `Validaciones` con los métodos `esPositivo(int numero)`, `contarLetras(String texto)` y `saludar(String nombre)`. Crea `ValidacionesTest.java` en `src/test/java`, marca los métodos con `@Test` y utiliza `assertTrue`, `assertFalse`, `assertEquals`, `assertNotEquals` y `assertThrows`.

## Parte D — Simulacro

Tienes 30 minutos:

1. Crea una función que convierta una frase a mayúsculas.
2. Escribe un test para comprobar el resultado.
3. Añade un test con un resultado esperado incorrecto y observa el fallo.
4. Corrige el valor esperado.
5. Repite la misma lógica en Java con JUnit 5.
6. Ejecuta todos los tests y explica PASS y FAIL.

Las soluciones de las partes B y C están en [RESPUESTAS-EXAMEN.md](RESPUESTAS-EXAMEN.md).