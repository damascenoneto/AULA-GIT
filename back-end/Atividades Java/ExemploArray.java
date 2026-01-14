import java.util.ArrayList;

public class ExemploArray {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniel");
        nomes.add("Eduardo");
        nomes.remove(2);

        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}