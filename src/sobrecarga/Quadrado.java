package sobrecarga;

public class Quadrado {
	
	  private int x, y, lado;

	  public Quadrado(){

	  }
	  public Quadrado(int x, int y){
	    this.x = x;
	    this.y = y;
	  }
	  public Quadrado(int x, int y, int lado){
	    this.x = x;
	    this.y = y;
	    this.lado = lado;
	  }
	  public Quadrado(Quadrado q){
	    this.x = q.x;
	    this.y = q.y;
	    this.lado = q.lado;
	  }
	
}
