package com.thecodeinnovator.genericservice.specific.interfaces;

import com.thecodeinnovator.genericservice.generic.interfaces.GenericServiceInterface;
import com.thecodeinnovator.genericservice.specific.model.Admin;

public interface AdminServiceInterface extends GenericServiceInterface<Admin,Integer>{
    public boolean removeAdmin(Integer id);
    public boolean isAdminRegistered(String userName, String password);
    public Admin getAdmin(String userName);
}