package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos,
            String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(int numero, int episodios, int anio) {
        Temporada temporada = new Temporada(numero, episodios, anio);
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return new ArrayList<>(temporadas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de televisión:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas:");

        for (Temporada temporada : temporadas) {
            temporada.mostrarDetalles();
        }
        System.out.println();
    }
}
