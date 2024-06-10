package in.smartprogramming.Spjdbcfirst;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowmapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student std = new Student();
        
        // Mapping ResultSet columns to Student object properties
        std.setRollno(rs.getInt("std_roll"));
        std.setName(rs.getString("std_name"));
        std.setMarks(rs.getFloat("std_marks"));
        
        return std;
    }
}
