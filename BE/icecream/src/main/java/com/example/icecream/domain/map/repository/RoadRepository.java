package com.example.icecream.domain.map.repository;

import com.example.icecream.domain.map.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoadRepository extends JpaRepository<Road, Integer> {
}
