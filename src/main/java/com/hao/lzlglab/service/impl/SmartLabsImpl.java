package com.hao.lzlglab.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.lzlglab.dao.SmartLabsAdminRDao;
import com.hao.lzlglab.dao.SmartLabsDao;
import com.hao.lzlglab.dao.SysUserDao;
import com.hao.lzlglab.dao.ex.SmartsLabsExMapper;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsAdminR;
import com.hao.lzlglab.entity.SmartLabsExample;
import com.hao.lzlglab.entity.SysUser;
import com.hao.lzlglab.service.SmartLabsService;
import com.hao.lzlglab.utils.LabSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmartLabsImpl implements SmartLabsService {

    @Autowired
    private SmartLabsDao smartLabsDao;
    @Autowired
    private SmartsLabsExMapper smartsLabsExMapper;
    @Autowired
    private SmartLabsAdminRDao smartLabsAdminRDao;
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SmartLabs> findAllSmartLabs() {
        return smartLabsDao.selectByExample(new SmartLabsExample());
    }

    @Override
    public void saveOrUpdate(SmartLabs smartLabs) {
        //根据某个条件判断  空字符串
        if(StrUtil.isEmpty(smartLabs.getId())){
            //符合条件(不存在id) 新增
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartLabs.setId(snowflakeNextIdStr);
            smartLabsDao.insert(smartLabs);
        }else{
            //不符合条件(存在id) 修改
            smartLabsDao.updateByPrimaryKeySelective(smartLabs);
        }
    }

    @Override
    public void deleteLabById(String id) {
        //第一种方法
        smartLabsDao.deleteByPrimaryKey(id);
        //第二种方法,调用批量删除


    }

    @Override
    public void deleteLabsByIds(List<String> ids) {
        //第一种方法
//        for (String id:ids){
//            smartLabsDao.deleteByPrimaryKey(id);
//        }
        //第二种方法需要自己手动写in的方法
        smartsLabsExMapper.deleteBatch(ids);
    }

    @Override
    public PageInfo<SmartLabs> getLabsByCondition(Integer pageNum,Integer pageSize,String key,String typeId) {
        // 设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        SmartLabsExample smartLabsExample = new SmartLabsExample();
        SmartLabsExample.Criteria criteria = smartLabsExample.createCriteria();
        if(!StrUtil.isEmpty(key)){
            criteria = criteria.andLabsNameLike("%"+key+"%");
        }
        if(!StrUtil.isEmpty(typeId)){
            criteria.andLabsNumEqualTo(String.valueOf(typeId));
        }
        List<SmartLabs> list = smartLabsDao.selectByExample(smartLabsExample);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public void saveOrUpdateLabsAndUser(SmartLabsAdminR smartLabsAdminR) {
        //首先查询各项信息是否存在,如果不存在则抛出异常
        if((sysUserDao.selectByPrimaryKey(Long.valueOf(smartLabsAdminR.getAdminId()))==null)||(smartLabsDao.selectByPrimaryKey(smartLabsAdminR.getLabsId())==null)){
            throw new LabSystemException(LabSystemException.CodeMsgEnum.ADMIN_OR_LAB_IS_EMPTY);
        }

        //随后查询是增加还是更新
        if(smartLabsAdminR.getId()==null){
            //需要增加
            //首先生成id
            //符合条件(不存在id) 新增
            String snowflakeNextIdStr = IdUtil.getSnowflakeNextIdStr();
            smartLabsAdminR.setId(snowflakeNextIdStr);
            smartLabsAdminRDao.insert(smartLabsAdminR);
        }else{
            //需要更新
            smartLabsAdminRDao.updateByPrimaryKeySelective(smartLabsAdminR);
        }


    }
}
