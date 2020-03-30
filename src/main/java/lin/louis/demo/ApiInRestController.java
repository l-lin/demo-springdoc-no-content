package lin.louis.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/rest-controller")
public class ApiInRestController {
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void api() {}
}
