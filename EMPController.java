package Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.EMP;

public class EMPController {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(EMP.class);
	cfg.configure();
	
	SessionFactory sf = cfg.buildSessionFactory();
	
	Session ss = sf.openSession();
	
	Transaction TX = ss.beginTransaction();
	
	EMP ee = new EMP(502,"j2EE",100,"nashik");
	
	ss.save(ee);
	
	TX.commit();
	
	System.out.println("data inserted successfully");
	
	}
}
