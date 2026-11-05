# 1.2 — Conceptos de redes (parte 1)

Apuntes generales; contrástalos con el PowerPoint original.

## ¿Qué es una red?
Conjunto de dispositivos conectados para intercambiar datos y compartir recursos.

## Redes por alcance
- **PAN:** red personal de corto alcance, por ejemplo Bluetooth.
- **LAN:** red local en casa, aula u oficina.
- **WLAN:** LAN inalámbrica, normalmente Wi-Fi.
- **MAN:** red metropolitana.
- **WAN:** red extensa que conecta redes a grandes distancias. Internet es una red de redes.

## Dispositivos
- **Cliente:** solicita un servicio.
- **Servidor:** ofrece un servicio.
- **Router:** conecta redes y encamina paquetes.
- **Switch:** conecta equipos dentro de una LAN y reenvía tramas según MAC.
- **Punto de acceso:** permite conectar dispositivos inalámbricos.
- **Firewall:** aplica reglas para permitir/bloquear tráfico.
- **Módem/ONT:** adapta conexión a tecnología del proveedor.

## Direccionamiento y servicios
- **IP:** dirección lógica para identificar interfaces y enrutar. IPv4 = 32 bits; IPv6 = 128 bits.
- **MAC:** identificador de interfaz a nivel de enlace.
- **Puerto:** identifica un servicio/proceso de transporte.
- **DNS:** resuelve nombres de dominio a registros como IP.
- **DHCP:** asigna configuración IP automáticamente.
- **Gateway:** puerta de enlace para salir de la red local.

## Modelo OSI
Siete capas:
| Capa | Función | Ejemplos |
|---|---|---|
| 7 Aplicación | Servicios a aplicaciones | HTTP, DNS |
| 6 Presentación | Representación/codificación | formatos de datos |
| 5 Sesión | Gestión de sesiones | control de diálogo |
| 4 Transporte | Comunicación extremo a extremo | TCP, UDP |
| 3 Red | Direccionamiento/rutas | IP |
| 2 Enlace | Tramas y MAC | Ethernet, Wi-Fi |
| 1 Física | Señales y bits | cable, radio |

TCP/IP agrupa funciones en acceso a red, Internet, transporte y aplicación.

## Preguntas
- LAN vs WAN: ámbito local vs extenso.
- Router vs switch: conecta redes vs conecta equipos LAN.
- IP vs MAC: direccionamiento lógico/enrutamiento vs enlace.
- DNS vs DHCP: resolver nombres vs asignar configuración.
- OSI: siete capas.
