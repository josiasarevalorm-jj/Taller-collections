package Test;

import Clases.Pelicula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testPelicula {

    public static void main(String[] args) {

        List<Pelicula> listaPeliculas =
                new ArrayList<Pelicula>();

        Set<Pelicula> setPeliculas =
                new HashSet<Pelicula>();

        Map<String, List<Pelicula>> mapaPeliculas =
                new HashMap<String, List<Pelicula>>();

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

        // HASHSET

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

        // MAP

        List<Pelicula> accion =
                new ArrayList<Pelicula>();

        List<Pelicula> romance =
                new ArrayList<Pelicula>();

        List<Pelicula> cienciaFiccion =
                new ArrayList<Pelicula>();

        accion.add(listaPeliculas.get(0));

        romance.add(listaPeliculas.get(1));

        cienciaFiccion.add(listaPeliculas.get(2));

        mapaPeliculas.put(
                "Accion",
                accion
        );

        mapaPeliculas.put(
                "Romance",
                romance
        );

        mapaPeliculas.put(
                "Ciencia Ficcion",
                cienciaFiccion
        );

        System.out.println(
                "\nMAPA DE PELICULAS"
        );

        for(String genero : mapaPeliculas.keySet()){

            System.out.println(
                    "\nGenero: " + genero
            );

            for(Pelicula pelicula :
                    mapaPeliculas.get(genero)){

                System.out.println(pelicula);
            }
        }
    }
}