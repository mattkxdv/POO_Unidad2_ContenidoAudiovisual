package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos,
            String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void agregarInvestigador(Investigador investigador) {
        if (investigador != null) {
            investigadores.add(investigador);
        }
    }

    public List<Investigador> getInvestigadores() {
        return new ArrayList<>(investigadores);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Investigadores:");

        for (Investigador investigador : investigadores) {
            investigador.mostrarDetalles();
        }
        System.out.println();
    }
}
