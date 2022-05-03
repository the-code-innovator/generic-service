package com.thecodeinnovator.genericservice.specific.repository;

import com.thecodeinnovator.genericservice.generic.repository.GenericDAOImpl;
import com.thecodeinnovator.genericservice.specific.interfaces.AdminDAOInterface;
import com.thecodeinnovator.genericservice.specific.model.Admin;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl extends GenericDAOImpl<Admin, Integer> implements AdminDAOInterface {
    @Override
    public boolean removeAdmin(Integer id) {
        Query<Admin> employeeTaskQuery = (Query<Admin>) currentSession().createQuery("from Admin u where :id");
        employeeTaskQuery.setParameter("id", id);
        return employeeTaskQuery.executeUpdate() > 0;
    }
 
    @Override
    public boolean isAdminRegistered(String userName, String password) {
        Query<Admin> employeeTaskQuery = (Query<Admin>) currentSession().createQuery("select 'A' from Admin u where username=:username and password=:password");
        employeeTaskQuery.setParameter("username", userName);
        employeeTaskQuery.setParameter("password", password);
        return employeeTaskQuery.list().size() > 0;
    }
 
    @Override
    public Admin getAdmin(String username) {
        Query<Admin> query = (Query<Admin>) currentSession().createQuery("from Admin where username=:username");
        query.setParameter("username", username);
        return (Admin) query.uniqueResult();
    }
}