package DAO;

import entity.Flower;

import java.util.List;


public interface FlowerDAO {
    void add (Flower flower);
    List<Flower> getAll();
    void updateByID (int id, String name, int stemLength, double costOfOnePiece);
}