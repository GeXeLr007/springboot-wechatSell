package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.repository.SellerInfoRepository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    
    @Autowired
    SellerInfoRepository sellerInfoRepository;
    
    @Override
    public SellerInfo findSellerInfoByOpenid(String opneid) {
        return sellerInfoRepository.findByOpenid(opneid);
    }
}
