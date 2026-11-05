# Módulo 3 — Preparación del examen

Repositorio de estudio con **teoría, guías prácticas, ejemplos de código, respuestas y checklist de entrega**.

> **Empieza aquí:** sigue la ruta de estudio en [MODULO-3-INDICE.md](MODULO-3-INDICE.md). Está organizada en el mismo orden en que conviene aprender y practicar los temas.

## Ruta recomendada

1. **Estudia la teoría:** ciclo de desarrollo, redes y Git/GitHub.
2. **Practica la documentación:** JSDoc para JavaScript y Javadoc para Java.
3. **Practica Git Bash:** crea un repositorio, realiza commits, trabaja con ramas y súbelo a GitHub.
4. **Practica el despliegue:** publica una aplicación y comprueba que la URL funciona.
5. **Haz los tests:** ejecuta los ejemplos de Jest y JUnit 5.
6. **Prepara la entrega:** revisa el checklist y sustituye todos los ejemplos por tus propios archivos y enlaces.

## Acceso rápido

| Necesito… | Abre… |
|---|---|
| Ver qué tengo que estudiar y en qué orden | [Índice y ruta de estudio](MODULO-3-INDICE.md) |
| Repasar SDLC, redes o Git | [Teoría](modulo-3/teoria/) |
| Aprender JSDoc y Javadoc | [Guía de documentación](modulo-3/practica/01-jsdoc-javadoc.md) |
| Practicar comandos Git Bash | [Guía Git y GitHub](modulo-3/practica/02-git-github-paso-a-paso.md) |
| Publicar una aplicación | [Guía de despliegue](modulo-3/practica/03-desplegar-aplicacion.md) |
| Practicar Jest y JUnit | [Laboratorio de testing](modulo-3/practica/04-testing-jest-junit/README.md) |
| Preparar la entrega | [Checklist del examen y entrega](modulo-3/entrega/PRUEBA-PARCIAL-Y-ENTREGA.md) |
| Ver las plantillas | [Plantillas de entrega](modulo-3/entrega/plantillas/README.md) |

## Ejecutar los ejemplos de testing

Necesitas **Node.js y npm** para Jest:

```bash
cd modulo-3/practica/04-testing-jest-junit/javascript-jest
npm install
npm test
```

Necesitas **JDK 17 o superior y Maven** para JUnit 5:

```bash
cd modulo-3/practica/04-testing-jest-junit/java-junit
mvn test
```

## Estructura del repositorio

```text
.
├── README.md
├── MODULO-3-INDICE.md
├── modulo-3/
│   ├── teoria/
│   ├── practica/
│   │   ├── 01-jsdoc-javadoc.md
│   │   ├── 02-git-github-paso-a-paso.md
│   │   ├── 03-desplegar-aplicacion.md
│   │   └── 04-testing-jest-junit/
│   │       ├── GUIA-ESTUDIO.md
│   │       ├── RESPUESTAS-EXAMEN.md
│   │       ├── EJERCICIOS.md
│   │       ├── javascript-jest/
│   │       └── java-junit/
│   └── entrega/
│       ├── PRUEBA-PARCIAL-Y-ENTREGA.md
│       └── plantillas/
└── .github/workflows/
```

## Importante

- Los documentos de SDLC y redes son **apuntes generales** preparados a partir de los títulos que compartiste. Contrástalos con las diapositivas y explicaciones del profesor.
- Las plantillas de logs y publicación son ejemplos. **No las entregues tal cual:** genera los logs desde tu propio repositorio y escribe tu URL real de publicación.
- Antes de entregar, comprueba que los proyectos compilan, los tests pasan y los enlaces funcionan.
