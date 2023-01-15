package com.example.hassoback;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class MessageController {
    @Autowired
    DispachService dispachService;

    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> send(@RequestBody String message) {
        dispachService.sendMessage(message);
        return ResponseEntity.ok("Hello World!");
    }
}
