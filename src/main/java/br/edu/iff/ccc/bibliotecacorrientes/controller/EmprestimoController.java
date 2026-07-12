package br.edu.iff.ccc.bibliotecacorrientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmprestimoController {

    @GetMapping("/emprestimos")
    public String emprestimos() {
        return "emprestimos";
    }

    @GetMapping("/devolucoes")
    public String devolucoes() {
        return "devolucoes";
    }

    @GetMapping("/atrasados")
    public String atrasados() {
        return "atrasados";
    }
}