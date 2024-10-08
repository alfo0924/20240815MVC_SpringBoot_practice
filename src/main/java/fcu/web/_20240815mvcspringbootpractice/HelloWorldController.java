package fcu.web._20240815mvcspringbootpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";

    }

    @GetMapping("/greeting2")
    public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "form MVC_Java_World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}