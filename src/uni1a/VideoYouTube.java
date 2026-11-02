
package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int visualizaciones;

    public VideoYouTube(String titulo, int duracionEnMinutos,
            String genero, String canal, int visualizaciones) {

        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.visualizaciones = visualizaciones;
    }

    public String getCanal() {
        return canal;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Visualizaciones: " + visualizaciones);
    }
}
