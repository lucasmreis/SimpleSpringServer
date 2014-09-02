package simpleServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/")
	public SimpleModel home(@RequestParam(value="name", required=false, defaultValue="Lucas Reis") String name) {
		return new SimpleModel(name);
	}
}