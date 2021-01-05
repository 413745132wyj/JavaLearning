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
 * @ClassName: XMLConfigerBuilder
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2021/1/5 14:53
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2021/1/5     KingEagleSis      v1.0.0              新建
 */
public class XMLConfigerBuilder {

    private Configuration configuration;

    public XMLConfigerBuilder(Configuration configuration){
        this.configuration = configuration;
    }


    public void parseConfiguration(InputStream inputStream) throws DocumentException, PropertyVetoException {
        // 根据传入的配置文件流，通过dom4j解析配置文件
        Document document = new SAXReader().read(inputStream);
        Element rootElement = document.getRootElement();
        List<Element> propertyElement = rootElement.selectNodes("//parameter");
        Properties properties = new Properties();
        for (Element element :propertyElement){
            String name = element.attributeValue("name");
            String value = element.attributeValue("value");
            properties.setProperty(name,value);
        }

        // 连接池
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(properties.getProperty("driverClass"));
        comboPooledDataSource.setJdbcUrl(properties.getProperty("jdbcUrl"));
        comboPooledDataSource.setUser(properties.getProperty("username"));
        comboPooledDataSource.setPassword(properties.getProperty("password"));

        // 将数据库信息放入连接池，将连接池放进configuration配置文件中
        configuration.setDataSource(comboPooledDataSource);

        List<Element> mapperElements = rootElement.selectNodes("//mapper");
    }
}
