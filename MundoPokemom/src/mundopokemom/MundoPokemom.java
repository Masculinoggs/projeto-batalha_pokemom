package mundopokemom;
public class MundoPokemom {
    public static void main(String[] args) {
     
       Treinador ash = new Treinador();
       ash.nome = "Ash";
       ash.idade = 10;
       ash.status();
       Pokemom p1 = new Pokemom();
       p1.nome = "Pikachu";
       p1.tipo = "Eletrico";
       p1.poder = 1000;
       p1.status();
       Pokemom p2 = new Pokemom();
       p2.nome = "Greninja";
       p2.tipo = "Agua";
       p2.poder = 7000;
       p2.status();
       Pokemom p3 = new Pokemom();
       p3.nome = "Charizard";
       p3.tipo = "Fogo";
       p3.poder = 3000;
       p3.status();
       
       Treinador t2 = new Treinador();
       t2.nome = "Misha";
       t2.idade = 10;
       t2.status();
       Pokemom p4 = new Pokemom();
       p4.nome = "Gengar";
       p4.tipo = "Fantasma";
       p4.poder = 900;
       p4.status();
       Pokemom p5 = new Pokemom();
       p5.nome = "Blastoise";
       p5.tipo = "Agua";
       p5.poder = 5000;
       p5.status();
       Pokemom p6 = new Pokemom();
       p6.nome = "Snorlax";
       p6.tipo = "Normal";
       p6.poder = 6000;
       p6.status();
       
       Pokemom resultado = new Pokemom();
       resultado.lutar(p1, p4);
       resultado.lutar(p2, p5);
       resultado.lutar(p3, p6);
        
    
    
    }
    
}
