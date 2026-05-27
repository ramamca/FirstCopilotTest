package com.copilot.demo.FirstCopilotTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CopilotController {

    @GetMapping("/hell")
    public  String getMessage(){
        return "Welcome";
    }
}
