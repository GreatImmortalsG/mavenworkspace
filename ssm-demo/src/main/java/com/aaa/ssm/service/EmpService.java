package com.aaa.ssm.service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discriptoin: 雇员服务接口
 * author:zz
 * createTime:2018-11-07-15:11
 */
public interface EmpService {

    /**
     * 分页数据
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
