import java.util.ArrayList;
public class Main
{
    public static void main(String[][] args)
    {
        String[][] seating = {{"Artyom Simonyan", "Haroon Awan", "Veronica Joseph", "Tracy Zhou", "", "Nafisa Patwary", "Dariusz Smola", "Tian Ying Chen", "Shakib Amin", "Noelle Wu", "Adib Miah", "Jason Teo"}, {"Siyam Siddique", "Leandra Boodram", "", "Rafael Bui", "Xin Chen", "Farian Faruqee"}, {"Irsal Siam", "Stanley Lee", "Sharon Lin", "", "Ricky Jiang", "Yanbo Wang"},{"", ""}, {"Christian Wan", "Brandon Yeung", "Nikita Manannikov", "Naya Antaki"}, {"", "Enamul Muttakin", "Jack Ni", "Ryan Chen"}};
        ArrayList<Student> studentInfo = createStudentInfoList(seating);
        String[][] newSeating = createEmptySeating();
    }

    public static ArrayList<Student> createStudentInfoList(String[][] seating)
    {
        ArrayList<Student> studentInfo = new ArrayList<Student>();
        int seatNumber = 1;
        for(int row = 0; row < seating.length; row++)
        {
            for(int column = 0; column < seating[row].length; column++)
            {
                if(!seating[row][column].equals(""))
                {
                    String name = seating[row][column];
                    String leftNeighbor = "";
                    if(column != 0)
                    {
                        leftNeighbor = seating[row][column - 1];
                    }
                    String rightNeighbor = "";
                    if(column != (seating[row].length - 1))
                    {
                        rightNeighbor = seating[row][column + 1];
                    }
                    Student student = new Student(name, seatNumber, leftNeighbor, rightNeighbor);
                    studentInfo.add(student);
                    seatNumber++;
                }
            }
        }
        return studentInfo;
    }

    public static String[][] createEmptySeating()
    {
        String[][] newSeating = new String[6][];
        newSeating[0] = new String[12];
        newSeating[1] = new String[6];
        newSeating[2] = new String[6];
        newSeating[3] = new String[2];
        newSeating[4] = new String[4];
        newSeating[5] = new String[4];
        return newSeating;
    }
}