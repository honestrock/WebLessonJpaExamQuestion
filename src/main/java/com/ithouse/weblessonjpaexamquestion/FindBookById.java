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
public class FindBookById {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.ithouse_WebLessonJpaExamQuestion_jar_1.0-SNAPSHOTPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trx=em.getTransaction();
        
        Book secondBook=new Book();
        secondBook.setAuthor("Mert Kaya");
        secondBook.setName("Who Am I ?");
        secondBook.setPrice(0.0);
        
        trx.begin();
        em.persist(secondBook);
        trx.commit();
        
        Book findBookById=em.find(Book.class, secondBook.getId());
        
        System.out.println("Eşit mi?: "+secondBook.equals(findBookById));
        System.out.println("Eşit mi?: "+secondBook.equals(findBookById));
        
        
    }
}
