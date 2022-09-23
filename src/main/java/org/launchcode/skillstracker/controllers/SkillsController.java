package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

// contains h1 h2 and ol of 3 langs for
    @GetMapping()
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> List of Skills to Learn </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>html</li>" +
                "</ol>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'post'>" +
                "<label>Name:</label>" +
                "</br></br>" + // submit a request to /hello
                "<input type = 'text' name = 'name' />" +
                "</br></br>" +
                "<label>My Favorite Language:</label>" +
                "</br></br>" +
                "<select name = 'language' id='lang1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JSC'>JavaScript</option>" +
                "<option value = 'html'>html</option>" +
                "</select>" +
                "</br></br>" +
                "<label>My Second Favorite Language:</label>" +
                "</br></br>" +
                "<select name = 'language' id='lang2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JSC'>JavaScript</option>" +
                "<option value = 'html'>html</option>" +
                "</select>" +
                "</br></br>" +
                "<label>My Third Favorite Language:</label>" +
                "</br></br>" +
                "<select name = 'language' id='lang3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JSC'>JavaScript</option>" +
                "<option value = 'html'>html</option>" +
                "</select>" +
                "</br></br>" +
                "<form action = '/page' method = 'post'>" + // submit a request to /page
                "<input type = 'submit' value = 'Test' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }


}
