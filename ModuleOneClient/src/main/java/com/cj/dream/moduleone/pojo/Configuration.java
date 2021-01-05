package com.cj.dream.moduleone.pojo;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Configuration
 * @Description: xml包装类
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2020/12/29 10:48
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/12/29     KingEagleSis      v1.0.0              新建
 */
public class Configuration {

    private DataSource dataSource;

    private Map<String,MapperStatment> mapStatment = new HashMap<String, MapperStatment>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MapperStatment> getMapStatment() {
        return mapStatment;
    }

    public void setMapStatment(Map<String, MapperStatment> mapStatment) {
        this.mapStatment = mapStatment;
    }
}
