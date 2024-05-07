package com.management.track.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.track.entity.Brand;
import com.management.track.repository.BrandRepository;

@Service
public class BrandServiceImpl implements com.management.track.service.BrandService {
	@Autowired
	BrandRepository brandRepository;
	@Override
	public Brand addBrand(Brand brand) {
		return brandRepository.save(brand);
	}
	@Override
	public Brand updateBrand(Brand brand) {
		return brandRepository.save(brand);
	}
	@Override
	public void deleteBrand(Long brandId) {
		brandRepository.deleteById(brandId);
	}
	@Override
	public Brand getBrandById(Long brandId) {
		Optional<Brand> brand=brandRepository.findById(brandId);
		if(brand.isPresent()) {
			return brand.get();
		}else {
			return null;
		}
	}
	@Override
	public List<Brand> getAllBrands() {
		List<Brand> brands=brandRepository.findAll();
		return brands;
	}

}
