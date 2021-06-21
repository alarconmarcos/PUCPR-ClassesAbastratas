/* Esse código abaixo é o Main da Classe formas e logo abaixo implementei o código para a classe Funcionario
import java.util.*;

public class Main {
    public static void imprimir(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.printf("Area: %.2f Perimetro: %.2f%n",
              forma.getArea(), forma.getPerimetro());
        }
    }
    
    public static void main(String[] args) {
        var formas = new ArrayList<Forma>();
        formas.add(new Retangulo(2, 2));
        formas.add(new Circulo(3));
        formas.add(new Retangulo(4, 3));
        formas.add(new Circulo(1.5));
        imprimir(formas);
    }
}
*/

import java.util.ArrayList;
public class Main {
 public static void main(String[] args) {
 var funcionarios = new ArrayList<Funcionario>();
 funcionarios.add(new Concursado(4000, 5)); //João
 funcionarios.add(new Temporario(2000, 12)); //José
 funcionarios.add(new Concursado(2400, 34)); //Maria
 funcionarios.add(new Temporario(1200, 10)); //Pedro

 for (Funcionario funcionario : funcionarios) {
 System.out.println("Salario: " + funcionario.getSalario());
 }
 }
}