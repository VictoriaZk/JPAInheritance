package task2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@EqualsAndHashCode(callSuper = true)
@Data
public class Cat extends Animal {
    private Integer tailLength;
}
