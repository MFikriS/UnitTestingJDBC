package JDBC.test;

import JDBC.daos.RegionDao;
import JDBC.models.Region;
import JDBC.tools.DBConnection;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class MainTestRegion {
    
    DBConnection con = new DBConnection();

    @Test
    public void insert(){
        //Arrange
        Integer id = 11;
        String Name = "West Java";
        boolean result = true;

        //Act & Assert
        RegionDao insertRegD = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(id);
        region.setRegionName(Name);

        assertEquals(result, insertRegD.insertData(region));

    }

    
}
