package gtics.tarea3_gtics_20223209_20222238.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="jobs")
public class Jobs {

    @Id
    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;

    @Column(name="job_title", nullable = false, length = 20)
    private String jobTitle;

    @Column(name="min_salary", nullable = false)
    private Integer minSalary;

    @Column(name="max_salary", nullable = false)
    private Integer maxSalary;

}
