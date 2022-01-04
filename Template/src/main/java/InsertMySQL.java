import java.util.ArrayList;

public class InsertMySQL extends CreateTml<ArrayList<String>, String> {
    @Override
    public ArrayList<String> CollectData() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("wtf");
        return arr;
    }

    @Override
    public String CreateConn() {
        System.out.println("String cannot be a connection.");
        return "lalala";
    }

    @Override
    public void CreateData(String conn, ArrayList<String> data) {
        System.out.println("String cannot be a connection.");
        for (String elem : data) {
            System.out.println(elem);
        }
    }
}
