package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService quote;

    public JokesController(JokeService quote) {
        this.quote = quote;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", quote.getJoke());
        return "index";
    }
}
