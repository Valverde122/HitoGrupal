

public class Main {
    public static void main(String[] args) {
        Gato garfield = new Gato("Garfield",7);
    
        Perro rocky = new Perro("Roky", 12);

        Animal[] mascotas  = {garfield,rocky};
        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i].comer();
        }


    }
    
    

        
}