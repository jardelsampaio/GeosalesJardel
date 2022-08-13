import java.util.ArrayList;
import java.util.Scanner;

public class TesteJardel {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //String atualiza = "Jardel";
        //System.out.println(atualiza);
        //atualiza = "sampaio";
        //System.out.println(atualiza);
        ArrayList<Setor> lista = new ArrayList<Setor>();


        char controle = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite o telefone");
            int  i = leia.nextInt();
            Setor geo = new Setor(n,i);
            lista.add(geo);
            System.out.println("Deseja cadastrar outro setor? s ou S para sim");
            controle = leia.next().charAt(0);
        }while(controle == 's' || controle == 'S');

        do {
            System.out.println("Deseja Atualizar o Setor? s ou S para sim");
            controle = leia.next().charAt(0);
            System.out.println("Digite o novo nome: ");
            String n = leia.next();
            System.out.println("Digite o novo telefone");
            int  i = leia.nextInt();
        }while(controle == 's' || controle == 'S');

        do{
            System.out.println("Deseja deletar o Setor? s ou S para sim");
            controle = leia.next().charAt(0);
            lista.remove(0);
        }while(controle == 's' || controle == 'S');

        for (Setor i: lista){
            System.out.println(i);
        }
    }
}
