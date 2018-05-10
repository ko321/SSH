package com.dao.impl;
import com.entity.User;
import com.dao.UserDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/5/10
 * @since 1.0.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean login(User user){
        boolean flag = false ;
        String hql ="FROM User p WHERE p.username= :username and p.password= :password";
        Query q =sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("username",user.getUsername());
        q.setParameter("password",user.getPassword());
        List l =q.list() ;
        Iterator iter= l.iterator() ;
        if(iter.hasNext()){
            flag= true;
        }
        return flag ;
    }
}