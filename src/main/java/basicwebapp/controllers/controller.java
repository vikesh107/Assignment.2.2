package basicwebapp.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class controller {
	
	@GetMapping("/msg")
	public ResponseEntity<String> getnotification()
	{
		return new ResponseEntity<String>("Hello-World",HttpStatus.OK);
	}

}
