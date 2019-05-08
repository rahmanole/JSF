package entity;

import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column(nullable = false, length = 70)
    private String email;

    private String gender;
    private String round;
    private Date stringDate;
    private boolean status;
    @Column(name = "completed_courses")
    private String[] completedCourses;
    private String note;

    public Student() {
    }

    public Student(int id, String name, String email, String gender, String round, Date stringDate, boolean status, String[] completedCourses, String note) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.stringDate = stringDate;
        this.status = status;
        this.completedCourses = completedCourses;
        this.note = note;
    }

    public Student(String name, String email, String gender, String round, Date stringDate, boolean status, String[] completedCourses, String note) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.stringDate = stringDate;
        this.status = status;
        this.completedCourses = completedCourses;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getStringDate() {
        return stringDate;
    }

    public void setStringDate(Date stringDate) {
        this.stringDate = stringDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(String[] completedCourses) {
        this.completedCourses = completedCourses;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
