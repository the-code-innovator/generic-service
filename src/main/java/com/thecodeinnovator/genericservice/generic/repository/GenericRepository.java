package com.thecodeinnovator.genericservice.generic.repository;

import java.util.Optional;

import com.thecodeinnovator.genericservice.generic.entity.GenericEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository <T extends GenericEntity<T>> extends CrudRepository<T, Long> {
    Page<T> findAll(Pageable pageable);
    T save(T dbDomain);
    void deleteById(Long id);
    Optional<T> findById(Long id);
}