package JDBC.test;

import JDBC.daos.DivisionDao;
import JDBC.models.Division;
import JDBC.tools.DBConnection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTestDivision {
    DBConnection con = new DBConnection();

    @Test
    public void insert(){
        //Arrange
        Integer Id = 1;
        String Name = "Sales";
        Integer regionId = 1;
        boolean result = true;

        //Act & Assert
        DivisionDao insertDivDao = new DivisionDao(con.getConnection());
        Division division = new Division();
        division.setId(Id);
        division.setName(Name);
        division.setRegionId(regionId);

        assertEquals(result, insertDivDao.insertData(division));

    }
}
