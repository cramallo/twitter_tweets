package com.twitter.tweets.infraestracture.repositories;

import com.twitter.tweets.infraestracture.entities.TweetEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTweetRepository extends JpaRepository<TweetEntity, Long>,
        JpaSpecificationExecutor<TweetEntity> {

    @Override
    Page<TweetEntity> findAll(final Specification<TweetEntity> spec, final Pageable pageable);
}
