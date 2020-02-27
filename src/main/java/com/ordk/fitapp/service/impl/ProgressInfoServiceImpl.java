package com.ordk.fitapp.service.impl;

import com.ordk.fitapp.dao.ProgressInfoDao;
import com.ordk.fitapp.model.ProgressInfo;
import com.ordk.fitapp.service.ProgressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressInfoServiceImpl implements ProgressInfoService {

    @Autowired
    private ProgressInfoDao progressInfoDao;

    @Override
    public List<ProgressInfo> findAll() {
        return progressInfoDao.findAll();
    }

    @Override
    public List<ProgressInfo> findAllByPerson_Id(Long id){
        return progressInfoDao.findAllByPerson_Id(id);
    }
}
