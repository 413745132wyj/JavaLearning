package com.cj.dream;

import com.cj.dream.moduleone.io.Resource;

import java.io.InputStream;

/**
 * @ClassName: test
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2020/12/29 10:18
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/12/29     KingEagleSis      v1.0.0              新建
 */
public class test {

    public static void getStream(){
        String path = "SqlConfigurationMapper.xml";
        InputStream resourceAsStream = Resource.getResourceAsStream(path);
    }
}
