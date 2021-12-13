package com.petlist.service;

import javax.annotation.Resource;
import java.util.Map;

@Resource
public interface comitListService {
    void comitList(Map<String,Object> map);
}
