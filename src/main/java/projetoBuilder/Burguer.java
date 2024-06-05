package projetoBuilder;

public abstract class Burguer implements Item {

    public Packing packing(){
        return new wrapper();
    }
    public abstract float price();
}
