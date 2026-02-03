package dockerservice.controller;

import dockerservice.dto.DockerDto;
import dockerservice.services.DockerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker")
@RequiredArgsConstructor
public class DockerController {
    private final DockerService dockerService;

    @GetMapping
    public ResponseEntity<String> printHello() {
        return ResponseEntity.ok("Hello from Docker Controller and is currently in a stage to dockerize");

    }

    @PostMapping
    public ResponseEntity<String> createPosts(@RequestBody DockerDto dockerDto) {
        return ResponseEntity.ok(dockerService.createNewPosts(dockerDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DockerDto> getPosts(@PathVariable Long id) {
        return ResponseEntity.ok(dockerService.getPostsById(id));
    }
}
