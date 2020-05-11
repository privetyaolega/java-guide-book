package eis.com.dev.dao;

import eis.com.dev.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);
        List<Customer> customers = query.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return sessionFactory.getCurrentSession().get(Customer.class, id);
    }

    @Override
    public void deleteCustomer(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("delete from Customer where id=:customerId")
                .setParameter("customerId", id)
                .executeUpdate();
    }
}

//        CREATE DATABASE IF NOT EXISTS `web_customer_tracker` /*40100 DEFAULT CHARACTER SET latin1 */;
//        USE `web_customer_tracker`;
//
//        /*!40101 SET @old_character_set_client = @@character_set_client */;
//        /*!40101 SET @old_character_set_results = @@character_set_results */;
//        /*!40101 SET @old_collation_connection = @@collation_connection */;
//        /*!40101 SET names utf8 */;
//        /*!40101 SET @old_time_zone = @@time_zone */;
//        /*!40101 SET time_zone = '+00:00' */;
//        /*!40101 SET @old_unique_checks = @@unique_checks, unique_checks=0 */;
//        /*!40101 SET @old_foreign_key_checks = @@foreign_key_checks, foreign_key_checks=0 */;
//        /*!40101 SET @old_sql_mode = @@sql_mode, sql_mode='NO AUTO VALUE ON ZERO' */;
//        /*!40101 SET @old_sql_notes = @@sql_notes, sql_notes=0 */;
//
//        DROP TABLE IF EXISTS `customer`;
//        /*!40101 SET @saved_cs_client = @@character_set_client */;
//        /*!40101 SET character_set_client = utf8 */;
//        CREATE TABLE `customer` (
//        `id` int NOT NULL auto_increment,
//        `first_name` varchar(45) default null,
//        `last_name` varchar(45) default null,
//        `email` varchar(45) default null,
//        primary key (`id`)
//        ) engine=InnoDb auto_increment=6 default charset=latin1;
//        /*!40101 set character_set_client = @saved_cs_client */;
//
//        LOCK tables `customer` write;
//        /*!40000 alter table `customer` disable keys */;
//
//        INSERT INTO `customer` values
//        (1, 'David', 'Adams', 'david@gmail.com'),
//        (2, 'John', 'Doe', 'jdoe@gmail.com'),
//        (3, 'Ajay', 'Rao', 'arao@gmail.com'),
//        (4, 'Mary', 'Public', 'bpulic@gmail.com'),
//        (5, 'Maxwell', 'Dixon', 'mdixo@gmail.com');
//
//        /*!40000 alter table `customer` enable keys */;
//        unlock tables;
//        /*!40103 set time_zone=@old_time_zone */;








