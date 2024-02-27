public class Student
{
    private String name;
    private int seatNumber;
    private String leftNeighbor;
    private String rightNeighbor;
    private int newSeatNumber;
    private String newLeftNeighbor;
    private String newRightNeighbor;

    public Student(String name, int seatNumber, String leftNeighbor, String rightNeighbor)
    {
        this.name = name;
        this.seatNumber = seatNumber;
        this.leftNeighbor = leftNeighbor;
        this.rightNeighbor = rightNeighbor;
        this.newSeatNumber = seatNumber;
        this.newLeftNeighbor = "";
        this.newRightNeighbor = "";
    }

    public String getName()
    {
        return name;
    }

    public int getSeatNumber()
    {
        return seatNumber;
    }

    public String getLeftNeighbor()
    {
        return leftNeighbor;
    }

    public String getRightNeighbor()
    {
        return rightNeighbor;
    }

    public int getNewSeatNumber()
    {
        return newSeatNumber;
    }

    public void setNewSeatNumber(int newSeatNumber)
    {
        this.newSeatNumber = newSeatNumber;
    }

    public String getNewLeftNeighbor()
    {
        return newLeftNeighbor;
    }

    public void setNewLeftNeighbor(String newLeftNeighbor)
    {
        this.newLeftNeighbor = newLeftNeighbor;
    }

    public String getNewRightNeighbor()
    {
        return newRightNeighbor;
    }

    public void setNewRightNeighbor(String newRightNeighbor)
    {
        this.newRightNeighbor = newRightNeighbor;
    }
}