public class Const {
    public static void main(String[] args) {
        new F(false);
    }
}

class D {
    D() {
        System.out.println("Dziala konstruktor klasy D");
    }

    D(boolean arg) {
        if(!arg){
            System.out.println("Dziala konstruktor D");
        }
    }
}

class E extends  D{
    E(){
        System.out.println("Dziala konstruktor klasy E");
    }
    E(boolean ar){
        super(true);
        if(!ar){
            System.out.println("Dziala konstruktor E");
        }

    }
}
class F extends  E {
    F(){
        System.out.println("Dziala konstruktor klasy F");
    }
    F(boolean args){
        super(true);
        if (!args){
            System.out.println("Dziala konstruktor F");
        }
    }
}
