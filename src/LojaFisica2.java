import java.util.ArrayList;

public class LojaFisica2 implements LojaFisica{

    ArrayList<Item> itens;

    public LojaFisica2() {
        itens = new ArrayList<>();

        adicionarItem("RTX 3050", 1200, 74);
        adicionarItem("RTX 3060", 1700, 25);
        adicionarItem("Iphone 14", 7000, 12);
        adicionarItem("Samsung S21", 3700, 29);
        adicionarItem("Intel i7", 1700, 11);

    }

    public void adicionarItem(String nome, int valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        itens.add(item);
    }

    public Iterator createIterator() {
        return new LojaFisica2Iterator(itens);
    }

}

