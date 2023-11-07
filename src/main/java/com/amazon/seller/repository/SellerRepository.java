package com.amazon.seller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.seller.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
    @Query("from Seller where email=?1")
    public Optional<Seller> getSellerByEmail(String email);

    @Query("from Seller where mobile = ?1")
    public Optional<Seller> getSellerByMobile(String mobile);

    @Query("from Seller where email=?1 or mobile=?2")
    public Optional<Seller> getSellerByEmailOrMobile(String email, String mobile);

    @Query("from Seller where email=?1 and mobile=?2")
    public Optional<Seller> getSellerByEmailAndMobile(String email, String mobile);

    @Query("from Seller where email=?1 or mobile=?1 and password=?2")
    public Optional<Seller> getSellerByEmailOrMobileAndPassword(String username, String password);
    
    @Transactional
    @Modifying
    @Query("update Seller set password=?1 where id=?2")
    public void changePassword(String password, long id);
}
