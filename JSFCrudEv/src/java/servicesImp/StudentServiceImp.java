/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesImp;

import entity.Student;
import java.util.List;
import org.hibernate.Session;
import util.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import services.StudentService;

/**
 *
 * @author Student J2ee-37
 */
public class StudentServiceImp implements StudentService{

    @Override
    public void save(Student studnet) {
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        sn.save(studnet);
        sn.getTransaction().commit();
    }

    @Override
    public void update(Student studnet) {
        
    }

    @Override
    public void delete(Student studnet) {
        
    }

    @Override
    public List<Student> getSttudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    
}
