import java.util.Hashtable;

public class LojaFisica3Iterator implements Iterator<Item> {

    Hashtable<Integer,Item> itens;
    int position = 0;

    public LojaFisica3Iterator(Hashtable<Integer,Item> itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return position < itens.size();
    }

    @Override
    public Item next() {
        return itens.get(position++);
    }

}

