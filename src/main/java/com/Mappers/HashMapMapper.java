package com.Mappers;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

public class HashMapMapper implements RowMapper<HashMap> {

    @Override
    public HashMap mapRow(ResultSet resultSet, int i) throws SQLException {
        HashMap<Object, Object> map = new HashMap<>();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnsNum = metaData.getColumnCount();

        for (int column = 1; column <= columnsNum; column++) {
            map.put(metaData.getColumnName(column), resultSet.getObject(column));

        }
        return map;
    }
}
