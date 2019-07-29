package org.chrishale.ttbu.manatee.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Chrismal Panditharathne <chrismal@innovware.com>
 */
public class JPAUtility {
 	private static final EntityManagerFactory emFactory;
	static {
		   emFactory = Persistence.createEntityManagerFactory("org.chrishale.ttbu_manatee_war_1.0-SNAPSHOTPU");
	}
	public static EntityManager getEntityManager(){
		return emFactory.createEntityManager();
	}
	public static void close(){
		emFactory.close();
	}    
}
