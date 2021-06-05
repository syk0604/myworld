package com.gupaoedu.Myconfig.com.gupaoedu.service.impl;

import com.gupaoedu.Myconfig.com.gupaoedu.service.IQueryService;
import com.gupaoedu.Myconfig.com.gupaoedu.service.IUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Administrator
 * 2021/4/14
 */
@Service
public class QueryService implements IQueryService {
    @Autowired
    private IUpdateService updateService;
}
