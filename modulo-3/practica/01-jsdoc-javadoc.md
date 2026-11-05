# 2.1 — Documentación con JSDoc y Javadoc

## A. JSDoc para JavaScript

JSDoc genera documentación HTML a partir de comentarios especiales que empiezan por `/**`.

### 1. Requisitos e instalación

Instala Node.js desde https://nodejs.org/es/download. npm se instala normalmente junto con Node.js.

Comprueba las versiones en la terminal:

```bash
node -v
npm -v
```

Prepara un proyecto:

```bash
mkdir practica-jsdoc
cd practica-jsdoc
npm init -y
npm install --save-dev jsdoc
mkdir src
```

### 2. Documentar una función

Archivo `src/calculadora.js`:

```javascript
/**
 * Suma dos números y devuelve el resultado.
 *
 * @param {number} nombreDato1 - Primer número que se suma.
 * @param {number} nombreDato2 - Segundo número que se suma.
 * @returns {number} Resultado de sumar los dos números.
 * @author Tu nombre
 * @since 1.0.0
 * @version 1.0.0
 * @see restar
 * @example
 * sumar(2, 3); // devuelve 5
 */
function sumar(nombreDato1, nombreDato2) {
  return nombreDato1 + nombreDato2;
}

module.exports = { sumar };
```

La estructura que debes memorizar es:

```javascript
/**
 * Descripción de lo que hace la función.
 * @param {tipo} nombreParametro - Descripción del parámetro.
 * @returns {tipo} Descripción del valor que devuelve.
 */
```

Etiquetas importantes:
- `@param {tipo} nombre - descripción`: describe un parámetro.
- `@returns {tipo} descripción`: describe el valor devuelto.
- `@author`: autor.
- `@link` o `{@link Nombre}`: crea un enlace dentro de la documentación.
- `@since`: versión desde la que existe el elemento.
- `@version`: versión del elemento/proyecto.
- `@see`: referencia relacionada.
- `@throws {Error}`: error que puede lanzar.
- `@example`: ejemplo de uso.

### 3. Generar HTML directamente desde terminal

Desde la carpeta raíz del proyecto:

```bash
npx jsdoc -r src -d docu
```

- `npx jsdoc`: ejecuta JSDoc instalado en el proyecto.
- `-r`: recorre también las subcarpetas.
- `src`: carpeta donde están los archivos fuente.
- `-d docu`: carpeta de destino donde se genera la documentación HTML.

Después abre `docu/index.html` en el navegador.

**Corrección importante:** en los apuntes puede aparecer `npm jsdoc -r src -d docu`, pero el comando habitual para ejecutar el binario local es `npx jsdoc -r src -d docu`.

### 4. Configurar JSDoc con jsdoc.json y package.json

Crea un archivo `jsdoc.json` en la raíz:

```json
{
  "source": {
    "include": ["src"]
  },
  "opts": {
    "destination": "docu",
    "recurse": true
  }
}
```

En `package.json`, añade el script:

```json
{
  "scripts": {
    "docs": "jsdoc -c jsdoc.json"
  },
  "devDependencies": {
    "jsdoc": "^4.0.0"
  }
}
```

Si `package.json` ya tiene otras propiedades o scripts, no los borres: añade solamente la entrada `"docs"` dentro del objeto `"scripts"`.

Genera la documentación con:

```bash
npm run docs
```

Abre `docu/index.html`.

### 5. Comando -X

```bash
npx jsdoc -X src/calculadora.js
```

Este comando muestra los datos de documentación analizados en formato JSON (doclets). Es útil para comprobar cómo JSDoc interpreta los comentarios, pero **no genera la web HTML**. Para HTML utiliza `npx jsdoc -r src -d docu` o `npm run docs`.

---

## B. Javadoc para Java

Javadoc genera documentación HTML a partir de comentarios especiales `/** ... */` en clases, métodos y campos.

### Ejemplo de clase

`src/main/java/com/biblioteca/Libro.java`:

```java
package com.biblioteca;

/**
 * Representa un libro del catálogo de la biblioteca.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 1.0
 */
public class Libro {
    private String titulo;

    /**
     * Crea un libro con el título indicado.
     *
     * @param titulo título del libro
     */
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return título del libro
     * @see #Libro(String)
     */
    public String getTitulo() {
        return titulo;
    }
}
```

### Generar HTML

Desde la raíz del proyecto:

```bash
javadoc -d docs -sourcepath src/main/java -subpackages com.biblioteca
```

Abre `docs/index.html`.

Etiquetas habituales:
- `@param`: parámetro.
- `@return`: valor devuelto.
- `@throws`: excepción que puede producirse.
- `@author`: autor.
- `@version`: versión.
- `@since`: desde qué versión existe.
- `@see`: referencia.
- `{@link Clase#metodo}`: enlace a otra clase o método.

## Diferencias que pueden preguntar

| JSDoc | Javadoc |
|---|---|
| JavaScript | Java |
| Se ejecuta normalmente con `npx jsdoc` | Se ejecuta con `javadoc` del JDK |
| `@returns` | `@return` |
| Configuración opcional `jsdoc.json` | Opciones del comando Javadoc |
| Genera HTML | Genera HTML |

## Orden recomendado para el examen

1. Instalar Node.js/npm si vas a usar JSDoc, o JDK si vas a usar Javadoc.
2. Crear la función o clase.
3. Escribir el comentario `/** ... */` encima.
4. Documentar parámetros, retorno, autor y versión cuando corresponda.
5. Ejecutar el generador.
6. Comprobar que se ha creado la carpeta de destino.
7. Abrir `index.html` y comprobar el resultado.
