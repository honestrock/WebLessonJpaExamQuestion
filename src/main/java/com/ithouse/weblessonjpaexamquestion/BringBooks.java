/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ithouse.weblessonjpaexamquestion;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author apple
 */
public class BringBooks {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.ithouse_WebLessonJpaExamQuestion_jar_1.0-SNAPSHOTPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trx=em.getTransaction();
        
        Book uneedtofind=new Book();
        uneedtofind.setAuthor("MK");
        uneedtofind.setName("find me");
        uneedtofind.setPrice(0.0);
        
        trx.begin();
        em.persist(uneedtofind);
        trx.commit();
        
        
        Book singleBook1=em.find(Book.class, uneedtofind.getId());
        System.out.println("İd si 1 olan kitabın adı"+singleBook1.getName());
        
        TypedQuery<Book> singleBook2=em.createQuery("Select k from Book k where k.id=:x", Book.class);
        singleBook2.setParameter("x",uneedtofind.getId());
        
        Book foundBook=singleBook2.getSingleResult();
        System.out.println("Id si 1 olan kitabın adı"+foundBook.getName());
        
        TypedQuery<Book> bookListQuery=em.createQuery("Select k from Book k",Book.class);
        List<Book> bookList=bookListQuery.getResultList();
        
        for(Book b:bookList){
            System.out.println("Kitap Yazarlarının isimleri"+b.getAuthor());
        }
        
        
        
    }
}
