package eis.com.dev;

import eis.com.dev.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();


        try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
//            session.persist(new User("Test", "Hibernate", "test@hibernate.com", new Address("LeninaTest", 52)));


            User user = session.get(User.class, 1L);
            user.getAddress();
            session.getTransaction().commit();
        }

    }
}
