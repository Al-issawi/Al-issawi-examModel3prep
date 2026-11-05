# Práctica 4 — Testing con Jest y JUnit 5

Esta carpeta reúne todo el material de pruebas automatizadas del módulo.

## Sigue este orden

1. Lee [Guía de estudio](GUIA-ESTUDIO.md).
2. Intenta responder las [preguntas de examen](EJERCICIOS.md) sin consultar las soluciones.
3. Comprueba tus respuestas en [Respuestas y soluciones](RESPUESTAS-EXAMEN.md).
4. Ejecuta los dos proyectos de ejemplo.

## Proyecto JavaScript — Jest

Necesitas Node.js y npm. Desde esta carpeta:

```bash
cd javascript-jest
npm install
npm test
```

- `src/main.js`: funciones que se van a probar.
- `src/main.test.js`: pruebas automatizadas.
- `package.json`: dependencias y script `test`.

## Proyecto Java — JUnit 5

Necesitas JDK 17 o superior y Maven. Desde esta carpeta:

```bash
cd java-junit
mvn test
```

- `src/main/java/`: código de la aplicación.
- `src/test/java/`: clases de prueba.
- `pom.xml`: configuración y dependencias de Maven.

## Conceptos que debes saber explicar

- Qué hace `npm install --save-dev jest`.
- Para qué sirven `package.json` y el script `test`.
- Qué significan `--coverage` y `--verbose`.
- Qué hacen `module.exports`, `require()` y `expect()`.
- Diferencia entre `toBe()` y `toEqual()`.
- Qué significa la anotación `@Test`.
- Dónde se guardan los tests de Maven.
- Diferencia entre `assertEquals()`, `assertTrue()` y `assertFalse()`.
- Cómo ejecutar los tests con `npm test` y `mvn test`.
