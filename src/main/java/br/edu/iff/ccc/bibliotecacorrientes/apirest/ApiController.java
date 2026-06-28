package br.edu.iff.ccc.bibliotecacorrientes.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/v1")
    public String api() {
        return "API em construção";
    }
}