package deep.com.example.springfirstproject.controller;

import deep.com.example.springfirstproject.servic.ServiceSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ServiceSms serviceSms;
    @GetMapping("/normal")
    public ResponseEntity<?> normalUser(){
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

    @GetMapping("/sms")
    public ResponseEntity<?> smsSend() throws IOException {
        return serviceSms.smsSend();
    }

    @GetMapping(path = "/throw")
    public ResponseEntity<?> testThrow(){
        return serviceSms.throwTest();
    }

    @GetMapping("/deep")
    public ResponseEntity<String> deepUser(){
        return ResponseEntity.ok("Think about my goal only and ignore about others thinking and all others thing");
    }

}
