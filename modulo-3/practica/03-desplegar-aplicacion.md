# 2.3 — Desplegar una aplicación

Desplegar es publicar una versión en un entorno donde otros puedan utilizarla; localhost no es publicación pública.

## Antes de publicar
1. Identifica si es web estática, backend Java/Spring Boot o frontend + backend + base de datos.
2. Prueba localmente y ejecuta tests.
3. Prepara README y variables de entorno.
4. No publiques secretos, contraseñas, tokens ni `.env`.

## A. Web estática con GitHub Pages
Sirve para HTML/CSS/JS y frontend compilado. GitHub Pages no ejecuta backend Spring Boot ni bases de datos.
1. Sube el proyecto a GitHub.
2. En Vite/React, configura `base` con el subpath del repo si procede.
3. Ejecuta `npm install` y `npm run build`.
4. En GitHub: Settings → Pages → configura GitHub Actions/build y carpeta de salida (p. ej. `dist`).
5. Espera al workflow y copia la URL indicada en Settings → Pages.
6. Comprueba rutas, imágenes, enlaces y consola.

## B. Backend Java/Spring Boot
1. Ejecuta `mvn clean package`.
2. Comprueba el JAR en `target/`.
3. Prepara variables de entorno y base de datos remota si hace falta.
4. Despliega el JAR o imagen Docker en un host compatible con Java.
5. Configura puerto, health check, logs y dominio.
6. Prueba endpoints con navegador, curl o Postman.

Prueba local: `java -jar target/nombre-aplicacion.jar`.

## C. Frontend + API
Publica ambos componentes en servicios compatibles. Configura URL de API en frontend, CORS en backend cuando los orígenes sean distintos y conexión segura a base de datos. Nunca metas secretos del backend en el frontend.

## Checklist
- [ ] URL pública abre.
- [ ] App funciona sin localhost.
- [ ] Rutas/recursos cargan.
- [ ] API responde si existe.
- [ ] No se publican credenciales.
- [ ] Fichero de entrega contiene solo enlace si así lo pide el profesor.

Diagnóstico: 404 = revisar URL/base path; blanco = revisar consola/assets; API caída = backend/URL; CORS = orígenes permitidos; local funciona/online no = variables, rutas y puertos.
