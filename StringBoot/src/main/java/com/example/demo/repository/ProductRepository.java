package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
@Query("SELECT s FROM PRODUCT s WHERE s.NAME=:name")
Product  findByPname(String pname);

}
