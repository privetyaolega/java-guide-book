package eis.com.dev;

import eis.com.dev.helpers.HibernateUtil;
import eis.com.dev.models.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CarHelper {

    private SessionFactory sessionFactory;

    public CarHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Car> getCarListUsingCriteriaAPI() {
        Session session = sessionFactory.openSession();

        // получения объекта по id
        session.get(Car.class, 1L);

        // этап подготовки запроса
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Car> cq = cb.createQuery(Car.class);
        Root<Car> root = cq.from(Car.class);
        cq.select(root);

        // этап выполнения запроса
        Query<Car> query = session.createQuery(cq);
        List<Car> carList = query.getResultList();

        session.close();
        return carList;
    }

    public void addCar(Car car) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
    }
}
