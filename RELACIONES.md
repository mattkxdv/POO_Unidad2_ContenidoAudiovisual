# Relaciones entre clases

## Asociación: Película - Actor
Una película puede tener varios actores. Los actores se crean independientemente y se agregan a la película.

## Composición: SerieDeTV - Temporada
Una serie contiene temporadas que se crean desde la propia clase SerieDeTV.

## Agregación: Documental - Investigador
Un documental puede incluir investigadores que existen independientemente de él.

## Herencia
Pelicula, SerieDeTV, Documental, VideoYouTube y Cortometraje heredan de ContenidoAudiovisual.