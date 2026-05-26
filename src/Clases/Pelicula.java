package Clases;

public class Pelicula {

    private String nombre;
    private String director;
    private int duracion;
    private String genero;
    private int anioEstreno;
    private double rating;

    public Pelicula(String nombre,
                    String director,
                    int duracion,
                    String genero,
                    int anioEstreno,
                    double rating) {

        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.anioEstreno = anioEstreno;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", rating=" + rating +
                '}';
    }
}