package com.ltp.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class GradeController {
    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/")
    public String gradeForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        studentGrades.add(grade);
        return "redirect:/grades";
    }

    @GetMapping("/grades")
    public String gradeHandle(Model model) {
        model.addAttribute("listGrade", studentGrades);
        return "grade";
    }
    
    
    
}
