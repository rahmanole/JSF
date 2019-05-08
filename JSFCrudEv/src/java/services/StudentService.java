/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Student;
import java.util.List;

/**
 *
 * @author Student J2ee-37
 */
public interface StudentService {
    public void save(Student studnet);
    public void update(Student studnet);
    public void delete(Student studnet);
    public List<Student> getSttudents();
}
