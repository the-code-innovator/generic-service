package com.thecodeinnovator.genericservice.specific.interfaces;

import com.thecodeinnovator.genericservice.generic.interfaces.GenericDAOInterface;
import com.thecodeinnovator.genericservice.specific.model.Admin;

public interface AdminDAOInterface extends GenericDAOInterface<Admin, Integer> {
    public boolean removeAdmin(Integer id);
    public boolean isAdminRegistered(String userName, String password);
    public Admin getAdmin(String username);
}