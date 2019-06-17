package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController2 {

    @Autowired
    private SimpMessagingTemplate greetingController;

    @PostMapping("hello2")
    public String greeting2(@RequestBody HelloMessage message) throws Exception {
        greetingController.convertAndSend("/topic/greetings", new Greeting(message.getName()));
        return message.getName();
    }

}
