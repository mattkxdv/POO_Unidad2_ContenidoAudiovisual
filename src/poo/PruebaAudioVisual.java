package poo;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" SISTEMA DE CONTENIDO AUDIOVISUAL");
        System.out.println("==================================");

        // 1. Crear película y actores (Asociación)
        Pelicula pelicula = new Pelicula(
            "Avatar", 125, "Accion", "20th Century Studios"
        );

        Actor actor1 = new Actor("Sam Worthington", 50, "Australiano");
        Actor actor2 = new Actor("Zoe Saldana", 48, "Estadounidense");

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);

        // 2. Crear serie y temporadas (Composición)
        SerieDeTV serie = new SerieDeTV(
            "Game of Thrones", 60, "Fantasy"
        );

        serie.agregarTemporada(1, 10, 2011);
        serie.agregarTemporada(2, 10, 2012);
        serie.agregarTemporada(3, 10, 2013);

        // 3. Crear documental e investigadores (Agregación)
        Documental documental = new Documental(
            "Cosmos", 45, "Science", "Astronomy"
        );

        Investigador investigador1 = new Investigador(
            "Carl Sagan", "Astronomia", "Universidad de Cornell"
        );

        Investigador investigador2 = new Investigador(
            "Neil deGrasse Tyson", "Astrofisica", "Museo Americano de Historia Natural"
        );

        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);

        // 4. Crear nuevas subclases (Herencia)
        VideoYouTube video = new VideoYouTube(
            "Introduccion a Java", 15, "Educativo",
            "Programacion Facil", 50000
        );

        Cortometraje corto = new Cortometraje(
            "El Viaje", 20, "Drama",
            "Juan Perez", "Festival de Cine Independiente"
        );

        // 5. Mostrar todos los contenidos
        ContenidoAudiovisual[] contenidos = {
            pelicula, serie, documental, video, corto
        };

        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        System.out.println("==================================");
        System.out.println(" SISTEMA EJECUTADO CORRECTAMENTE");
        System.out.println("==================================");
    }
}
