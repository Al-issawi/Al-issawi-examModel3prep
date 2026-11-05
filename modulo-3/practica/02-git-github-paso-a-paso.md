# 2.2 — Git Bash y GitHub: comandos en orden

Puedes conectar un proyecto local con GitHub de dos maneras. Usa **una opción u otra** según la situación; no ejecutes las dos sobre la misma carpeta.

## 0. Instalar y configurar Git

Instala Git for Windows: https://git-scm.com/downloads. Abre Git Bash:

```bash
git --version
git config --global user.name "Tu nombre"
git config --global user.email "tu-correo@example.com"
git config --global init.defaultBranch main
git config --list
```

Configura el nombre y el correo que quieres que aparezcan en tus commits.

---

## OPCIÓN 1 — Ya tienes una carpeta en tu ordenador: git init

Esta opción sirve cuando ya has creado el proyecto localmente y quieres empezar a controlar sus versiones y subirlo a GitHub.

### Paso 1. Entrar en la carpeta e iniciar Git

```bash
cd ruta/de/mi/proyecto
git init
```

Si aún no tienes el proyecto:

```bash
mkdir practica-git-modulo3
cd practica-git-modulo3
git init
echo "# Práctica Git Módulo 3" > README.md
```

### Paso 2. Preparar y guardar el primer commit

```bash
git status
git add .
git status
git commit -m "Initial commit"
```

- `git status`: muestra el estado.
- `git add .`: prepara todos los cambios de la carpeta actual.
- `git commit -m`: guarda una instantánea en el historial.

### Paso 3. Crear un repositorio vacío en GitHub

1. Entra en GitHub y pulsa **New repository**.
2. Escribe el nombre del repositorio.
3. Crea el repositorio vacío. Si ya tienes README local, no marques la opción de crear otro README en GitHub.
4. Copia la URL HTTPS del repositorio.

### Paso 4. Conectar el repositorio y subir los cambios

Sustituye `TU-USUARIO` y el nombre del repo por los tuyos:

```bash
git branch -M main
git remote add origin https://github.com/TU-USUARIO/practica-git-modulo3.git
git remote -v
git push -u origin main
```

- `git branch -M main`: asegura que la rama local se llame main.
- `git remote add origin URL`: vincula el repositorio remoto.
- `git remote -v`: comprueba la URL.
- `git push -u origin main`: sube la rama y configura su seguimiento remoto.

---

## OPCIÓN 2 — El repositorio ya existe en GitHub: git clone

Esta opción sirve cuando has creado el repositorio en GitHub o quieres descargar uno que ya existe.

### Paso 1. Copiar la URL

En GitHub abre el repositorio → botón **Code** → HTTPS → copia la URL.

### Paso 2. Clonar

En Git Bash, sitúate en la carpeta donde quieres descargarlo:

```bash
cd ruta/donde/guardar/proyectos
git clone https://github.com/TU-USUARIO/practica-git-modulo3.git
cd practica-git-modulo3
```

### Paso 3. Crear o copiar archivos y subirlos

```bash
git status
git add .
git commit -m "Add project files"
git push
```

No necesitas ejecutar `git init` ni `git remote add origin`: `git clone` ya crea el repositorio local y configura el remoto `origin`.

---

## Trabajo habitual después de conectar

### 1. Modificar y subir cambios

```bash
git status
git diff
git add README.md
git diff --staged
git commit -m "Update README"
git push
```

### 2. Crear una rama y fusionarla

```bash
git switch -c feature/ejemplo
echo "Mi primera rama" > ejemplo.txt
git add ejemplo.txt
git commit -m "Add example file"
git switch main
git merge feature/ejemplo
git push
```

Si hay conflictos, abre los archivos afectados, resuelve los marcadores `<<<<<<<`, `=======` y `>>>>>>>`, guarda, ejecuta `git add archivo` y termina la operación.

### 3. Obtener cambios del repositorio remoto

```bash
git fetch origin
git pull
```

- `fetch`: descarga datos y referencias remotas sin integrar los cambios en tu rama.
- `pull`: descarga e integra cambios remotos (normalmente mediante merge o rebase, según configuración).

### 4. Clonar otro repositorio

```bash
cd ..
git clone https://github.com/TU-USUARIO/OTRO-REPO.git
```

---

## Los tres archivos de logs e historial

Los nombres siguientes son ejemplos. Si el profesor dio nombres concretos, utiliza los suyos.

```bash
git log --oneline > log-oneline.txt
git log --stat > log-stat.txt
git log --graph --oneline --decorate --all > log-graph.txt
```

Crear el archivo `history.txt`:

```bash
cat > history.txt <<'EOF'
Práctica Git — Módulo 3
Repositorio de ejemplo: https://github.com/TU-USUARIO/practica-git-modulo3

1. git init — inicié el repositorio.
2. git add — preparé los archivos.
3. git commit — guardé los cambios.
4. git switch -c — creé una rama.
5. git merge — integré la rama.
6. git remote add origin — conecté GitHub.
7. git push — subí los commits.
EOF
```

Sustituye la URL por el repositorio real. Comprueba los archivos y súbelos al repositorio principal si así lo pide la entrega:

```bash
git status
git add log-oneline.txt log-stat.txt log-graph.txt history.txt
git commit -m "Add Git logs and history"
git push
```

## Chuleta de comandos

| Comando | Función |
|---|---|
| `git init` | Inicializa repositorio local |
| `git clone URL` | Copia un repositorio remoto |
| `git status` | Muestra el estado |
| `git add archivo` | Prepara un archivo |
| `git add .` | Prepara cambios del directorio actual |
| `git commit -m "msg"` | Guarda un commit |
| `git log --oneline` | Muestra historial corto |
| `git diff` | Cambios no preparados |
| `git diff --staged` | Cambios preparados |
| `git branch` | Lista ramas |
| `git switch rama` | Cambia de rama |
| `git switch -c rama` | Crea y cambia de rama |
| `git merge rama` | Integra una rama |
| `git remote -v` | Muestra remotos |
| `git push` | Sube commits |
| `git pull` | Descarga e integra |
| `git fetch` | Descarga sin integrar |

## Errores comunes

- **Working tree clean:** no hay cambios pendientes.
- **Author identity unknown:** configura `user.name` y `user.email`.
- **Remote origin already exists:** comprueba `git remote -v`; si la URL es incorrecta, usa `git remote set-url origin URL`.
- **Non-fast-forward:** el remoto tiene cambios que no tienes; integra primero con `git pull` y resuelve conflictos si aparecen.
- **Merge conflict:** resuelve marcadores, guarda, `git add` y completa merge.
- No guardes contraseñas ni tokens en comandos o archivos. Usa Git Credential Manager o SSH.

## Simulacro de examen

Practica los dos métodos por separado:

**Método 1:** carpeta local → `git init` → crear archivo → `git status` → `git add` → `git commit` → crear repo vacío en GitHub → `git remote add origin` → `git push -u origin main`.

**Método 2:** crear repo en GitHub → copiar URL → `git clone` → crear/editar archivos → `git add` → `git commit` → `git push`.
