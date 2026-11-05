# 2.1 — Documentación JSDoc y Javadoc

## A. JSDoc para JavaScript
JSDoc extrae documentación de comentarios especiales `/** ... */`.

### Preparación
Instala Node.js y npm. Comprueba `node -v` y `npm -v`, luego:

```bash
mkdir practica-jsdoc
cd practica-jsdoc
npm init -y
npm install --save-dev jsdoc
mkdir src
```

Archivo `src/calculadora.js`:

```javascript
/**
 * Suma dos números.
 * @param {number} a - Primer número.
 * @param {number} b - Segundo número.
 * @returns {number} Resultado.
 */
function sumar(a, b) { return a + b; }
module.exports = { sumar };
```

Generar documentación: `npx jsdoc src/calculadora.js -d docs`. Abre `docs/index.html`.

Etiquetas: `@param`, `@returns`, `@throws`, `@example`, `@author`, `@deprecated`, `@see`.

## B. Javadoc para Java
Javadoc genera HTML a partir de comentarios especiales en clases, métodos y campos.

```java
package com.biblioteca;

/**
 * Representa un libro del catálogo.
 * @author Tu nombre
 * @version 1.0
 */
public class Libro {
    private String titulo;
    /**
     * Crea un libro.
     * @param titulo título del libro
     */
    public Libro(String titulo) { this.titulo = titulo; }
    /** @return título del libro */
    public String getTitulo() { return titulo; }
}
```

Desde la raíz del proyecto: `javadoc -d docs -sourcepath src/main/java -subpackages com.biblioteca`. Abre `docs/index.html`.

Etiquetas: `@param`, `@return`, `@throws`, `@author`, `@version`, `@see`, `{@link Clase#metodo}`.

| JSDoc | Javadoc |
|---|---|
| JavaScript | Java |
| `npx jsdoc` | `javadoc` |
| `@returns` | `@return` |
| HTML | HTML |

Orden: instalar herramienta → crear función/clase → comentar con `/** */` → documentar parámetros/retorno/excepciones → generar HTML → revisar `docs/index.html`.
