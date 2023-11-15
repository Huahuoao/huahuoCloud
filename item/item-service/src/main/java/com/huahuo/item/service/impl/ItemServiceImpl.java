package com.huahuo.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huahuo.item.mapper.ItemMapper;
import com.huahuo.item.pojo.Item;
import com.huahuo.item.service.ItemService;
import org.springframework.stereotype.Service;

/**
 * @author 陈建辉
 * @description 针对表【cloud_item】的数据库操作Service实现
 * @createDate 2023-11-15 09:44:38
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item>
        implements ItemService {

}




