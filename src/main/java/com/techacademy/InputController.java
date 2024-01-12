package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getIndex(@RequestParam(name = "previous", required = false) String val, Model model){
        // input.htmlに画面遷移
        model.addAttribute("previous", val);
        return "input";
    }

}