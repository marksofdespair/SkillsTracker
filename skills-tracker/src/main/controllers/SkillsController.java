package org.launchcode.skillstracker1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String HTML(){
        String HTML = "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>What skills have we learned? Here's a list.</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Pearl (Joke)</li>" +
                "</ol>" +
                "</html>";
        return HTML;
    };
    @GetMapping("form")
    @ResponseBody
    public String form(){

    };
}