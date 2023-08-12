package com.hws.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hws.reggie.pojo.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
