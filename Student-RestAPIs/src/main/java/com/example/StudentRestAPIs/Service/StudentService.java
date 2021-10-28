package com.example.StudentRestAPIs.Service;

import com.example.StudentRestAPIs.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
//TODO: Hard coded this for coding will remove once connected to database
    List<Student> studentList = Arrays.asList(
            new Student("Adeyinka", "female", 20),
            new Student("yemi", "Male", 25),
            new Student("yeni", "Male", 28),
            new Student("yonii", "Male", 29),
            new Student("yoniade", "Female", 39),
            new Student("yola", "Female", 21));

    public List<Student> getMales(){


        List<Student> males =studentList.stream().filter(student -> student
                .getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());
        return males;
    }

        public List<Student> getfemales(){
        List<Student> females =studentList.stream().filter(student -> student
                        .getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.toList());
        return females;
    }
}
