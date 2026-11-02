package uni1a;

public class Temporada {
    private int numero;
    private int episodios;
    private int anio;

    public Temporada(int numero, int episodios, int anio) {
        this.numero = numero;
        this.episodios = episodios;
        this.anio = anio;
    }

    public int getNumero() {
        return numero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getAnio() {
        return anio;
    }

    public void mostrarDetalles() {
        System.out.println("Temporada: " + numero);
        System.out.println("Episodios: " + episodios);
        System.out.println("Año: " + anio);
    }
}
