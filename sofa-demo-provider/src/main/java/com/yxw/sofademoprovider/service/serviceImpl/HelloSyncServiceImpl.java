package com.yxw.sofademoprovider.service.serviceImpl;

import com.yxw.sofademoprovider.service.HelloSyncService;

/**
 * @author: yangxw
 * @date: Created in 2018-05-23 19:20
 * @description:
 **/
public class HelloSyncServiceImpl implements HelloSyncService {
    @Override
    public String saySync(String string) {
        return "provider tell you : this is your say: " +  string;
    }
}
