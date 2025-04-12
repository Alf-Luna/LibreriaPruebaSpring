package com.example.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.model.libro;
import com.example.biblioteca.repository.LibroRepositorio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LIbroService {

    //dependencia
    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<libro> getLibros(){
        return libroRepositorio.obtenerLibro();
    }

    public libro getLibroPorId(int id){
        return libroRepositorio.buscarLibroPorId(id);
    }

    public libro getLibroPorISBN(String isbn){
        return libroRepositorio.buscarLibroPorIsbn(isbn);
    } 

    public libro getLibroPorAutor(String autor){
        return libroRepositorio.buscarLibroPorAutor(autor);
    }

    public void actualizarLibro(libro libro){
        libroRepositorio.actualizarLibro(libro);
    }

    public void eliminarLibro(int id){
        libroRepositorio.eliminarLibro(id);
    }

    public void agregarLibro(libro nuevoLibro){
        libroRepositorio.guardarLibro(nuevoLibro);
    }
}
