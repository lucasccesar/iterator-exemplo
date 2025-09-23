public class LojaFisica1 implements LojaFisica {

    Item[] itens;
    int numeroItens = 0;

    public LojaFisica1() {
        itens = new Item[5];

        adicionarItem("RTX 2050", 900, 54);
        adicionarItem("RTX 2060", 1100, 35);
        adicionarItem("Iphone 13", 5500, 91);
        adicionarItem("Samsung S20", 2500, 27);
        adicionarItem("Intel i5", 1300, 5);

    }

    public void adicionarItem(String nome, int valor, int quantidade) {
        Item item = new Item(nome, valor, quantidade);
        itens[numeroItens] = item;
        numeroItens++;
    }

    public Iterator createIterator() {
        return new LojaFisica1Iterator(itens);
    }

}

