public class EstoqueTest {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque(10);
        Item item1 = new Item("maça", 8);
        Item item2 = new Item("abacate", 90);
        Item item3 = new Item("pão", 5120);
        Item item4 = new Item("abacate", 542);
        Item item5 = new Item("granada", 507);
        estoque1.inserir(item1);
        estoque1.inserir(item2);
        estoque1.inserir(item3);
        estoque1.inserir(item4);
        estoque1.inserir(item5);


        estoque1.imprime();
        System.out.println("---------");




    }
}