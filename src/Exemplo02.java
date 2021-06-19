
public class Exemplo02 {
	public static void main(String[] args){
		float nota1 = 10;
		float nota2 = 8;
		float media;
		int faltas = 5;
		
		media = (nota1 + nota2) / 2;
		System.out.println(media);
		
		
		if(media >= 7 && faltas < 10){
			System.out.println("Aprovado!");
		}else{
			System.out.println("Reprovado!");
		}
	}
}
