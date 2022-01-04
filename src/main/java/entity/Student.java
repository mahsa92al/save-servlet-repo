package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Mahsa Alikhani m-58
 */
@Setter
@Getter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int studentNumber;
    private String name;
    private String lastName;
    private String email;
    private String grade;
    private String field;
    private String phoneNumber;
    private long nationalNumber;
}
