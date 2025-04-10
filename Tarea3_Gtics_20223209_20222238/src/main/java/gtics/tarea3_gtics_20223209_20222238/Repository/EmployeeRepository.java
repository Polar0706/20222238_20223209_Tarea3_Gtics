package gtics.tarea3_gtics_20223209_20222238.Repository;
import gtics.tarea3_gtics_20223209_20222238.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
