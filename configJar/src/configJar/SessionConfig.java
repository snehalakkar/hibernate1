package configJar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class SessionConfig {
	private static SessionFactory factory;

	static {
		Configuration cfg = new Configuration().configure();
		factory = cfg.buildSessionFactory();
	}

	public static SessionFactory getFactory() {
		return factory;
	}
	
	private SessionConfig(){
		
	}
}
