package deep.com.example.springfirstproject.servic.impl;

import deep.com.example.springfirstproject.servic.ServiceSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

@Service
public class ServiceImpl implements ServiceSms {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity<?> smsSend() throws IOException {
        String apikey="xw0yZLUVROvlo68rFia2tmYWheM7IcTSquACKBEjsHJDgbnG39LK4kZu3dMA8wSrfm50UsRWpiT1bIVo";
        String sender_id="FastSM";
        String message="Deepika Prasad";
        String language="english";
        String route="v3";
        String numbers="8789574759";
        String myUrl="https://www.fast2sms.com/dev/bulkV2?authorization="+apikey+"&sender_id="+sender_id+"&message="+message+"&route="+route+"&numbers=8789574759";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(
                myUrl, HttpMethod.GET, entity, String.class);
    }

    @Override
    public ResponseEntity<?> throwTest() {
        int a=10,b=0;
        int s;
        try {
            if (a == 0) {
                throw new Exception();
            }
            s = a / b;
        } catch(Exception e){
            System.out.println(e);
        }
        return new ResponseEntity<>("SUCCESS",HttpStatus.OK);
    }
}
