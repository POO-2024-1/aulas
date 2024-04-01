package aula2;

public class AppHeranca {

    public static void main(String[] args) {

        Animal animal = new Animal("rex","mamifero");
        System.out.println("\n\n");
        System.out.println("Veja como foram preenchidos os atributos de Animal\n\n");
        System.out.println(animal);
        animal.emiteSom();

        Cachorro cachorro = new Cachorro("buffy","Husky",4);
        System.out.println("\n\n");
        System.out.println("Veja como foram preenchidos os atributos de Cachorro\n\n");
        System.out.println(cachorro);
        cachorro.emiteSom();

        Gato gato = new Gato("fred", "persa", 4, "branco");
        System.out.println("\n\n");
        System.out.println("Veja como foram preenchidos os atributos de Gato\n\n");
        System.out.println(gato);
        gato.emiteSom();

    }


}
