package com.codegym.casestudy.repositories;

import com.codegym.casestudy.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITagRepository extends CrudRepository<Tag,Long> {
}
