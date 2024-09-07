import java.sql.Array;
import java.sql.ResultSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(1,6,1);
        List<Double> resultados = equacao.calculaEquacaoSegundoGrau();
        System.out.println("RESULTADO EQUACAO=" + resultados);

        List<Double> lista = List.of(1.80,1.70,1.55);
        DesvioPadrao desvio = new DesvioPadrao(lista);
        System.out.println("RSULTADO DESVIO=" + desvio.calculaDesvioPadrao());

        Juros juros = new Juros(7000,12,1);
        System.out.println("RESULTADO JUROS=" + juros.jurosComposto());



    }
}
