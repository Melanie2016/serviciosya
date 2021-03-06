package com.cagmeini.serviciosya.dao.orm;

//import java.util.List;
//
//import org.apache.log4j.Logger;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;
//
//import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
//import com.cagmeini.serviciosya.dao.DaoException;
//import com.cagmeini.serviciosya.dao.repositories.IProvinceDao;



//public class ProvinceDaoHibernate implements IProvinceDao{
public class ProvinceDaoHibernate {
	
//	
//	
//	private SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory ();
//
//
//    private static final Logger logger= Logger.getLogger (ProvinceDaoHibernate.class);
//    
//	@Override
//	public void create(ProvinceEntity target) {
//
//		if (target == null) {
//
//            logger.warn ("Province object is null!");
//            return;
//        }
//
//        Session session = null;
//        Transaction tx = null;
//        try {
//
//            logger.debug ("Getting hibernate session...");
//            session = this.sessionFactory.openSession ();
//            tx = session.beginTransaction ();
//
//            logger.debug (String.format ("Creating new province %s", target));
//            session.save (target);
//            tx.commit ();
//            logger.debug (String.format ("New province %s created!", target));
//
//        } catch (Exception e) {
//
//            logger.error (String.format ("Error creating new province %s", target));
//            tx.rollback ();
//            throw new DaoException(e.getMessage (), e);
//
//        } finally {
//
//            session.close ();
//        }
//		
//	}
//
//	@Override
//	public void update(ProvinceEntity target) {
//		// Validate the arguments.
//		
//		if(target == null ) {
//			logger.warn ("Province object is null");
//			return;
//		}
//				
//		Session session = null;
//		Transaction t = null;
//			
//		try {
//			
//			logger.debug("Getting hibernate session...");
//					
//			session = this.sessionFactory.openSession();
//			t = session.beginTransaction();
//				
//			logger.debug (String.format ("Updating new Province %s", target));
//					
//			session.update(target);
//			t.commit(); // guardar el cambio 
//					
//			logger.debug(String.format("New Province %s" , target));
//					
//		}catch (Exception e) {
//					
//			logger.error("Error updating new Province");
//			t.rollback();
//					
//			throw new DaoException(e.getMessage(), e);
//			
//		}finally {
//					
//			session.close();
//		}
//		
//		
//	}
//
//	@Override
//	public void delete(Integer id) {// Validate the arguments.
//		
//		if(id == null ) {
//			logger.warn ("Province object is null");
//			return;
//		}
//		
//		Session session = null;
//		Transaction t = null;
//		
//		try {
//			
//			logger.debug("Getting hibernate session...");
//			
//			session = this.sessionFactory.openSession();
//			t = session.beginTransaction();
//			
//			logger.debug (String.format ("Deleting province by id %s", id.toString ()));
//			// buscamos el objeto por el id q le mando 
//			ProvinceEntity p = (ProvinceEntity) session.get(ProvinceEntity.class, id);
//			
//			if ( p != null) {
//				session.delete(p);
//				t.commit();
//                logger.debug (String.format ("Province by id %s deleted!", id.toString ()));
//
//			}else {
//                logger.warn (String.format ("Province by id %s not found!", id.toString ()));
//            }
//			
//		}catch (Exception e) {
//			
//			logger.error (String.format ("Error deleting city id %s", id.toString ()));
//			t.rollback();
//			
//			throw new DaoException(e.getMessage(), e);
//		}finally {
//			
//			session.close();
//		}		
//		
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<ProvinceEntity> findAll() {
//
//		List<ProvinceEntity> list = null ;
//		
//		Session session = null;
//		try {
//
//            logger.debug ("Getting hibernate session...");
//            session = this.sessionFactory.openSession ();
//
//            logger.debug ("Finding all provinces");
//            list = (List<ProvinceEntity>) session.createCriteria (ProvinceEntity.class).list ();
//
//        } catch (Exception e) {
//
//            logger.error ("Error finding all provinces id");
//            throw new DaoException (e.getMessage (), e);
//
//        } finally {
//
//            session.close ();
//        }
//
//		return list;
//	}
//
//	@Override
//	public ProvinceEntity findById(Integer id) {
//		
//		// Validate the arguments.
//        if (id == null) {
//
//            logger.warn ("Id province is null!");
//            return null;
//        }
//
//        Session session = null;
//        try {
//
//            logger.debug ("Getting hibernate session...");
//            session = this.sessionFactory.openSession ();
//
//            logger.debug (String.format ("Finding province by id %s", id.toString ()));
//            ProvinceEntity p = (ProvinceEntity) session.createCriteria(ProvinceEntity.class)
//            					.add(Restrictions.eq("id",id)).uniqueResult();
//            
//            		
//            if (p != null) {
//
//                return p;
//            } else {
//
//                logger.warn (String.format ("Province by id %s not found!", id.toString ()));
//                return null;
//            }
//
//        } catch (Exception e) {
//
//            logger.error (String.format ("Error finding province id %s", id.toString ()));
//            throw new DaoException (e.getMessage (), e);
//
//        } finally {
//
//            session.close ();
//        }
//		
//		
//	}
//
//	
//	
//	
	
	
}
