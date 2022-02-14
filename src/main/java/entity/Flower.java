package entity;

public class Flower {
    private int id;
    private String name;
    private int stemLength;
    private double costOfOnePiece;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public double getCostOfOnePiece() {
        return costOfOnePiece;
    }

    public void setCostOfOnePiece(double costOfOnePiece) {
        this.costOfOnePiece = costOfOnePiece;
    }
}