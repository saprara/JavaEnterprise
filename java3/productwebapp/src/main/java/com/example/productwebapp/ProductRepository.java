package com.example.productwebapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
        @Autowired
    protected NamedParameterJdbcTemplate jdbc;

    
    public void insertProduct(Product product){
                MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        String query = "INSERT INTO products(name, description) "+
		"VALUES (:name, :description)";
        namedParameters.addValue("name", product.getName());
        namedParameters.addValue("description", product.getDescription());

        jdbc.update(query, namedParameters);

    }
    
    public List<Product> findAllProducts(){
    MapSqlParameterSource namedParameters = new MapSqlParameterSource();

    String query = "SELECT * FROM products";

    return jdbc.query(query, namedParameters, 
		new BeanPropertyRowMapper<Product>(Product.class));
        
    }
    
    

    
}
