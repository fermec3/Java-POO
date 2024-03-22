package primeirosPassos;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Mec ", 7);
        notas.put("Mille boboca ", 0);

        for(Map.Entry<String, Integer> entry : notas.entrySet() )  {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + "tirou na prova : " + value);

        }
    }
}