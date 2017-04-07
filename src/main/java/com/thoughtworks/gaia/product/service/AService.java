package com.thoughtworks.gaia.product.service;

import com.thoughtworks.gaia.common.Loggable;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.product.ProductMapper;
import com.thoughtworks.gaia.product.dao.ADao;
import com.thoughtworks.gaia.product.entity.A;
import com.thoughtworks.gaia.product.model.AModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by heming on 4/7/17.
 */
@Component
@Transactional
public class AService implements Loggable{
    @Autowired
    private ADao aDao;
    @Autowired
    private ProductMapper mapper;

    public A getA(Long a_id){
        AModel aModel = aDao.idEquals(a_id).querySingle();
        if(aModel==null){
            error("can't find");
            throw new NotFoundException();
        }
        return mapper.map(aModel,A.class);
    }

}
