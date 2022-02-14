package DAO.impl;

import DAO.FlowerDAO;
import entity.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerJDBCDao implements FlowerDAO {
    @Override
    public void add(Flower flower) {
        Connection connection;
        PreparedStatement statement;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("insert into flowers(name, stem_length, cost_of_one_piece) VALUES (?, ?, ?)");
            statement.setString(1, flower.getName());
            statement.setInt(2, flower.getStemLength());
            statement.setDouble(3, flower.getCostOfOnePiece());
            statement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Flower> getAll() {
        List<Flower> allFlowers = new ArrayList<>();
        Connection connection;
        PreparedStatement statement;

        try {
            connection = getConnection();
            statement = connection.prepareStatement("select * from flowers");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int stemLength = resultSet.getInt("stem_length");
                double costOfOnePiece = resultSet.getDouble("cost_of_one_piece");
                Flower flower = new Flower();
                flower.setId(id);
                flower.setName(name);
                flower.setStemLength(stemLength);
                flower.setCostOfOnePiece(costOfOnePiece);
                allFlowers.add(flower);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return allFlowers;
    }

    @Override
    public void updateByID(int id, String name, int stemLength, double costOfOnePiece) {
        Connection connection;
        PreparedStatement statement;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("UPDATE cars SET name = ?, stem_length = ?, cost_of_one_piece = ? WHERE id = ?");
            statement.setString(1, name);
            statement.setInt(2, stemLength);
            statement.setDouble(3, costOfOnePiece);
            statement.setInt(4, id);
            int updatedValues = statement.executeUpdate();
            System.out.println("Values updated: " + updatedValues);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Flower> getFlowersByStemLengthInBounds(int leftStemLengthBound, int rightStemLengthBound) {
        List<Flower> flowersByStemLengthInBounds = new ArrayList<>();
        Connection connection;
        PreparedStatement statement;
        try {
            connection = getConnection();
            statement = connection.prepareStatement("select * from flowers where id >= ? and id <= ?");
            statement.setInt(1, leftStemLengthBound);
            statement.setInt(2, rightStemLengthBound);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int stemLength = resultSet.getInt("stem_length");
                double costOfOnePiece = resultSet.getDouble("cost_of_one_piece");
                Flower flower = new Flower();
                flower.setId(id);
                flower.setName(name);
                flower.setStemLength(stemLength);
                flower.setCostOfOnePiece(costOfOnePiece);
                flowersByStemLengthInBounds.add(flower);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flowersByStemLengthInBounds;
    }

    private Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "Gentelmen098");
            return connection;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}