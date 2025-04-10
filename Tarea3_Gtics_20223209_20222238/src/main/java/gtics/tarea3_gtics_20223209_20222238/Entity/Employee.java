package gtics.tarea3_gtics_20223209_20222238.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name="first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 25)
    private String lastName;

    @Column(name="email", nullable = false, length = 25)
    private String email;

    @Column(name="phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name="hire_date", nullable = false)
    private Date hireDate;

    @Column(name="job_id", nullable = false, length = 10)
    private String jobId;   

    @Column(name="salary", nullable = false)
    private double salary;

    @Column(name="commision_pct", nullable = false)
    private double commisionPct;

    @Column(name="manager_id", nullable = false)
    private Integer managerId;

}
