package Test;

import Clases.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class testPelicula {

    public static void main(String[] args) {

        List<Pelicula> listaPeliculas =
                new ArrayList<Pelicula>();

        listaPeliculas.add(
                new Pelicula(
                        "Batman",
                        "Christopher Nolan",
                        152,
                        "Accion",
                        2008,
                        9.0
                )
        );

        listaPeliculas.add(
                new Pelicula(
                        "Titanic",
                        "James Cameron",
                        120,
                        "Romance",
                        1997,
                        8.5
                )
        );

        listaPeliculas.add(
                new Pelicula(
                        "Avatar",
                        "James Cameron",
                        162,
                        "Ciencia Ficcion",
                        2009,
                        8.8
                )
        );

        System.out.println(
                "LISTA DE PELICULAS"
        );

        for(Pelicula pelicula : listaPeliculas){

            System.out.println(pelicula);
        }
    }
}