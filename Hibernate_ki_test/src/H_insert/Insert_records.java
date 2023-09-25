package H_insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Workers;

public class Insert_records {
          
	public static void main(String[] args)  {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Workers.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Workers wor=new Workers(101,"Ramesh");
		
		ss.save(wor);
		tx.commit();
		
		System.out.println("Data Inserted...");
		
}
}