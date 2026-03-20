package com.product.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import com.product.dto.ProductDto;
import com.product.entity.ProductEntity;
import com.product.exceptions.ResourceNotFoundException;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository repo;
	private ModelMapper mapper;
	
	public ProductServiceImpl(ProductRepository repo,ModelMapper mapper) {
		super();
		this.repo=repo;
		this.mapper=mapper;
	}

	@Override
	public ProductDto add(ProductDto dto) {
		// TODO Auto-generated method stub
		 ProductEntity product= mapper.map(dto, ProductEntity.class);
		 
		return mapper.map(repo.save(product), ProductDto.class);
	}

	@Override
	public Optional<ProductDto> getById(int id) {
		// TODO Auto-generated method stub
		 Optional<ProductEntity> product= repo.findById(id);
		 
		 
		return product.map(prod->mapper.map(prod, ProductDto.class));
		 
	}

	@Override
	public List<ProductDto> getAll() {
		// TODO Auto-generated method stub
		List<ProductEntity> list=  repo.findAll();
		return list.stream().map(prod->mapper.map(prod, ProductDto.class)).collect(Collectors.toList());
		
 
	}

	@Override
	public ProductDto updateById(int id, ProductDto dto) {
		// TODO Auto-generated method stub\
		//if product with given id ->>create a new resource
		if(!repo.existsById(id)) {
//			ProductEntity product= mapper.map(dto, ProductEntity.class);
//			ProductEntity product2= repo.save(product);//resource with given id created as it was not found in database
//			return mapper.map(product2, ProductDto.class);
			throw new ResourceNotFoundException("Resource not found");
			
		}
		
	    ProductEntity product=	repo.findById(id).get();//no need to collect in optional class as we are sure that product with this id already exist
//	    product.setName(dto.getName());
//	    product.setPrice(dto.getPrice());
//	    product.setCountryOfOrigin(dto.getCountryOfOrigin());
	    
	      ProductEntity product2= mapper.map(dto, ProductEntity.class);
	      product2.setId(id);
	      
	   
	    
	    
		return mapper.map(repo.save(product2), ProductDto.class);
	}

//	@Override
//	public ProductDto partialUpdateById(int id, Map<String, Object> updates) {
//		// TODO Auto-generated method stub
//		
//		if(!repo.existsById(id)) {
//			throw new ResourceNotFoundException("Product with this id does not exist");
//			
//		}
//		
//		 ProductEntity product= repo.findById(id).get();
//		 
//		 updates.forEach((field,value)->{
//			 Field fieldToBeUpdated=ReflectionUtils.findRequiredField(ProductEntity.class,field);
//		 });
//		 
//		return null;
//	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Product with id:" + id + " is successfully deleted from db";
	}

}

