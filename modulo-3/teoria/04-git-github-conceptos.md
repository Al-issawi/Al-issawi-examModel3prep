# 1.4 — Git y GitHub: conceptos

- **Git:** sistema distribuido de control de versiones; registra cambios localmente.
- **GitHub:** plataforma que aloja repositorios Git y ofrece colaboración, Pull Requests, Issues y automatización.
- **Repositorio:** proyecto cuyo historial controla Git.
- **Working directory:** archivos de trabajo.
- **Staging area/index:** cambios preparados para el próximo commit.
- **Commit:** instantánea registrada con mensaje.
- **Branch:** línea independiente de desarrollo.
- **Merge:** integra una rama en otra.
- **Remote:** repositorio remoto, normalmente `origin`.
- **Clone:** copia un repositorio remoto.
- **Push:** envía commits al remoto.
- **Fetch:** descarga referencias/objetos sin integrar.
- **Pull:** obtiene e integra cambios.
- **Pull Request:** propuesta revisable para integrar cambios en GitHub.

Flujo normal: editar → `git status` → `git add` → `git commit` → `git push` → PR → revisión → merge.

Conflictos: abre archivo, resuelve los marcadores `<<<<<<<`, `=======`, `>>>>>>>`, guarda, usa `git add` y completa el merge.

Repaso: Git y GitHub no son lo mismo; commit guarda una instantánea; push envía y pull obtiene e integra; branch es una línea independiente; PR es una propuesta de integración.
