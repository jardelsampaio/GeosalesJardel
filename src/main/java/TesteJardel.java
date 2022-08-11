public class TesteJardel {
    public static void main(String[] args) {
        System.out.println("Geosales");
        Setor geo = new Setor("CustomerService",8596);
        System.out.println("setor: " + geo.nome +"\n"+ "telefone: " + geo.telefone);
        Setor geo1 = new Setor("Projetos",7687);
        System.out.println("setor: " + geo1.nome +"\n"+ "telefone: " + geo1.telefone);
    }
}
