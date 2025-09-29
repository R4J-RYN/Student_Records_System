package StuMan.app.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

	 import StuMan.app.Entity.Student;

	public interface StudentRepository extends JpaRepository<Student, Long>{

		

	}


