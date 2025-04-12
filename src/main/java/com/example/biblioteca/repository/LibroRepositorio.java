package com.example.biblioteca.repository;

import com.example.biblioteca.model.libro;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class LibroRepositorio {
    private List<libro> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listaLibros.add(new libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2018, "Joshua Bloch"));
        listaLibros.add(new libro(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));
        listaLibros.add(new libro(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));
        listaLibros.add(new libro(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));

    }

    public List<libro> obtenerLibro(){
        return listaLibros;
    }

    public libro buscarLibroPorId(int id){
        for(libro libro : listaLibros){
            if (libro.getId() == id) return libro;
        }
        return null;
    }

    //buscar libro por isbn
    public libro buscarLibroPorIsbn(String isbn){
        for(libro libro : listaLibros){
            if (libro.getIsbn() == isbn){
                return libro;
            }
        }
        System.out.println("No se ha encontrado un libro del isbn: " + isbn);
        return null;
    }

    //buscar por autor
    public libro buscarLibroPorAutor(String autor){
        autor = autor.toLowerCase();
        for(libro libro : listaLibros){
            if (libro.getAutor().toLowerCase() == autor){
                return libro;
            }
        }
        System.out.println("No se ha encontrado un libro del autor: " + autor);
        return null;
    }

    public void guardarLibro(libro nuevoLibro){
        listaLibros.add(nuevoLibro);
    }

    public void actualizarLibro(libro lib){
        int id = lib.getId();
        for (int i=0; i<listaLibros.size(); i++){
            if (listaLibros.get(i).getId() == id){
                listaLibros.set(i, lib);
                System.out.println("Se ha actualizado el libro exitosamente");
                return;
            }
        }
        System.out.println("No se encontro un libro con la id " + id +" para actualizar");
    }

    public void eliminarLibro(int id){
        //Funcion lambda
        listaLibros.removeIf((x) -> x.getId() == id);

    }
}
