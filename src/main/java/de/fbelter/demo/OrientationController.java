package de.fbelter.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class OrientationController {

    @MessageMapping("/controllerOrientation")
    @SendTo("/topic/orientation")
    public  String forwardOrientation( String orientationValues) throws Exception {
    	return orientationValues;
    }

}
