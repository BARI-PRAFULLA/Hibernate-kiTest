package H_delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Workers;

public class Delete_records {
	public static void main(String[] args)  {
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Workers.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Workers wor=new Workers(102,"mukesh");
		
		ss.delete(wor);
		tx.commit();
		
		System.out.println("Data Deleted...");
		
}
}
