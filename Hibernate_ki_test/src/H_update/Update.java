package H_update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Workers;

public class Update {
	public static void main(String[] args)  {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Workers.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Workers wor=new Workers(101,"ram");
		
		ss.update(wor);
		tx.commit();
		
		System.out.println("Data Updated...");
		
}
}
