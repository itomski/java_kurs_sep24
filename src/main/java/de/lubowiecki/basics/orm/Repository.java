package de.lubowiecki.basics.orm;

import java.util.List;

public interface Repository<T> {

    void insert(T o);
    void update(T o);
    T findById(int id);
    List<T> findAll();
    void delete(T o);
    void deleteById(int id);
}
