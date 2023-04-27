package com.sequence.api.base;

import com.sequence.api.exception.RestServiceParameterValidationException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.Optional;

/**
 * Abstract class contains Generic implementations to perform the
 *
 * @param <E>
 * @param <ID>
 * @author Nawaz
 */
public abstract class ABaseService<E, ID> implements IBaseService<E, ID> {

    /**
     * {@inheritDoc}
     */
    @Override
    public E save(E entity) {
        return getJPARepository().save(entity);
    }

    @Override
    public void delete(E entity) {
        getJPARepository().delete(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<E> saveAll(List<E> entity) {
        return getJPARepository().saveAll(entity);
    }

    @Override
    public E findById(ID id) {
        return getJPARepository().getReferenceById(id);
    }

    /**
     * JPA repository required to operate the CRUD operations
     *
     * @return {@return }
     */
    protected abstract JpaRepository<E, ID> getJPARepository();

    /**
     * Generically handling of optional fields
     *
     * @param optionalEntity Desc
     * @return {@return }
     */
    public E handleOptional(Optional<E> optionalEntity) {
        return optionalEntity.orElseThrow(() -> new RestServiceParameterValidationException(
                new ObjectError("", "Entity does not exist with ID")));
    }

}