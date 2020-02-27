package com.ordk.fitapp.service;

import com.ordk.fitapp.model.ProgressInfo;

import java.util.List;

public interface ProgressInfoService {
    List<ProgressInfo> findAll();

    List<ProgressInfo> findAllByPerson_Id(Long id);
}
