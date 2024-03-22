package primeirosPassos;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    public static void main(String[] args) {
        //lista 
        List<String> nomes = new ArrayList<>();
        nomes.add("Hudson");
        nomes.add("Mille");

        nomes.forEach(nome -> System.out.println("o nome é : " + nome));

    }
    
}
