package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckGroup;

import java.util.List;

/**
 * @auther xiaochen
 * @create 2022-06-20 10:23
 */
public interface CheckGroupService {
    void add(CheckGroup checkGroup, Integer[] checkitemIds);
    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    CheckGroup findById(Integer id);
    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);
    public void edit(CheckGroup checkGroup,Integer[] checkitemIds);
    public List<CheckGroup> findAll();
}
