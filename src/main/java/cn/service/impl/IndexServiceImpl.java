package cn.service.impl;

import cn.mapper.Mapper;
import cn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private Mapper mapper;


}
