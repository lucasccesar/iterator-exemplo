public class LojaVirtual {

    static LojaFisica lojaFisica1;
    static LojaFisica lojaFisica2;
    static LojaFisica lojaFisica3;

    public static void main(String[] args) {

        lojaFisica1 = new LojaFisica1();
        lojaFisica2 = new LojaFisica2();
        lojaFisica3 = new LojaFisica3();

        mostrarProdutos();

    }

    public static void mostrarProdutos(){
        Iterator<Item> loja1iterator = lojaFisica1.createIterator();
        Iterator<Item> loja2iterator = lojaFisica2.createIterator();
        Iterator<Item> loja3iterator = lojaFisica3.createIterator();
        mostrarProdutos(loja1iterator);
        mostrarProdutos(loja2iterator);
        mostrarProdutos(loja3iterator);
    }

    public static void mostrarProdutos(Iterator<Item> iterator){
        while(iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item.getNome()
                    + ", " + item.getPreco()
                    + ", " + item.getQuantidade());
        }
        System.out.println("");
    }

}

