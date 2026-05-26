package Test;

import Clases.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class testPelicula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pelicula> listaPeliculas =
                new ArrayList<Pelicula>();

        Set<Pelicula> setPeliculas =
                new HashSet<Pelicula>();

        Map<String, List<Pelicula>> mapaPeliculas =
                new HashMap<String, List<Pelicula>>();

        TreeSet<String> peliculasOrdenadas =
                new TreeSet<String>();

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

        // BUSCAR PELICULA

        System.out.println(
                "\nIngrese pelicula a buscar:"
        );

        String buscar = sc.nextLine();

        boolean encontrada = false;

        for(Pelicula pelicula : listaPeliculas){

            if(pelicula.getNombre()
                    .equalsIgnoreCase(buscar)){

                encontrada = true;

                System.out.println(
                        "\nPelicula encontrada:"
                );

                System.out.println(pelicula);
            }
        }

        if(!encontrada){

            System.out.println(
                    "\nPelicula no encontrada"
            );
        }

        // AGREGAR NUEVA PELICULA

        System.out.println(
                "\nIngrese nombre:"
        );

        String nombre = sc.nextLine();

        System.out.println(
                "Ingrese director:"
        );

        String director = sc.nextLine();

        System.out.println(
                "Ingrese duracion:"
        );

        int duracion = sc.nextInt();

        sc.nextLine();

        System.out.println(
                "Ingrese genero:"
        );

        String genero = sc.nextLine();

        System.out.println(
                "Ingrese año estreno:"
        );

        int anio = sc.nextInt();

        System.out.println(
                "Ingrese rating:"
        );

        double rating = sc.nextDouble();

        Pelicula nueva =
                new Pelicula(
                        nombre,
                        director,
                        duracion,
                        genero,
                        anio,
                        rating
                );

        listaPeliculas.add(nueva);

        System.out.println(
                "\nLISTA ACTUALIZADA"
        );

        for(Pelicula pelicula : listaPeliculas){

            System.out.println(pelicula);
        }

        // ORDENAR POR DURACION

        Collections.sort(
                listaPeliculas,
                Comparator.comparingInt(
                        Pelicula::getDuracion
                )
        );

        System.out.println(
                "\nPELICULAS ORDENADAS POR DURACION"
        );

        for(Pelicula pelicula : listaPeliculas){

            System.out.println(pelicula);
        }

        // TREESET

        for(Pelicula pelicula : listaPeliculas){

            peliculasOrdenadas.add(
                    pelicula.getNombre()
            );
        }

        System.out.println(
                "\nPELICULAS ORDENADAS POR NOMBRE"
        );

        for(String pelicula :
                peliculasOrdenadas){

            System.out.println(pelicula);
        }
    }
}