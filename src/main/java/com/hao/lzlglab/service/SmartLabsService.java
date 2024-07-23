package com.hao.lzlglab.service;


import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsAdminR;

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

    /**
     * 根据实验室id删除单条记录
     * @param id 实验室id
     */
    void deleteLabById(String id);

    /**
     * 根据实验室id删除多条记录
     * @param ids 多个实验室id的集合
     */
    void deleteLabsByIds(List<String>ids);

    PageInfo<SmartLabs> getLabsByCondition(Integer pageNum,Integer pageSize,String key,String typeId);

    void saveOrUpdateLabsAndUser(SmartLabsAdminR smartLabsAdminR);
}
