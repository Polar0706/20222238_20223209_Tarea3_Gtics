package gtics.tarea3_gtics_20223209_20222238.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "regions")
public class Regions {
    @Id
    @Column(name = "region_id")
    private Long id;

    @Column(name = "region_name", length = 25)
    private String name;

}