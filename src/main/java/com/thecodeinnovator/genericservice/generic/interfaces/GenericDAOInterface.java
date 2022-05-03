package com.thecodeinnovator.genericservice.generic.interfaces;

import java.util.List;

public abstract interface GenericDAOInterface <E, K> {
    public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(K key);
    public List<E> getAll() ;
}