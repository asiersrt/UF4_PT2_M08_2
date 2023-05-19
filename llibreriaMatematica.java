import java.util.List;

public class llibreriaMatematica {
    public static double mitjana(List<Double> llista) {
        double suma = 0;
        for (double num : llista) {
            suma += num;
        }
        return suma / llista.size();
    }
}
