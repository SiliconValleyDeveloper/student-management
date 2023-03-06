package developer.studentmanagement.controller;

import developer.studentmanagement.entity.Student;
import developer.studentmanagement.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {
    private StudentService studentService;


    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }


    // handle method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }


    @GetMapping("/students/new")
    public String  createStudentFrom(Model model){

        //create student object to hold student from data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }


    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent();
    }


    @GetMapping("/students/edit/{id}")
    public String saveStudent(@ModelAttribute Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }
}
