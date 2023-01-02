package JDBC.tools;
import JDBC.models.Division;
import JDBC.models.Region;
import JDBC.daos.DivisionDao;
import JDBC.daos.RegionDao;

public class Test {
    public static void main(String[] args) {
        DBConnection con = new DBConnection();
        System.out.println(con.getConnection());

        /* 
        // Read Data Region 
        RegionDao regionDao = new RegionDao(con.getConnection());
        for (Region region : regionDao.getAll()) {
            System.out.println(region.getRegionId());
            System.out.println(region.getRegionName());
        }
        */
        

        //Insert Data Region
        
        RegionDao rDao = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(5);
        region.setRegionName("South American");
        System.out.println(rDao.insertData(region));
        
        

        //Update Data Region
        /*
        RegionDao rDao = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(4);
        region.setRegionName("East Asia");
        region.setRegionId(4);
        System.out.println(rDao.updateData(region));
        */

        //Delete Data Region
        /*
        RegionDao rDao = new RegionDao(con.getConnection());
        Region region = new Region();
        region.setRegionId(4);
        System.out.println(rDao.delete(region));
        */

        // Insert Data Division
        /*
        DivisionDao dDao = new DivisionDao(con.getConnection());
        Division division = new Division();
        division.setId(3);
        division.setName("HR");
        division.setRegionId(2);
        System.out.println(dDao.insertData(division));
        */
        
        // Update Data Division
        /*
        DivisionDao dDao = new DivisionDao(con.getConnection());
        Division division = new Division();
        division.setId(1);
        division.setName("IT");
        division.setRegionId(2);
        division.setId(1);
        System.out.println(dDao.updateData(division));
        */
        
        /*
        // Read Data Division
        DivisionDao dDao = new DivisionDao(con.getConnection());
        for (Division division : dDao.getAll()) {
            System.out.println(division.getId());
            System.out.println(division.getName());
            System.out.println(division.getRegionId());
        }
        */

        /*
        //Join
        DivisionDao dDao = new DivisionDao(con.getConnection());
        for (Division division : dDao.getJoin()) {
            System.out.println(division.getId());
            System.out.println(division.getName());
            System.out.println(division.getRegionId());
        }
        RegionDao rDao = new RegionDao(con.getConnection())
        for (Region region : rDao.getJoin()) {
            System.out.println(region.getId());
            System.out.println(region.getName());
        }
        */

        /*
        // Delete Data Division
        DivisionDao dDao2 = new DivisionDao(con.getConnection());
        Division division3 = new Division();
        division.setId(2);
        System.out.println(dDao2.deleteData(division3));
        */
    }
}
