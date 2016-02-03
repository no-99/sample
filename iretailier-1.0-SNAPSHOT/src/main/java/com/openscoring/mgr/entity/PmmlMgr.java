package com.openscoring.mgr.entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.openscoring.mgr.model.FileMeta;

public class PmmlMgr {

	private static SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static List listModel() {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
//		Pmml pmml = new Pmml();
//		pmml.setUuid("017");
//		pmml.setCode("M001");
//		pmml.setEffectDate(new Date());
//		pmml.setLastModifiedBy("shenyu");
//		pmml.setLastModifiedTime(new Date());
//		pmml.setModelDesc("DecisionTreeIris model");
//		pmml.setName("DecisionTreeIris");
//		pmml.setProjectId("pro-1");
//		pmml.setVersion("V2.0");
		Query query = session.createQuery("from Pmml");
		query.setCacheable(true);
		List pmmls = query.list();
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
		return pmmls;
	}
	
	public static List<FileMeta> listFileMeta() {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
//		Pmml pmml = new Pmml();
//		pmml.setUuid("017");
//		pmml.setCode("M001");
//		pmml.setEffectDate(new Date());
//		pmml.setLastModifiedBy("shenyu");
//		pmml.setLastModifiedTime(new Date());
//		pmml.setModelDesc("DecisionTreeIris model");
//		pmml.setName("DecisionTreeIris");
//		pmml.setProjectId("pro-1");
//		pmml.setVersion("V2.0");
		Query query = session.createQuery("from FileMeta");
		query.setCacheable(true);
		List<FileMeta> fileMetas = query.list();
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
		return fileMetas;
	}

	public static void saveModel(Pmml model) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(model);
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
	}
	public static void updateModel(Pmml model) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(model);
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
	}
	
	public static void saveFileMeta(FileMeta fileMeta) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(fileMeta);
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
	}
	public static void updateFileMeta(FileMeta fileMeta) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(fileMeta);
//		session.getTransaction().commit();
//		session.disconnect();
		session.close();
	}

	public static Pmml getModel(String id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from Pmml where uuid='" + id + "'");
		List pmmls = query.list();
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
		return (Pmml) pmmls.get(0);
	}
	
	public static FileMeta getFileMeta(String fileMetaUuid) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from FileMeta where uuid='" + fileMetaUuid + "'");
		List pmmls = query.list();
		session.getTransaction().commit();
//		session.disconnect();
//		session.close();
		return (FileMeta) pmmls.get(0);
	}
}
