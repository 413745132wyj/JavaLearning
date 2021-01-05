package com.cj.dream.moduleone.pojo;

/**
 * @ClassName: MapperStatment
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: KingEagleSis
 * @date: 2020/12/29 10:51
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/12/29     KingEagleSis      v1.0.0              新建
 */
public class MapperStatment {

    private Integer id;

    private String sql;

    private Class<?> resultType;

    private Class parameter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Class getResultType() {
        return resultType;
    }

    public void setResultType(Class resultType) {
        this.resultType = resultType;
    }

    public Class getParameter() {
        return parameter;
    }

    public void setParameter(Class parameter) {
        this.parameter = parameter;
    }
}
