package deep.com.example.springfirstproject.servic;

import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.MalformedURLException;

public interface ServiceSms {
    public ResponseEntity<?> smsSend() throws IOException;

    public ResponseEntity<?> throwTest();
}
