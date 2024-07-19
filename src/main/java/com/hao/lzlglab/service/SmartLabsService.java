package com.hao.lzlglab.service;


import com.hao.lzlglab.entity.SmartLabs;

import java.util.List;

public interface SmartLabsService {

    /**
     * 查询所有实验室
     * @return 返回所有实验室
     */
    List<SmartLabs> findAllSmartLabs();

    /**
     * 新建或者修改实验室信息
     * @param smartLabs 要修改的信息
     */
    void saveOrUpdate(SmartLabs smartLabs);
}
