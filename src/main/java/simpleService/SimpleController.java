package simpleServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/aaa")
	public SimpleModel home() {
		return new SimpleModel("teste");
	}
}