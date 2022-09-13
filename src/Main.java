import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String [] allNames = {"David", "Susanne", "Clara"};

        String name = allNames[1];
        System.out.println(name);

        for (String singleName : allNames) {
            System.out.println(singleName);
        }

        lista();

    }


    static void lista(){
        ArrayList<String> allNames = new ArrayList<String>();

        System.out.println(allNames.size());
        allNames.add("Clara");
        allNames.add("yo mf");
        System.out.println(allNames.size());

        System.out.println(allNames.get(1));
    }
}