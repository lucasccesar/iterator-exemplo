public class LojaFisica1Iterator implements Iterator<Item> {

    Item[] itens;
    int position = 0;

    public LojaFisica1Iterator(Item[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return position < itens.length;
    }

    @Override
    public Item next() {
        return itens[position++];
    }

}

