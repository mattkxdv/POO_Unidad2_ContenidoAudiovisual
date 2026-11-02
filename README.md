# Sistema de Gestión de Contenido Audiovisual

## Descripción
Proyecto desarrollado para la asignatura de Programación Orientada a Objetos, Unidad 2. Su objetivo es ampliar un sistema de contenidos audiovisuales mediante nuevas clases, relaciones entre objetos y herencia.

## Clases implementadas

### Clases relacionadas
- **Actor:** almacena información de los actores de una película.
- **Temporada:** registra el número de temporada, episodios y año.
- **Investigador:** contiene información de los investigadores de un documental.

### Nuevos contenidos audiovisuales
- **VideoYouTube:** representa videos con su canal y número de visualizaciones.
- **Cortometraje:** representa cortometrajes con director y festival.

## Relaciones entre clases
- **Asociación:** Película y Actor.
- **Composición:** SerieDeTV y Temporada.
- **Agregación:** Documental e Investigador.
- **Herencia:** las clases Pelicula, SerieDeTV, Documental, VideoYouTube y Cortometraje heredan de ContenidoAudiovisual.

## Ejecución
1. Abrir el proyecto en Visual Studio Code.
2. Abrir el archivo `PruebaAudioVisual.java`.
3. Ejecutar el método `main`.
4. Observar los detalles de los contenidos audiovisuales en la consola.

## Mejoras realizadas
Se incorporaron nuevas clases, relaciones entre objetos, dos subclases adicionales y un programa de prueba que permite comprobar el funcionamiento del sistema.