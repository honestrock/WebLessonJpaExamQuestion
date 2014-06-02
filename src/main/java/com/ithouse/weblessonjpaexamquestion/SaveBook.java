/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ithouse.weblessonjpaexamquestion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author apple
 */
public class SaveBook {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.ithouse_WebLessonJpaExamQuestion_jar_1.0-SNAPSHOTPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trx=em.getTransaction();
        
        Book firstBook=new Book();
        firstBook.setAuthor("Mert Kaya");
        firstBook.setName("Mert Kaya Jpa WorkShop");
        firstBook.setPrice(0.0);
        
        trx.begin();
        em.persist(firstBook);
        trx.commit();
        
   
    }
}
