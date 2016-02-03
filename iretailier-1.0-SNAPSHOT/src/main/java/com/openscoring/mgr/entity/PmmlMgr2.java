//package com.openscoring.mgr.entity;
//
//import java.util.Date;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataBuilder;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.SessionFactoryBuilder;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//public class PmmlMgr2 {
//
//	public static void main(String[] args) throws Exception {
//		StandardServiceRegistryBuilder standardRegistryBuilder = new StandardServiceRegistryBuilder();
//		standardRegistryBuilder.configure("hibernate.cfg.xml");
//		StandardServiceRegistry standardRegistry = standardRegistryBuilder.build();
//		MetadataSources sources = new MetadataSources( standardRegistry );
//		sources.addResource("com/openscoring/mgr/entity/pmml.hbm.xml");
////		sources.addResource("com/openscoring/mgr/entity/PmmlFeature.hbm.xml");
//		
//		MetadataBuilder metadataBuilder = sources.getMetadataBuilder();
//		Metadata metadata = metadataBuilder.build();
//		
//		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
//		SessionFactory sessionFactory = sessionFactoryBuilder.build();
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Pmml pmml = new Pmml();
//		pmml.setUuid("005");
//		pmml.setCode("M001");
//		pmml.setEffectDate(new Date());
//		pmml.setLastModifiedBy("shenyu");
//		pmml.setLastModifiedTime(new Date());
//		pmml.setModelDesc("DecisionTreeIris model");
//		pmml.setName("DecisionTreeIris");
//		pmml.setProjectId("pro-1");
//		pmml.setVersion("V2.0");
//		session.save(pmml);
//		session.getTransaction().commit();
//		session.close();
//	}
//
//}
