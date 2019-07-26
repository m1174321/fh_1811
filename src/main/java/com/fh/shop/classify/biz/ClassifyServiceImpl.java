package com.fh.shop.classify.biz;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.fh.shop.classify.mapper.IClassifyMapper;
import com.fh.shop.classify.po.Classify;
import com.fh.shop.jar.ServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("classifyService")
@Transactional(rollbackFor = Exception.class)
public class ClassifyServiceImpl implements IClassifyService {

    @Autowired
    private IClassifyMapper iClassifyMapper;

    @Transactional(readOnly = true)
    public ServerException queryById(Integer id) {
        Wrapper<Classify> wrapper = new EntityWrapper()
                .eq("pid" , id);
        List<Classify> classifies = iClassifyMapper.selectList(wrapper);
        return ServerException.serverException(classifies);
    }
}
