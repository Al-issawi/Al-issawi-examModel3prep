# Respuestas del examen — Jest y JUnit 5

## Parte A — Preguntas teóricas

### 1. ¿Qué hace `npm install --save-dev jest`?
Instala Jest en el proyecto como dependencia de desarrollo y registra la dependencia en `devDependencies` del archivo `package.json`. Jest permite crear y ejecutar pruebas automatizadas de JavaScript.

### 2. ¿Para qué sirve el script `test` de `package.json`?
Sirve para definir el comando que ejecutará npm cuando escribamos `npm test`.

```json
{
  "scripts": {
    "test": "jest"
  }
}
```

### 3. ¿Qué significan `--coverage` y `--verbose`?
- `--coverage`: genera un informe de cobertura que indica qué parte del código ha sido ejecutada por las pruebas.
- `--verbose`: muestra el resultado de cada test con más detalle.

### 4. ¿Para qué se utiliza `module.exports`?
Permite exportar funciones, objetos o variables desde un archivo JavaScript para que otros archivos puedan utilizarlos.

```javascript
function sumar(a, b) {
  return a + b;
}
module.exports = { sumar };
```

### 5. ¿Por qué se importan las funciones con `require("./main.js")`?
Porque `require()` carga un módulo de CommonJS. Así el archivo de pruebas puede utilizar las funciones que `main.js` ha exportado con `module.exports`. `./` indica que el archivo está en el mismo directorio.

```javascript
const { sumar } = require("./main.js");
```

### 6. ¿Qué diferencia hay entre `toBe()` y `toEqual()`?
- `toBe()` comprueba igualdad estricta (usa `Object.is`); es adecuado para números, strings, booleanos y para comprobar que dos referencias sean la misma.
- `toEqual()` compara recursivamente el contenido de objetos y arrays.

```javascript
expect(5).toBe(5);
expect({ nombre: "Ali" }).toEqual({ nombre: "Ali" });
```

### 7. ¿Qué hace `expect()`?
Recibe el valor real que queremos comprobar y devuelve una interfaz a la que añadimos un matcher, por ejemplo `.toBe()`, `.toEqual()` o `.toThrow()`, para comparar el resultado con lo esperado.

```javascript
expect(sumar(2, 3)).toBe(5);
```

### 8. ¿Para qué sirve `@Test` en JUnit?
Es una anotación de JUnit Jupiter (JUnit 5) que identifica un método como método de prueba para que el motor de JUnit pueda ejecutarlo.

```java
@Test
void sumarDosNumeros() {
    assertEquals(5, Operaciones.sumar(2, 3));
}
```

### 9. ¿Dónde se guardan las pruebas de Maven?
Por convención, los tests Java se guardan en `src/test/java/`. El código principal se guarda en `src/main/java/`. Maven aplica esta estructura estándar.

### 10. ¿Qué diferencia hay entre `assertEquals()`, `assertTrue()` y `assertFalse()`?
- `assertEquals(esperado, real)`: comprueba que el valor real coincide con el esperado.
- `assertTrue(condicion)`: comprueba que la condición sea `true`.
- `assertFalse(condicion)`: comprueba que la condición sea `false`.

```java
assertEquals(5, 2 + 3);
assertTrue(10 > 5);
assertFalse(3 > 10);
```

### 11. ¿Qué comando ejecuta los tests de Jest?
`npm test` (si el script `test` de `package.json` está configurado para ejecutar Jest).

### 12. ¿Qué comando ejecuta los tests de Maven?
`mvn test`, ejecutado desde el directorio que contiene el `pom.xml`. También se puede indicar el archivo con `mvn -f ruta/pom.xml test`.

---

## Parte B — Práctica JavaScript (Jest): solución

### 1. `src/main.js`

```javascript
function multiplicar(a, b) {
  return a * b;
}

function esPositivo(numero) {
  return numero > 0;
}

function contarLetras(texto) {
  return texto.length;
}

function saludar(nombre) {
  return "Hola " + nombre;
}

module.exports = {
  multiplicar,
  esPositivo,
  contarLetras,
  saludar
};
```

### 2. `src/main.test.js`

```javascript
const {
  multiplicar,
  esPositivo,
  contarLetras,
  saludar
} = require("./main.js");

describe("multiplicar", () => {
  test("3 por 4 devuelve 12", () => {
    expect(multiplicar(3, 4)).toBe(12);
  });

  test("multiplicar por cero devuelve cero", () => {
    expect(multiplicar(0, 9)).toBe(0);
  });

  test("3 por 4 no devuelve 13", () => {
    expect(multiplicar(3, 4)).not.toBe(13);
  });
});

describe("esPositivo", () => {
  test("8 es positivo", () => {
    expect(esPositivo(8)).toBe(true);
  });

  test("0 no es positivo", () => {
    expect(esPositivo(0)).toBe(false);
  });
});

describe("contarLetras", () => {
  test("Hola tiene 4 caracteres", () => {
    expect(contarLetras("Hola")).toBe(4);
  });
});

describe("saludar", () => {
  test("Ali devuelve Hola Ali", () => {
    expect(saludar("Ali")).toBe("Hola Ali");
  });
});
```

### 3. Ejecutar Jest

Desde la carpeta `javascript-jest`:

```bash
npm install
npm test
```

Los siete tests definidos deberían pasar si los archivos están guardados correctamente.

---

## Parte C — Práctica Java (JUnit 5): solución

### 1. `Validaciones.java`

Guárdalo en `src/main/java/com/examen/Validaciones.java`:

```java
package com.examen;

public class Validaciones {
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static int contarLetras(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        return texto.length();
    }

    public static String saludar(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        return "Hola " + nombre.trim();
    }
}
```

### 2. `ValidacionesTest.java`

Guárdalo en `src/test/java/com/examen/ValidacionesTest.java`:

```java
package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {
    @Test
    void ochoEsPositivo() {
        assertTrue(Validaciones.esPositivo(8));
    }

    @Test
    void ceroNoEsPositivo() {
        assertFalse(Validaciones.esPositivo(0));
    }

    @Test
    void holaTieneCuatroCaracteres() {
        assertEquals(4, Validaciones.contarLetras("Hola"));
    }

    @Test
    void longitudNoEsCinco() {
        assertNotEquals(5, Validaciones.contarLetras("Hola"));
    }

    @Test
    void saludoEsCorrecto() {
        assertEquals("Hola Ali", Validaciones.saludar("Ali"));
    }

    @Test
    void nombreVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Validaciones.saludar("   "));
    }

    @Test
    void textoNullLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Validaciones.contarLetras(null));
    }
}
```

### 3. Ejecutar JUnit

Desde el directorio que contiene el `pom.xml`:

```bash
mvn test
```

---

## Resumen rápido para memorizar

| Jest | JUnit 5 |
|---|---|
| JavaScript | Java |
| `npm install --save-dev jest` | Dependencia JUnit en `pom.xml` |
| `test()` | `@Test` |
| `expect(x).toBe(y)` | `assertEquals(y, x)` |
| `expect(x).toEqual(obj)` | `assertEquals(obj, x)` para igualdad de objetos |
| `require()` | `import` |
| `module.exports` | Clases y métodos Java accesibles según modificadores |
| `npm test` | `mvn test` |

**Consejo:** recuerda que en JUnit el orden de `assertEquals` es primero el valor esperado y después el valor real. En Jest se escribe primero el valor real dentro de `expect()` y después el esperado en el matcher.