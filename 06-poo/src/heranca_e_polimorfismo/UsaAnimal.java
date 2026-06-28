package heranca_e_polimorfismo;

public class UsaAnimal {
    public static void main(String[] args){

        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
