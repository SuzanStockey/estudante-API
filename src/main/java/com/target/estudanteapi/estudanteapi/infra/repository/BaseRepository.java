package com.target.estudanteapi.estudanteapi.infra.repository;

import com.target.estudanteapi.estudanteapi.domain.model.BaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<T extends BaseEntity> extends CrudRepository<T,Long> {

}
