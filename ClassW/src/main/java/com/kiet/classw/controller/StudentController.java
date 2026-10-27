
package com.kiet.classw.controller;

import com.kiet.classw.model.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(101, "Rahul Sharma", "rahul@kiet.edu",
                    "CSE(AI & ML)", 2, 8.65),
            new Student(102, "Priya Singh", "priya@kiet.edu",
                    "CSE", 2, 9.20),
            new Student(103, "Aman Verma", "aman@kiet.edu",
                    "IT", 3, 8.40),
            new Student(104, "Neha Gupta", "neha@kiet.edu",
                    "ECE", 2, 9.10),
            new Student(105, "Rohit Kumar", "rohit@kiet.edu",
                    "CSE", 3, 7.85)
    ));

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    // Get student by ID
    @GetMapping("/{studentId}")
    public ResponseEntity<?> getStudentById(
            @PathVariable int studentId) {

        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                return ResponseEntity.ok(s);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Student not found"));
    }

    // Add student
    @PostMapping
    public ResponseEntity<?> addStudent(
            @RequestBody Student student) {

        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body(Map.of("message",
                                "Student ID already exists"));
            }
        }

        students.add(student);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(student);
    }

    // Update student
    @PutMapping("/{studentId}")
    public ResponseEntity<?> updateStudent(
            @PathVariable int studentId,
            @RequestBody Student updatedStudent) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                updatedStudent.setStudentId(studentId);
                students.set(i, updatedStudent);
                return ResponseEntity.ok(updatedStudent);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Student not found"));
    }

    // Delete student
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Map<String, String>> deleteStudent(
            @PathVariable int studentId) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                return ResponseEntity.ok(
                        Map.of("message",
                                "Student deleted successfully"));
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("message", "Student not found"));
    }

    // Search by branch and year
    @GetMapping("/search")
    public List<Student> searchStudents(
            @RequestParam String branch,
            @RequestParam int year) {

        List<Student> result = new ArrayList<>();

        for (Student s : students) {
            if (s.getBranch().toLowerCase()
                    .startsWith(branch.toLowerCase())
                    && s.getYear() == year) {
                result.add(s);
            }
        }

        return result;
    }

    // Find students with minimum CGPA
    @GetMapping("/topper")
    public List<Student> getToppers(
            @RequestParam double cgpa) {

        List<Student> result = new ArrayList<>();

        for (Student s : students) {
            if (s.getCgpa() >= cgpa) {
                result.add(s);
            }
        }

        return result;
    }
}
