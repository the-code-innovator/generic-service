package com.thecodeinnovator.genericservice.generic.interfaces;

import java.util.List;

public abstract interface GenericServiceInterface<E, K> {
    public void saveOrUpdate(E entity);
    public List<E> getAll();
    public E get(K id);
    public void add(E entity);
    public void update(E entity);
    public void remove(E entity);
}