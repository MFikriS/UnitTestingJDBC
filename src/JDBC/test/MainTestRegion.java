package JDBC.test;

import JDBC.daos.RegionDao;
import JDBC.models.Region;
import JDBC.tools.DBConnection;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void update(){
        Integer id = 1;
        String Name = "South Asia";
        boolean result = true;

        RegionDao updateRegD = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(id);
        region.setRegionName(Name);
        region.setRegionId(id);

        assertEquals(result, updateRegD.updateData(region));
    }

    @Test
    public void delete(){
        Integer id = 4;
        boolean result = true;

        RegionDao deleteRegD = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(id);

        assertEquals(result, deleteRegD.delete(region));
    }

    
    @Test
    public void getByRegionName(){
        
        List<String> Name = ArrayList<"Europe">();
        String result = "Europe";
        RegionDao regionDao = new RegionDao(con.getConnection());
        for (Region region : regionDao.getDataByRegionName()) {
            System.out.println(region.getRegionName());
        }

        assertEquals(result, regionDao.getDataByRegionName(Name));
    }
    
}