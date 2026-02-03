package dockerservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> printHello() {
        return ResponseEntity.ok("Hello from Docker Controller and is currently in a stage to dockerize");

    }

}
