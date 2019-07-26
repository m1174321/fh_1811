package com.fh.shop.classify.biz;

import com.fh.shop.jar.ServerException;

public interface IClassifyService {

    public ServerException queryById(Integer id);
}
