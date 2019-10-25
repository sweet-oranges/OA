package com.oa.oa.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.oa.oa.bean.SendTable;
import com.oa.oa.dao.SendTableDao;

@Service
public class SendTableService{

    @Resource
    private SendTableDao sendTableDao;

    public int insert(SendTable pojo){
        return sendTableDao.insert(pojo);
    }

    public int insertSelective(SendTable pojo){
        return sendTableDao.insertSelective(pojo);
    }

    public int insertList(List<SendTable> pojos){
        return sendTableDao.insertList(pojos);
    }

    public int update(SendTable pojo){
        return sendTableDao.update(pojo);
    }

    public List<SendTable> getAll(){
        return sendTableDao.getAll();
    }
}
