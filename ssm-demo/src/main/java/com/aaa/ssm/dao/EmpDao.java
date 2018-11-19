package com.aaa.ssm.dao;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin: 雇员持久层
 * author:zz
 * createTime:2018-11-07-14:59
 */
public interface EmpDao {

    /**
     * 雇员列表
     * @param map
     * @return
     */
    List<Map> getPage(Map map);

    /**
     * 分页总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);

    /**
     * 添加雇员
     * @param map
     * @return
     */
    int add(Map map);

    /**
     * 根据Id找到要修改的数据
     * @param empno
     * @return
     */
    List<Map> getByIdList(Integer empno);

    /**
     * 修改雇员信息
     * @param map
     * @return
     */
    int update(Map map);

    /**
     * 删除雇员
     * @param empno
     * @return
     */
    int delete(Integer empno);
}
