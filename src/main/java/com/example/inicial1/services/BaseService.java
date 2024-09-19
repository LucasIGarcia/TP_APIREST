package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E> {
    //Metodo que obtiene una lista con todas las entidades (persona) que se encuentran en la Base de Datos
    public List<E> findAll() throws Exception;

    //Metodo que obtiene una persona segun el ID que le pase
    public E findById(Long id) throws Exception;

    //Metodo que crea una entidad
    public E save(E entity) throws Exception;

    //Metodo para actualizar una entidad
    public E update(Long id, E entity) throws Exception;

    //Metodo para eliminar una entidad
    public boolean delete(Long id) throws Exception;
}
