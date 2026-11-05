# Guía de estudio: Jest y JUnit 5

## 1. ¿Qué es un test?
Un test automatizado comprueba que una parte del programa devuelve el resultado esperado. Puede pasar (PASS) o fallar (FAIL).

## 2. Jest — JavaScript

Instalación:

```bash
npm install --save-dev jest
```

En `package.json`:

```json
{
  "scripts": {
    "test": "jest --coverage --verbose"
  }
}
```

- `--coverage`: genera un informe de cobertura.
- `--verbose`: muestra el resultado de cada test.
- `npm test`: ejecuta el script `test`.

Ejemplo de `main.js`:

```javascript
function sumar(a, b) {
  return a + b;
}
module.exports = { sumar };
```

Ejemplo de `main.test.js`:

```javascript
const { sumar } = require("./main.js");
test("suma dos números", () => {
  expect(sumar(2, 3)).toBe(5);
});
```

Matchers frecuentes:

| Matcher | Significado |
|---|---|
| `toBe(valor)` | Igualdad estricta |
| `not.toBe(valor)` | Desigualdad |
| `toEqual(objeto)` | Compara contenido de objetos/arrays |
| `toBeGreaterThan(n)` | Mayor que |
| `toBeLessThan(n)` | Menor que |
| `toBeTruthy()` | Valor truthy |
| `toBeFalsy()` | Valor falsy |
| `toBeNull()` | Es null |
| `toBeUndefined()` | Es undefined |
| `toContain(valor)` | Contiene un elemento/texto |
| `toThrow()` | Lanza una excepción |

## 3. JUnit 5 — Java

En Maven, el código principal va en `src/main/java/` y los tests en `src/test/java/`.

Dependencia en `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

Ejemplo de clase:

```java
package com.examen;
public class Operaciones {
    public static int sumar(int a, int b) {
        return a + b;
    }
}
```

Ejemplo de test:

```java
package com.examen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {
    @Test
    void sumarDosNumeros() {
        assertEquals(5, Operaciones.sumar(2, 3));
    }
}
```

Assertions frecuentes:

| JUnit 5 | Significado |
|---|---|
| `assertEquals(esperado, real)` | Igualdad |
| `assertNotEquals(esperado, real)` | Desigualdad |
| `assertTrue(condicion)` | Debe ser true |
| `assertFalse(condicion)` | Debe ser false |
| `assertNull(valor)` | Debe ser null |
| `assertNotNull(valor)` | No debe ser null |
| `assertThrows(Tipo.class, ejecutable)` | Debe lanzar una excepción |

## 4. Diferencias principales

| Concepto | Jest | JUnit 5 |
|---|---|---|
| Lenguaje | JavaScript | Java |
| Gestor | npm | Maven |
| Declarar test | `test()` | `@Test` |
| Igualdad | `expect(x).toBe(y)` | `assertEquals(y, x)` |
| Ejecutar | `npm test` | `mvn test` |

## 5. Comandos

```bash
npm install --save-dev jest
npm test
mvn test
```

Documentación: https://jestjs.io/docs/using-matchers y https://junit.org/junit5/docs/current/user-guide/