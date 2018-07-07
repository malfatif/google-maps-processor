package br.com.maps.processor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MapRepository extends JpaRepository<Map, Integer>  {

}
