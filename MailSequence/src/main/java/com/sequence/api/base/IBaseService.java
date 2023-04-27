package com.sequence.api.base;

import java.util.List;

/**
 * Base generic service that expose generic methods for CRUD operations
 *
 * @author Nawaz
 */
public interface IBaseService<E, ID> {

    /**
     * Save the entity
     *
     * @param e Desc
     * @return Desc
     */
    E save(E e);

    /**
     * Takes the list of entity, save list of entity
     *
     * @param list Desc
     * @return Desc
     */
    List<E> saveAll(List<E> list);

    /**
     * Finds By ID
     *
     * @param id Desc
     * @return Desc
     */
    E findById(ID id);

    /**
     * Delete the entity
     *
     * @param e Desc
     */
    void delete(E e);
}
