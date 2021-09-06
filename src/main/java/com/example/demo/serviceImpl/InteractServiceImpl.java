package com.example.demo.serviceImpl;

import com.example.demo.bean.InteractBean;
import com.example.demo.mapper.InteractMapper;
import com.example.demo.service.InteractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RABBIT on 2021/9/2.
 */
@Service
public class InteractServiceImpl implements InteractService {
    @Autowired
    private InteractMapper interactMapper;

    @Override
    public InteractBean getInfo(String name, String problem) {
        return interactMapper.getInfo(name,problem);
    }
}
