
package DAOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DataDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("ods.getdata.query")
    private String query;

    public HashMap getData() {
        HashMap<String, String> response = jdbcTemplate.queryForObject(query, HashMap.class);
        return response;
    }

    public HashMap getData(Object[] params) {
        HashMap<String, String> response = jdbcTemplate.queryForObject(query, HashMap.class, params);
        return response;
    }

}
