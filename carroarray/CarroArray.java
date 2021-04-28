package carroarray;

import java.util.Scanner;

public class CarroArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro[] carro = new Carro[5];// Array do tipo Carro
        
        for(int i=0; i<carro.length;i++){
            carro[i] = new Carro();
        }
        
        for(int i=0; i<carro.length;i++){
            System.out.println("Ano do "+(i+1)+"º carro:");
            carro[i].ano   = leitor.nextInt();
            System.out.println("Marca do "+(i+1)+"º carro:");
            carro[i].marca = leitor.next();
            System.out.println("Preço do "+(i+1)+"º carro:");
            carro[i].preço = leitor.nextFloat();
        }
        
        for(int i=0; i<carro.length;i++){
            System.out.println("\nMarca do "+(i+1)+"º carro: "+carro[i].marca);
            System.out.println("Ano do "+(i+1)+"º carro: "+carro[i].ano);
            System.out.println("Preço do "+(i+1)+"º carro: "+carro[i].preço);
            System.out.println("===========");
        }
    }
} //       EXERCÍCIO  1
  // Escreva um algoritmo que implemente um array de objetos do tipo pessoa,
  // onde pessoa é uma classe que tem os atributos
  // nome(String), idade(Int) e cpf(long).
  //       EXERCÍCIO  2
  // Escreva um método que receba dois valores float, como parâmetros 
  // e retorne a soma desses valores