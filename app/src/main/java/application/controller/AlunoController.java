package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @RequestMapping("/list")
    public String list() {
        return "/aluno/list";
    }
}
