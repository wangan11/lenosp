package com.len.service.impl;

import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.entity.WanganUserLeave;
import com.len.mapper.WanganUserLeaveMapper;
import com.len.service.WanganUserLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/1/21.
 * @email 154040976@qq.com
 */
@Service
public class WanganUserLeaveServiceImpl extends BaseServiceImpl<WanganUserLeave, String> implements
        WanganUserLeaveService {

    @Autowired
    WanganUserLeaveMapper userLeaveMapper;

    @Override
    public BaseMapper<WanganUserLeave, String> getMappser() {
        return userLeaveMapper;
    }
}
