package com.thecodeinnovator.genericservice.specific.service;

import com.thecodeinnovator.genericservice.generic.interfaces.GenericDAOInterface;
import com.thecodeinnovator.genericservice.generic.service.GenericServiceImpl;
import com.thecodeinnovator.genericservice.specific.interfaces.AdminDAOInterface;
import com.thecodeinnovator.genericservice.specific.interfaces.AdminServiceInterface;
import com.thecodeinnovator.genericservice.specific.model.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl extends GenericServiceImpl<Admin, Integer> implements AdminServiceInterface {
 
    private AdminDAOInterface adminDao;
    public AdminServiceImpl(){
 
    }
    @Autowired
    public AdminServiceImpl(@Qualifier("adminDaoImpl") GenericDAOInterface<Admin, Integer> genericDao) {
        super(genericDao);
        this.adminDao = (AdminDAOInterface) genericDao;
    }
 
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeAdmin(Integer id) {
        return adminDao.removeAdmin(id);
    }
 
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public boolean isAdminRegistered(String userName, String password) {
        return adminDao.isAdminRegistered(userName, password);
    }
 
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Admin getAdmin(String userName) {
        return adminDao.getAdmin(userName);
    }
}