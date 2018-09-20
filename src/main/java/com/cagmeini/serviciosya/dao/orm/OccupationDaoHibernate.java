package com.cagmeini.serviciosya.dao.orm;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.OccupationEntity;
import com.cagmeini.serviciosya.dao.DaoException;
import com.cagmeini.serviciosya.dao.repositories.IOccupationDao;

public class OccupationDaoHibernate implements IOccupationDao{

	
	

	private SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory ();


    private static final Logger logger= Logger.getLogger (OccupationDaoHibernate.class);
    
	@Override
	public void create(OccupationEntity target) {

		if (target == null) {

            logger.warn ("occupation object is null!");
            return;
        }

        Session session = null;
        Transaction tx = null;
        try {

            logger.debug ("Getting hibernate session...");
            session = this.sessionFactory.openSession ();
            tx = session.beginTransaction ();

            logger.debug (String.format ("Creating new occupation %s", target));
            session.save (target);
            tx.commit ();
            logger.debug (String.format ("New occupation %s created!", target));

        } catch (Exception e) {

            logger.error (String.format ("Error creating new occupation %s", target));
            tx.rollback ();
            throw new DaoException(e.getMessage (), e);

        } finally {

            session.close ();
        }
		
	}

	@Override
	public void update(OccupationEntity target) {
		// Validate the arguments.
		
		if(target == null ) {
			logger.warn ("occupation object is null");
			return;
		}
				
		Session session = null;
		Transaction t = null;
			
		try {
			
			logger.debug("Getting hibernate session...");
					
			session = this.sessionFactory.openSession();
			t = session.beginTransaction();
				
			logger.debug (String.format ("Updating new occupation %s", target));
					
			session.update(target);
			t.commit(); // guardar el cambio 
					
			logger.debug(String.format("New occupation %s" , target));
					
		}catch (Exception e) {
					
			logger.error("Error updating new occupation");
			t.rollback();
					
			throw new DaoException(e.getMessage(), e);
			
		}finally {
					
			session.close();
		}
		
		
	}

	@Override
	public void delete(Integer id) {// Validate the arguments.
		
		if(id == null ) {
			logger.warn ("occupation object is null");
			return;
		}
		
		Session session = null;
		Transaction t = null;
		
		try {
			
			logger.debug("Getting hibernate session...");
			
			session = this.sessionFactory.openSession();
			t = session.beginTransaction();
			
			logger.debug (String.format ("Deleting occupation by id %s", id.toString ()));
			// buscamos el objeto por el id q le mando 
			CityEntity p = (CityEntity) session.get(CityEntity.class, id);
			
			if ( p != null) {
				session.delete(p);
				t.commit();
                logger.debug (String.format ("occupation by id %s deleted!", id.toString ()));

			}else {
                logger.warn (String.format ("occupation by id %s not found!", id.toString ()));
            }
			
		}catch (Exception e) {
			
			logger.error (String.format ("Error deleting occupation id %s", id.toString ()));
			t.rollback();
			
			throw new DaoException(e.getMessage(), e);
		}finally {
			
			session.close();
		}		
		
	}

	
	@Override
	public List<OccupationEntity> findAll() {

		List<OccupationEntity> list = null ;
		
		Session session = null;
		try {

            logger.debug ("Getting hibernate session...");
            session = this.sessionFactory.openSession ();

            logger.debug ("Finding all city");
            list = (List<OccupationEntity>) session.createCriteria (OccupationEntity.class).list ();

        } catch (Exception e) {

            logger.error ("Error finding all occupation id");
            throw new DaoException (e.getMessage (), e);

        } finally {

            session.close ();
        }

		return list;
	}

	@Override
	public OccupationEntity findById(Integer id) {
		
		// Validate the arguments.
        if (id == null) {

            logger.warn ("Id occupation is null!");
            return null;
        }

        Session session = null;
        try {

            logger.debug ("Getting hibernate session...");
            session = this.sessionFactory.openSession ();

            logger.debug (String.format ("Finding occupation by id %s", id.toString ()));
            OccupationEntity p = (OccupationEntity) session.createCriteria(CityEntity.class)
            					.add(Restrictions.eq("id",id)).uniqueResult();
            
            		
            if (p != null) {

                return p;
            } else {

                logger.warn (String.format ("Occupation by id %s not found!", id.toString ()));
                return null;
            }

        } catch (Exception e) {

            logger.error (String.format ("Error finding occupation id %s", id.toString ()));
            throw new DaoException (e.getMessage (), e);

        } finally {

            session.close ();
        }
		
		
	}

}
