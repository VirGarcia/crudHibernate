package pacm06_virginia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INICIAMOS...");
		Configuration cfg = new Configuration().configure();
		
		//ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		//SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);		
		SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		
		Session session = sessionFactory.openSession();
		System.out.println("Configuración REALIZADA");
		
		
		//libro
		Transaction tx= session.beginTransaction();
			Libro lb1 = new Libro();
			lb1.setTitulo("Viaje al Centro de la Tierra");
			lb1.setAutor("Julio Verne");
			lb1.setAnio_publicacion(1870);
			lb1.setDisponible(true);
			session.persist(lb1);
			
			Libro lb2 = new Libro("Toy Story", "DisneyPixar", 2001, true);
			session.persist(lb2);
			tx.commit();
		
		//lector
			tx= session.beginTransaction();
			Lector lc1 = new Lector();
			lc1.setNombre("Sandra"); 
			lc1.setApellido("Bullock");
			lc1.setEmail("sandruskibull@telefonica.org");
			lc1.setEdad(6);
			session.persist(lc1);
			Lector lc2 = new Lector("Mary", "English","maryeng@yahoo.es", 47); 
			session.persist(lc2);
			tx.commit();
			
		
		//tx = session.beginTransaction();
		List<Libro> libros = session.createQuery("FROM Libro", Libro.class).getResultList();
		
		for (Libro lb:libros) {
			System.out.println("Libro: " + lb.getTitulo() + ", AnioPubli: " + lb.getAnio_publicacion());
			
		}
		
		List<Lector> lectores = session.createQuery("FROM Lector", Lector.class).getResultList();
		
		for (Lector lc:lectores) {
			System.out.println("Lector: " + lc.getNombre() + ", Edad: " + lc.getEdad());
			
		}
		
		//Obtener la instancia del libro que deseas modificar (por ejemplo, con el ID 1)
			Libro lb = session.get(Libro.class,1);
			
			//Verificar que se encontró la instancia del libro
			if (lb !=null) {
				//Modificar el campo deseado (por ejemplo, la titulo)
				lb.setTitulo("El Quijote");
				
				//Iniciar una transacción
				tx = session.beginTransaction();
				
				try {
					//Realizar la operación de modificación
					session.merge(lb);
					
					//Confirmar la transacción
					tx.commit();
					System.out.println("Libro modificado exitosamente.");
					
				} catch (Exception e) {
					//En caso de error, hacer rollback de la transacción
					tx.rollback();
					System.err.println("Error al modificar el libro: " + e.getMessage());	
				}	
			} else {
				System.err.println("No se encontró el libro con el ID especificado.");			
			}
			
			//Consultar y mostrar todos los libros y lectores
			List<Libro> libros2 = session.createQuery("FROM Libro", Libro.class).getResultList();
			for (Libro li : libros2) {				
				System.out.println("Libro:" + li.getTitulo() + " , autor=" + li.getAutor() + " , anioPublic=" + li.getAnio_publicacion() +" , disponible=" + li.getDisponible() + ".");
				
			}
					
		session.close();
		sessionFactory.close();

	}


}
