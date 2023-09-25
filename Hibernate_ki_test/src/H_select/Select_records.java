package H_select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Workers;


public class Select_records {
	public static void main(String[] args)  {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Workers.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Workers wor=ss.get(Workers.class,101);
		
		
		System.out.println(wor);
		
}
} 