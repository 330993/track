package com.management.track.service;

import java.util.List;

import com.management.track.entity.Brand;

public interface BrandService {
	public Brand addBrand(Brand brand);
	public Brand updateBrand(Brand brand);
	public void deleteBrand(Long brandId);
	public Brand getBrandById(Long brandId);
	public List<Brand> getAllBrands();
}
