package eis.com.dev.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "car")
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long price;
    String model;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    User user;

    public Car(long price, String model) {
        this.price = price;
        this.model = model;
    }
}
