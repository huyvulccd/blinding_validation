package vn.amela.validation.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.amela.validation.model.Input;

import javax.validation.Valid;

@Controller
public class ValicationController {
    @GetMapping("")
    public String callPage(Input input){
        return "index";
    }

    @PostMapping("/")
    public String validate(@Valid Input input, Errors errors, Model model){
        if (null != errors && errors.getErrorCount() > 0) {
            return "index";
        } else {
            model.addAttribute("successMsg", "Details saved successfully!!");
            model.addAttribute("name", input.getName());
            model.addAttribute("address", input.getAddress());
            model.addAttribute("phone", input.getNumber());
            return "success";
        }
    }
}
