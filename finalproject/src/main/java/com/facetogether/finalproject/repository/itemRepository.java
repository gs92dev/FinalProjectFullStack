package com.facetogether.finalproject.repository;

import com.facetogether.finalproject.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepository extends JpaRepository<Item,Integer> {
}
