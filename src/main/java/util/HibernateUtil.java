package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Mahsa Alikhani m-58
 */
public class HibernateUtil {
    public static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory(){
        if(sessionFactory == null){
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
