package com.management.track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.track.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
