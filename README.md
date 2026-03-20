@Override
	public ProductDto partialUpdateById(int id, Map<String, Object> updates) {
		// TODO Auto-generated method stub
		
		if(!repo.existsById(id)) {
			throw new ResourceNotFoundException("Product with this id does not exist");
			
		}
		
		 ProductEntity product= repo.findById(id).get();
		 
		 updates.forEach((field,value)->{
			 Field fieldToBeUpdated=ReflectionUtils.findField(ProductEntity.class,field);
			 
			 if(fieldToBeUpdated==null) {
				 throw new RuntimeException("Field not found");
			 }
			 fieldToBeUpdated.setAccessible(true);
			 
			 ReflectionUtils.setField(fieldToBeUpdated, product, value);
			 
		 });
		 
		return mapper.map(repo.save(product), ProductDto.class);
	}
