public class Aula1Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pato bird = new Pato();
        Humano cat = new Humano();

        animal.emiteSom();
        bird.emiteSom();
        cat.emiteSom();
    }
}