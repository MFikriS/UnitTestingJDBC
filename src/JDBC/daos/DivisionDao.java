package JDBC.daos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import JDBC.models.Division;

public class DivisionDao {
    private Connection con;
    
    public DivisionDao(Connection connection){
        this.con = connection;
    }

    public List<Division> getAll(){
        List<Division> division = new ArrayList<>();
        String query = "Select * From division";
        try {
            ResultSet resultSet = con.prepareStatement(query).executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }
        } catch (Exception e) {
       
            e.printStackTrace();
        }
        return division;

    }

    public List<Division> getJoin(){
        List<Division> division = new ArrayList<>();
        String query = "SELECT * FROM division JOIN region ON division.regionId = region.regionId; ";
        try {
            ResultSet resultSet = con.prepareStatement(query).executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + 
                                resultSet.getString(2) + " " + 
                                resultSet.getInt(3) + " " +
                                resultSet.getInt(4 ) + " " +
                                resultSet.getString(5));
            }
        } catch (Exception e) {
       
            e.printStackTrace();
        }
        return division;

    }

    public boolean insertData(Division division){
        try {
            PreparedStatement preparedStatement = con.prepareStatement("Insert INTO division(Id, Name, regionId) values(?,?,?)");
            preparedStatement.setInt(1, division.getId());
            preparedStatement.setString(2, division.getName());
            preparedStatement.setInt(3, division.getRegionId());
            preparedStatement.executeUpdate();
            System.out.println("Insert Data Division Success");
            return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateData(Division division){
        try {
            String query = "Update division SET Id = ?, Name = ?, regionId = ? WHERE Id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, division.getId());
            preparedStatement.setString(2, division.getName());
            preparedStatement.setInt(3, division.getRegionId());
            preparedStatement.setInt(4, division.getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteData(Division division){
        try {
            String query = "Delete from division where Id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, division.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
}
