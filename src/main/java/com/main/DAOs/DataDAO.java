
package com.main.DAOs;

import com.main.Mappers.HashMapMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.text.DefaultHighlighter;
import java.util.HashMap;
import java.util.List;

@Repository
public class DataDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${ods.getdata.query}")
    private String query;

    @Value("${ods.getdata.defaultquery}")
    private String defaultQuery;

    private Logger logger = LoggerFactory.getLogger(DataDAO.class);

    public DataDAO() {
    }

    public List<HashMap> getData() {
        List<HashMap> response = jdbcTemplate.query(defaultQuery, new HashMapMapper());
        return response;
    }

    public List<HashMap> getData(Object[] params) {
        List<HashMap> response = jdbcTemplate.query(defaultQuery,new HashMapMapper(), params);
        return response;

    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


}
