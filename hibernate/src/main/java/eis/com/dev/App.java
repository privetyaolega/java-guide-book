package eis.com.dev;

import eis.com.dev.helpers.HibernateUtil;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
    }
}