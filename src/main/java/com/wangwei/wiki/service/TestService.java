package com.wangwei.wiki.service;

import com.wangwei.wiki.domain.Test;
import com.wangwei.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @author: wangwei
 * @date: 2022年09月13日 20:42
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List <Test> list(){
        return testMapper.list();
    }
}
