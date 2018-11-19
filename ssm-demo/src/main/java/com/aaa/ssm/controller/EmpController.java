package com.aaa.ssm.controller;

import com.aaa.ssm.service.EmpService;
import com.aaa.ssm.util.PageUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * className:EmpController
 * discriptoin:
 * author:zz
 * createTime:2018-11-07-15:51
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired   //依赖注入
    private EmpService empService;

    /**
     * 雇员列表
     * @param map
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(@RequestParam Map map, Model model , HttpServletRequest request){
        map.put("pageSize",5);
        int pageNo = map.get("pageNo")==null?1:Integer.valueOf(map.get("pageNo")+"");
        String stringPage = new PageUtil(pageNo,5,empService.getPageCount(map),request).getStringPage();
        model.addAttribute("stringPage",stringPage);
        model.addAttribute("empList",empService.getPage(map));
        return "emp/list";
    }

    @RequestMapping("/add")
    public String add(@RequestParam Map map ){
        if (map!=null && map.size()>0){
            empService.add(map);
            return "redirect:/emp/list.do";
        }else{
            return "emp/add";
        }

    }

    @RequestMapping("/view")
    public String view(){ return "emp/add"; }

    @RequestMapping("/update")
    public String update(@RequestParam Integer empno , Model model){
        if (empno!=null ){
            List<Map> byIdList = empService.getByIdList(empno);
            model.addAttribute("emp",byIdList.get(0));
            return "emp/update";
        }else {
            return "redirect:/emp/list.do";
        }

    }

    @RequestMapping("/submit")
    public String submit(@RequestParam Map map){
        if (map!=null && map.size()>0){
            empService.update(map);
            return "redirect:/emp/list.do";
        }else {
            return "emp/update";
        }

    }

    @RequestMapping("/delete")
    public String delete(@RequestParam Integer empno){
        if (empno!=null){
            empService.delete(empno);
            return "redirect:/emp/list.do";
        }else {
            return "redirect:/emp/list.do";
        }

    }
}
