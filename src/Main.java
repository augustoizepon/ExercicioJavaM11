import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        adicionarPessoas();
    }

    public static void adicionarPessoas(){




        List<Pessoas> lista = new ArrayList<Pessoas>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("qual o nome da " + i + "a pessoa?");
            String nome = scanner.next();
            System.out.println("qual o sexo? (F/M)");
            String sexo = scanner.next();
            if(sexo.equalsIgnoreCase("m")){
                sexo = "Masculino";
            } else if (sexo.equalsIgnoreCase("f")){
                sexo = "Feminino";
            }
            Pessoas pessoa = new Pessoas(nome, sexo);
            lista.add(pessoa);
            if(i == 5){
                Collections.sort(lista);
                System.out.println(lista);
            }
        }





    }
}