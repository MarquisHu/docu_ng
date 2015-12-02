package com.ng.dao;

import org.mybatis.spring.SqlSessionTemplate;

public abstract class BaseDao {

    private SqlSessionTemplate sqlMapClientNormal;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlMapClientNormal;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlMapClientNormal) {
        this.sqlMapClientNormal = sqlMapClientNormal;
    }
}
