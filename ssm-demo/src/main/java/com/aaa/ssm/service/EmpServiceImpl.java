package com.aaa.ssm.service;

import com.aaa.ssm.dao.EmpDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:
 * author:zz
 * createTime:2018-11-07-15:17
 */
@Service  //交给spring管理
@Transactional   //加上事务后，如果出现异常，整个事务都会回滚
public class EmpServiceImpl implements EmpService {

    @Autowired   //依赖注入
    private EmpDao empDao;

    //@Transactional(propagation = Propagation.NOT_SUPPORTED)   //不需要事务支持
    @Override
    public List<Map> getPage(Map map) {
        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        int pageSize = map.get("pageSize") == null ? 10 : Integer.valueOf(map.get("pageSize") + "");
        map.put("start",(pageNo-1)*pageSize);
        map.put("end",pageNo*pageSize+1);
        return empDao.getPage(map);
    }

    @Override
    public int getPageCount(Map map) {
        return empDao.getPageCount(map);
    }

    @Override
    public int add(Map map) {
        int add = empDao.add(map);
        //System.out.println(1/0);
        //要跟mapper中selectKey取得名字一样
        System.out.println(map.get("empNo"));
        return add;
    }

    @Override
    public List<Map> getByIdList(Integer empno) {
        return empDao.getByIdList(empno);
    }

    @Override
    public int update(Map map) {
        return empDao.update(map);
    }

    @Override
    public int delete(Integer empno) {
        return empDao.delete(empno);
    }
}
