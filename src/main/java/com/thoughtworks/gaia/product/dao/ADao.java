package com.thoughtworks.gaia.product.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.product.model.AModel;
import org.springframework.stereotype.Component;

/**
 * Created by heming on 4/7/17.
 */
@Component
public class ADao extends BaseDaoWrapper<AModel>{
    public ADao(){
        super(AModel.class);
    }
}
