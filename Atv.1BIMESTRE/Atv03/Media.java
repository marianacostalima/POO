package atividades_1bimestre.atividade_3; //declarando o package

import javax.swing.JOptionPane; //Importa o metodo JOptionPane da class javax.swing

public class Media { //cria a class principal 
    public static void main(String[] args){ //cria o metodo principal 

        String aux; //Cria a var do tipo String que vai receber a entrada 

		float prova1, prova2, notadotrabalho, media; //cria as var do tipo float
		
			aux = JOptionPane.showInputDialog("Insira a nota da prova 1: "); //Inicia a caixa de entrada e da o valor para a var aux
			prova1 = Float.parseFloat(aux); // transforma o valor da var "aux" (String) para a "prova1" (Float)
			
			aux = JOptionPane.showInputDialog("Insira a nota da prova 2: ");//Pergunta novamente na caixa pedindo um segundo numero
			prova2 = Float.parseFloat(aux);// transforma o valor da variavel "aux" (String) para a "prova2" (Flaot)
			
            aux = JOptionPane.showInputDialog("Insira a nota do trabalho: ");//Pergunta novamente na caixa pedindo um segundo numero
		    notadotrabalho = Float.parseFloat(aux);// transforma o valor da variavel "aux" (String) para a "notadotrabalho" (Float)
			
            media= (prova1 + prova2 + notadotrabalho) /3; //faz o calculo para calcular a media
        
			JOptionPane.showMessageDialog(null, "Á media do aluno foi " + media); //Imprimi na caixa a media
	
		System.exit(0); 

    }
}
