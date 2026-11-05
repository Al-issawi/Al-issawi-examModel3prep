# 1.3 — Conceptos de redes (parte 2)

Apuntes generales para complementar las diapositivas.

## TCP y UDP
- **TCP:** orientado a conexión, entrega ordenada y fiable con confirmaciones y retransmisiones.
- **UDP:** menor sobrecarga, sin garantía equivalente de entrega/orden; útil en tiempo real o protocolos que implementan fiabilidad por encima.

## Protocolos y puertos
| Servicio | Puerto habitual | Uso |
|---|---:|---|
| HTTP | TCP 80 | Web sin TLS |
| HTTPS | TCP 443 | Web con TLS |
| SSH | TCP 22 | Administración remota segura |
| FTP | TCP 20/21 | FTP clásico |
| SFTP | TCP 22 | Archivos sobre SSH |
| DNS | 53 UDP/TCP | Resolución de nombres |
| DHCP | UDP 67/68 | Configuración IPv4 automática |
| SMTP | TCP 25/587/465 | Envío de correo |
| POP3 | TCP 110/995 | Recepción de correo |
| IMAP | TCP 143/993 | Sincronización de correo |

## HTTP y HTTPS
HTTP usa peticiones y respuestas. GET consulta; POST envía/crea; PUT reemplaza; PATCH modifica parcialmente; DELETE elimina. Códigos: 200 OK; 201 creado; 301/302 redirección; 400 petición incorrecta; 401 no autenticado; 403 prohibido; 404 no encontrado; 500 error del servidor. HTTPS protege HTTP mediante TLS, que aporta confidencialidad e integridad y autentica el servidor mediante certificados.

## IP y subred
Ejemplo `192.168.1.20/24`: `/24` indica 24 bits de red; pertenece a `192.168.1.0/24`.

## Diagnóstico
- Windows `ipconfig`; Linux `ip addr`.
- `ping dominio.com`: conectividad ICMP.
- Windows `tracert`; otros `traceroute`.
- `nslookup dominio.com` o `dig dominio.com`: DNS.
- `netstat` o `ss`: conexiones/puertos.
- `curl -I https://example.com`: cabeceras HTTP.

## Seguridad
Usar HTTPS/SSH, actualizar dispositivos, firewall, limitar servicios expuestos, MFA y no compartir claves privadas.

## Repaso
TCP vs UDP: fiabilidad/orden frente a menos sobrecarga. HTTPS 443; SSH 22. HTTP 404 = no encontrado. `nslookup`/`dig` consultan DNS. `/24` = 24 bits de red.
