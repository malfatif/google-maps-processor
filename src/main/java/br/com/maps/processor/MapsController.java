package br.com.maps.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1.0/maps", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class MapsController {

	@Autowired
	private MapsService mapsService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Map> findProducts() {
		return mapsService.findMaps();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void saveProducts(@RequestBody(required = true) Map maps) {
		mapsService.saveAll(maps);
	}
	
}
