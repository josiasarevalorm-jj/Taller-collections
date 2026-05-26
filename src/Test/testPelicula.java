package Test;

import Clases.Pelicula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testPelicula {

    public static void main(String[] args) {

        List<Pelicula> listaPeliculas =
                new ArrayList<Pelicula>();

        Set<Pelicula> setPeliculas =
                new HashSet<Pelicula>();

        // AGREGAR PELICULAS

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

        // MOSTRAR LISTA

        System.out.println(
                "LISTA DE PELICULAS"
        );

        for(Pelicula pelicula : listaPeliculas){

            System.out.println(pelicula);
        }

        //hashset

        setPeliculas.addAll(listaPeliculas);

        setPeliculas.add(
                new Pelicula(
                        "Batman",
                        "Christopher Nolan",
                        152,
                        "Accion",
                        2008,
                        9.0
                )
        );

        System.out.println(
                "\nPELICULAS EN HASHSET"
        );

        for(Pelicula pelicula : setPeliculas){

            System.out.println(pelicula);
        }
    }
}