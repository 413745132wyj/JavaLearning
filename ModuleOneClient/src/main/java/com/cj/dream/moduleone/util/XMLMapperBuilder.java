package com.cj.dream.moduleone.util;

import com.cj.dream.moduleone.pojo.Configuration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @ClassName: XMLMapperBuilder
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2021/1/5 14:56
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2021/1/5     KingEagleSis      v1.0.0              新建
 */
public class XMLMapperBuilder {
    private Configuration configuration;

    public XMLMapperBuilder(Configuration configuration){
        this.configuration = configuration;
    }

    public void parse(InputStream inputStream) throws DocumentException {
        // 根据传入的配置文件流，通过dom4j解析配置文件
        Document document = new SAXReader().read(inputStream);
        Element rootElement = document.getRootElement();
        List<Element> propertyElement = rootElement.selectNodes("//parameter");
        for (Element element :propertyElement){
            String id = element.attributeValue("id");
            String resultType = element.attributeValue("resultType");
            String parameterType = element.attributeValue("parameterType");
            Class parameterTypeClass = getClassType("parameterType");
        }
    }

    /*private Class<?> getClassType(String type){
        Class<?>
    }*/
}
