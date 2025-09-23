import java.util.ArrayList;

public class LojaFisica2Iterator implements Iterator<Item> {

    ArrayList<Item> itens;
    int position = 0;

    public LojaFisica2Iterator(ArrayList<Item> itens) {
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

