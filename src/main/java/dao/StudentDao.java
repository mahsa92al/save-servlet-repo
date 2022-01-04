package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entity.Student;
import util.HibernateUtil;

/**
 * @author Mahsa Alikhani m-58
 */
public class StudentDao {
    private SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

    public void saveNewStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
}
