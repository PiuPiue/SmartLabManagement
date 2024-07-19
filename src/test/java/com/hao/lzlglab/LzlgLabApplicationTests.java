package com.hao.lzlglab;

import com.hao.lzlglab.dao.SmartLabsDao;
import com.hao.lzlglab.entity.SmartLabs;
import com.hao.lzlglab.entity.SmartLabsExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LzlgLabApplicationTests {

    //自动注入对象
    @Autowired
    SmartLabsDao smartLabsDao;

    @Test
    void contextLoads() {

        SmartLabs smartLabs = smartLabsDao.selectByPrimaryKey("1");
        System.out.println(smartLabs);
        SmartLabsExample smartLabsExample = new SmartLabsExample();
        SmartLabsExample.Criteria criteria = smartLabsExample.createCriteria();
        criteria.andLabsNameEqualTo("实验室");
        List<SmartLabs> smartLabs1 = smartLabsDao.selectByExample(smartLabsExample);
        smartLabs1.forEach(System.out::println);
        SmartLabs sl1 = new SmartLabs();
        //修改
        sl1.setId("1");
        sl1.setLabsName("实验室1");
        sl1.setInfos(null);
        sl1.setLabsNum("01");
//        smartLabsDao.updateByPrimaryKeySelective(sl1);
        //更新null值
        smartLabsDao.updateByPrimaryKey(sl1);
    }

}
