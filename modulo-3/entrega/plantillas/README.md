# Plantillas de entrega

Estos archivos son **modelos para completar**, no resultados reales de tu proyecto.

| Archivo | Qué debes hacer |
|---|---|
| `log-oneline.txt` | Sustituir el texto de ejemplo por la salida de `git log --oneline`. |
| `log-stat.txt` | Sustituirlo por la salida de `git log --stat`. |
| `log-graph.txt` | Sustituirlo por la salida de `git log --graph --oneline --decorate --all`. |
| `history.txt` | Anotar los comandos que ejecutaste y poner el enlace real a tu repositorio de práctica. |
| `publicacion.txt` | Escribir únicamente la URL pública de la aplicación, sin texto adicional. |

## Generar los logs

Ejecuta estos comandos desde la carpeta del repositorio que has utilizado para la práctica:

```bash
git log --oneline > log-oneline.txt
git log --stat > log-stat.txt
git log --graph --oneline --decorate --all > log-graph.txt
```

Comprueba que los archivos contienen tu historial real. No entregues los textos de ejemplo que aparecen en las plantillas.

Consulta también el [checklist de la entrega](../PRUEBA-PARCIAL-Y-ENTREGA.md).
