package lin.louis.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping(path = "/controller")
public class ApiInBasicController {
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void api() {}
}
