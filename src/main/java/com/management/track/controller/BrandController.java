package com.management.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.track.entity.Brand;
import com.management.track.service.BrandService;

@RestController
public class BrandController {
	@Autowired
	BrandService brandService;
	@PostMapping("/api/addbrand")
	public ResponseEntity<?> addBrand(@RequestBody Brand brand){
		Brand addedbrand=brandService.addBrand(brand);
		return new ResponseEntity<Brand>(addedbrand,HttpStatus.OK);
	}
	@PutMapping("/api/updatebrand")
	public ResponseEntity<?> updateBrand(@RequestBody Brand brand){
		Brand updatedbrand=brandService.updateBrand(brand);
		return new ResponseEntity<Brand>(updatedbrand,HttpStatus.OK);
	}
	@DeleteMapping("/api/deletebrand")
	public ResponseEntity<?> deleteBrand(@RequestParam Long brandId){
		brandService.deleteBrand(brandId);
		return new ResponseEntity<String>("Brand successfully deleted!",HttpStatus.OK);
	}
	@GetMapping("/api/getbrandbyid")
	public ResponseEntity<?> getBrandById(@RequestParam Long brandId){
		Brand brand=brandService.getBrandById(brandId);
		return new ResponseEntity<Brand>(brand,HttpStatus.OK);
	}
	@GetMapping("/api/getAllBrands")
	public ResponseEntity<?> getAllBrands(){
		List<Brand> brands=brandService.getAllBrands();
		return new ResponseEntity<List<Brand>>(brands,HttpStatus.OK);
	}

}
