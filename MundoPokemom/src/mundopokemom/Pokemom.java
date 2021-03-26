package mundopokemom;
public class Pokemom {
    
    public String nome;
    public String tipo;
    public int poder;

    public void status(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.poder);
        System.out.println("------------------");
    }

    public void lutar(Pokemom p1, Pokemom p2){
    
        if(p1.poder < p2.poder)  {
      
            System.out.println("Misha");
      
        }else{
        
            System.out.println("Ash");
        }
    }
}
