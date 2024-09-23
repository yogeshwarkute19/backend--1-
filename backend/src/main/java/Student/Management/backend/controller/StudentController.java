package Student.Management.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Student.Management.backend.entity.StudentEntity;
import Student.Management.backend.response.DeleteResponse;
import Student.Management.backend.response.StudentResponse;
import Student.Management.backend.service.StudentService;


@RestController
@RequestMapping("/api/students")

public class StudentController {
	
	 @Autowired
	    private StudentService studentService;

	    @PostMapping("/addStudent")
	    public StudentResponse addStudent(@RequestBody StudentEntity student) {
	        return studentService.addStudent(student);
	    }

	    @PutMapping("/updateStudent/{id}")
	    public StudentResponse updateStudent(@PathVariable Long id, @RequestBody StudentEntity student) {
	        return studentService.updateStudent(id, student);
	    }

	    @DeleteMapping("/deleteStudent/{id}")
	    public DeleteResponse deleteStudent(@PathVariable Long id) {
	        return studentService.deleteStudent(id);
	    }

	    @GetMapping("/getStudent/{id}")
	    public StudentEntity getStudent(@PathVariable Long id) {
	        return studentService.getStudent(id);
	    }

	    @GetMapping("/getStudentList")
	    public List<StudentEntity> getAllStudents() {
	        return studentService.getAllStudents();
	    }

}
