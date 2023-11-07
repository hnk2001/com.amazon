package com.amazon.seller.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.seller.model.Seller;
import com.amazon.seller.repository.SellerRepository;
import com.amazon.seller.service.SellerService;

@Service
public class SellerServiceImpl implements SellerService{

     @Autowired
    SellerRepository sellerRepository;

    @Override
    public List<Seller> getAllSellers(){
        return sellerRepository.findAll();
    }

    @Override
    public Seller getSellerByEmail(String email){
        Optional<Seller> seller = sellerRepository.getSellerByEmail(email);
        if(seller.isPresent())
            return seller.get();
        else
            return null;
    }

    @Override
    public Seller getSellerByMobile(String mobile){
        Optional<Seller> seller = sellerRepository.getSellerByMobile(mobile);
        if(seller.isPresent())
            return seller.get();
        else
            return null;
    }

    @Override
    public Seller getSellerByEmailOrMobile(String email, String mobile){
        Optional<Seller> seller = sellerRepository.getSellerByEmailOrMobile(email, mobile);
        if(seller.isPresent())
            return seller.get();
        else
            return null;
    }

    @Override
    public Seller getSellerByEmailAndMobile(String email, String mobile){
        Optional<Seller> seller = sellerRepository.getSellerByEmailAndMobile(email, mobile);
        if(seller.isPresent())
            return seller.get();
        else
            return null;
    }
    @Override
    public Seller getSellerByEmailOrMobileAndPassword(String username, String password){
        Optional<Seller> seller = sellerRepository.getSellerByEmailOrMobileAndPassword(username, password);
        if(seller.isPresent())
            return seller.get();
        else
            return null;
    }

    @Override
    public void deleteSeller(long id){
        sellerRepository.deleteById(id);
    }

    @Override
    public Seller createSeller(Seller seller){
        return sellerRepository.save(seller);
    }

    @Override
    public void changePassword(String password, long id){
        sellerRepository.changePassword(password, id);
    }
}
