package br.com.maps.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MapsService {
	
	@Autowired
	private MapRepository mapRepository;
	
	public List<Map> findMaps() {
		return mapRepository.findAll();
	}

	public void saveAll(Map map) {
		mapRepository.save(map);
	}

}
