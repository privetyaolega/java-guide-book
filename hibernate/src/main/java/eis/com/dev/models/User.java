package eis.com.dev.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = "id")
@ToString(includeFieldNames = false)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String firstName;
    String lastName;

    /* Hibernate annotation
       Определяет тип сохранения данной переменной в базе
       https://docs.jboss.org/hibernate/orm/5.0/mappingGuide/en-US/html/ch03.html */
    @Type(type = "text")
    @Column(name = "email")
    String email;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    Address address;

    @OneToMany(mappedBy = "user")
    List<Car> cars;

    @ManyToMany
    @JoinTable(
            name = "user_course",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    List<Course> courses;
}
