import domain.Persona;
import util.DniComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        /*Map<Integer, String> entries = new HashMap<>();
        entries.put(0, "Valor 1");
        entries.put(1, "Valor 2");
        entries.put(2, "Valor 3");
        entries.put(1, "Valor 4");
        entries.put(0, "Valor 5");
        entries.put(null, "Valor nulo");
        entries.put(5, null);
        entries.put(null, null);
        entries.put(6, null);
        entries.put(0, "Nuevo valor");
        entries.put(0, "Valor definitivo para 0");

        System.out.println(entries);
        System.out.println("Número de entradas en el mapa: " + entries.size());
        System.out.println("Reemplazando: " + entries.replace(0, "Nuevo valor para cero"));
        System.out.println("Reemplazando con valor anterior: " + entries.replace(0, "Nuevo valor para cero", "Nuevo valor para cero"));

        System.out.println("Objeto removido: " + entries.remove(2));
        System.out.println("Objeto que corresponde a la llave: " + entries.get(0));

        System.out.println(entries);

        for (Map.Entry<Integer, String> entry : entries.entrySet()) {
            if (entry.getValue() != null && entry.getValue().equals("Valor 4")) {
                System.out.println(entry.getKey());
            }
        }

        Map<Persona, String> celularesPersonas = new HashMap<>();
        celularesPersonas.put(new Persona(12345, "Brenda", "Zattera"), "+54123456");
        celularesPersonas.put(new Persona(456789, "Lucía", "Espíndola"), "+54789465");
        celularesPersonas.put(new Persona(48956, "Juan", "Albarracín"), "+57312545887");
        celularesPersonas.put(new Persona(12345, "Brenda", "Zattera"), "+547894");

        System.out.println(celularesPersonas);
        Persona luciana = new Persona(45987, "Luciana", "Chaparro");
        luciana.equals(new Integer(1));*/

        Map<Persona, String> treeMapEntries = new TreeMap<>(new DniComparator());
        treeMapEntries.put(new Persona(12345, "Brenda", "Zattera"), "+54123456");
        treeMapEntries.put(new Persona(456789, "Lucía", "Espíndola"), "+54789465");
        treeMapEntries.put(new Persona(48956, "Juan", "Albarracín"), "+57312545887");
        treeMapEntries.put(new Persona(12345, "Brenda", "Zattera"), "+547894");

        System.out.println(treeMapEntries);
    }
}
