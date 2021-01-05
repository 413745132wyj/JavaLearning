package com.cj.dream.moduleone.io;

import java.io.InputStream;

/**
 * @ClassName: Resource
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2020/12/29 10:09
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/12/29     KingEagleSis      v1.0.0              新建
 */
public class Resource {

    /**
     * 通过xml路径，将xml转成输入流返回
     *
     * @param path 文件路径
     * @return
     */
    public static InputStream getResourceAsStream(String path){
        InputStream resourceAsStream = new Resource().getClass().getResourceAsStream(path);
        return resourceAsStream;
    }
}
