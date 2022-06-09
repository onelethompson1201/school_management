package za.ac.cput.repository;

import java.util.Optional;

public interface IRepository<T, ID> {

    T create(T t);
    Optional<T> read(ID id);
    T update(T t);
    void delete(ID id);
}

