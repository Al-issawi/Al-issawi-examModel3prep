# 2.2 — Git Bash y GitHub: comandos en orden

Usa un repo de ejemplo separado del proyecto principal.

## 0. Instalar y configurar
Instala Git for Windows: https://git-scm.com/downloads. En Git Bash:

```bash
git --version
git config --global user.name "Tu nombre"
git config --global user.email "tu-correo@example.com"
git config --global init.defaultBranch main
git config --list
```

## 1. Crear repo local
```bash
mkdir practica-git-modulo3
cd practica-git-modulo3
git init
echo "# Práctica Git Módulo 3" > README.md
git status
```

## 2. Primer commit
```bash
git add README.md
git status
git commit -m "Initial commit: add README"
git log --oneline
```
`git add` prepara; `git commit` guarda; `git log` muestra historial.

## 3. Ramas y merge
```bash
git switch -c feature/ejemplo
echo "Mi primera rama" > ejemplo.txt
git add ejemplo.txt
git commit -m "Add example file"
git branch
git log --oneline --graph --all
git switch main
git merge feature/ejemplo
```
Si hay conflicto, edita el archivo, elimina marcadores, guarda y ejecuta `git add archivo`; completa merge.

## 4. Conectar a GitHub
Crea en GitHub un repo vacío `practica-git-modulo3`, copia URL HTTPS y sustituye TU-USUARIO:

```bash
git remote add origin https://github.com/TU-USUARIO/practica-git-modulo3.git
git remote -v
git push -u origin main
```

## 5. Cambiar, confirmar, subir
```bash
echo "Segunda versión" >> README.md
git status
git diff
git add README.md
git diff --staged
git commit -m "Update README"
git push
```

## 6. Obtener cambios y clonar
```bash
git fetch origin
git pull
cd ..
git clone https://github.com/TU-USUARIO/practica-git-modulo3.git
```
Fetch descarga sin integrar; pull descarga e integra.

## 7. Tres logs e historial
Los nombres son ejemplo; usa nombres/formato exigidos por profesor:

```bash
git log --oneline > log-oneline.txt
git log --stat > log-stat.txt
git log --graph --oneline --decorate --all > log-graph.txt
```

Crear `history.txt`:

```bash
cat > history.txt <<'EOF'
Práctica Git — Módulo 3
Repositorio de ejemplo: https://github.com/TU-USUARIO/practica-git-modulo3
1. git init — inicialicé repo.
2. git add — preparé archivos.
3. git commit — guardé cambios.
4. git switch -c — creé rama.
5. git merge — integré rama.
6. git remote add origin — conecté GitHub.
7. git push — publiqué commits.
EOF
```
Sustituye el enlace por el real. Para llevarlos al repo principal:

```bash
git add log-oneline.txt log-stat.txt log-graph.txt history.txt
git commit -m "Add Git logs and history"
git push
```

## Chuleta
| Comando | Función |
|---|---|
| `git init` | Inicializa repo |
| `git clone URL` | Clona repo |
| `git status` | Estado |
| `git add archivo` | Staging |
| `git commit -m "msg"` | Guarda commit |
| `git log --oneline` | Historial corto |
| `git diff` | Cambios no staged |
| `git diff --staged` | Cambios staged |
| `git branch` | Lista ramas |
| `git switch rama` | Cambia rama |
| `git switch -c rama` | Crea y cambia rama |
| `git merge rama` | Une rama |
| `git remote -v` | Lista remotos |
| `git push` | Sube commits |
| `git pull` | Obtiene e integra |
| `git fetch` | Descarga sin integrar |

Errores: `Working tree clean` = sin cambios; `Author identity unknown` = configura nombre/email; `non-fast-forward` = integra remoto antes de subir; conflicto = resuelve marcadores y añade archivos. No publiques contraseñas ni tokens; usa Git Credential Manager o SSH.

Simulacro: init → README → status → add → commit → branch → archivo → commit → switch main → merge → remote add → push → tres logs → history.txt.
