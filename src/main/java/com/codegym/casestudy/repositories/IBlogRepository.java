package com.codegym.casestudy.repositories;

import com.codegym.casestudy.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Long> {
    @Query(value = "SELECT * FROM blog ORDER BY post_time DESC", nativeQuery = true)
    Iterable<Blog> findAllByDateDesc();
    Iterable<Blog> findAllByTitleContainingOrderByPostTimeDesc(String keyWord);
    Iterable<Blog> findAllByCategory_IdOrderByPostTimeDesc(Long id);
}