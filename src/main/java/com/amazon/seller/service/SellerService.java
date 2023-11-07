package com.amazon.seller.service;

import java.util.List;

import com.amazon.seller.model.Seller;

public interface SellerService {
    public List<Seller> getAllSellers();
    public Seller getSellerByEmail(String email);
    public Seller getSellerByMobile(String mobile);
    public Seller getSellerByEmailOrMobile(String email, String mobile);
    public Seller getSellerByEmailAndMobile(String email, String mobile);
    public Seller getSellerByEmailOrMobileAndPassword(String username, String password);
    public void deleteSeller(long id);
    public Seller createSeller(Seller seller);
    public void changePassword(String password, long id);
}
