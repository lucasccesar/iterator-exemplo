import java.util.Hashtable;

public class LojaFisica3 implements LojaFisica{

    Hashtable<Integer, Item> itens;
    int chave = 0;

    public LojaFisica3() {
        itens = new Hashtable<>();

        adicionarItem("RTX 4050", 1900, 67);
        adicionarItem("RTX 4060", 2300, 43);
        adicionarItem("Iphone 15", 7000, 3);
        adicionarItem("Samsung S22", 3700, 14);
        adicionarItem("Intel i9", 1700, 89);

    }

    public void adicionarItem(String nome, int valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        itens.put(chave, item);
        chave++;
    }

    public Iterator createIterator() {
        return new LojaFisica3Iterator(itens);
    }

}

