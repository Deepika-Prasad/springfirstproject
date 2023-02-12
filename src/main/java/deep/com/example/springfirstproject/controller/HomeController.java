package deep.com.example.springfirstproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/normal")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("I am brave,Strong,Super confident Deepika Prasad,I am proud of myself and I love myself");
    }

    @GetMapping("/regular")
    public ResponseEntity<String> User(){
        return ResponseEntity.ok("I am brave,Strong,Super confident Deepika Prasad");
    }
    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("Think about my goal only and ignore about others thinking and all others thing");
    }
}
