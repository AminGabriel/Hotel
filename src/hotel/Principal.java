package hotel;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor;
		
		Suite s = new Suite(null, null, 0, 0);
		
		QuartoDuplo qd = new QuartoDuplo(null, null, 0, 0);
	
		QuartoSimples qs = new QuartoSimples(null, null, 0, 0);
		
		
		Object[] opcoes = {"Acomodações", "Sair"};
		Object opcao;
		
				
		do {
			opcao = JOptionPane.showInputDialog(null, "Ecolha o que deseja fzaer:", "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			
			if(opcao == "Acomodações") {
				
				Object[] oopcoes = {"Quarto simples", "Quarto duplo", "Suíte", "Voltar"};
				Object oopcao;
				
				do {
					oopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:", "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, oopcoes, oopcoes[0]);
					
					if(oopcao == "Quarto simples") {
						qs = null;
						qs = new QuartoSimples(null, null, 0, 0);
						
						
						qs.setNome(JOptionPane.showInputDialog("Digite o nome do contratante:"));
						qs.setCPF(JOptionPane.showInputDialog("Digite o CPF do contratante:"));
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de dias da estadia:");
							
							if(qs.testeInt(valor)) {
								qs.setDias(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de pessoas que irão ficar no quarto:");
							
							if(qs.testeInt(valor)) {
								qs.setNpessoas(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						Object[] ooopcoes = {"Sim", "Não"};
						Object ooopcao;
						
						ooopcao = JOptionPane.showInputDialog(null, "Serviços adicionais?", "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, ooopcoes, ooopcoes[0]);
						
						if(ooopcao == "Sim") {
							Object[] oooopcoes = {"Café da manhã", "Limpeza extra", "Café da manhã e limpeza extra", "Voltar"};
							Object oooopcao;
							
							oooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja adicionar:", "Gerenciador", JOptionPane.INFORMATION_MESSAGE ,null, oooopcoes, oooopcoes[0]);
							
							if(oooopcao == "Café da manhã") {
								qs.setCafeManha(true);
								qs.setLimpezaExtra(false);
								qs.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Café da manhã adicionado!");
							}else if(oooopcao == "Limpeza extra") {
								qs.setCafeManha(false);
								qs.setLimpezaExtra(true);
								qs.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Limpeza extra adicionada!");
							}else if(oooopcao == "Café da manhã e limpeza extra") {
								qs.setCafeManha(false);
								qs.setLimpezaExtra(false);
								qs.setCafeLimpeza(true);
								JOptionPane.showMessageDialog(null, "Café da manhã e limpeza extra adicionados!");
							}
							
						}
						
						qs.exibirDetalhes();
					}else if(oopcao == "Quarto duplo") {
						qd = null;
						qd = new QuartoDuplo(null, null, 0, 0);
						
						qd.setNome(JOptionPane.showInputDialog("Digite o nome do contratante:"));
						qd.setCPF(JOptionPane.showInputDialog("Digite o CPF do contratante:"));
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de dias da estadia:");
							
							if(qd.testeInt(valor)) {
								qd.setDias(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de pessoas que irão ficar no quarto:");
							
							if(qd.testeInt(valor)) {
								qd.setNpessoas(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						Object[] ooooopcoes = {"Sim", "Não"};
						Object ooooopcao;
						
						ooooopcao = JOptionPane.showInputDialog(null, "Serviços adicionais?", "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, ooooopcoes, ooooopcoes[0]);
						
						if(ooooopcao == "Sim") {
							Object[] oooooopcoes = {"Café da manhã", "Limpeza extra", "Café da manhã e limpeza extra", "Voltar"};
							Object oooooopcao;
							
							oooooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja adicionar:", "Gerenciador", JOptionPane.INFORMATION_MESSAGE ,null, oooooopcoes, oooooopcoes[0]);
							
							if(oooooopcao == "Café da manhã") {
								qd.setCafeManha(true);
								qd.setLimpezaExtra(false);
								qd.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Café da manhã adicionado!");
							}else if(oooooopcao == "Limpeza extra") {
								qd.setCafeManha(false);
								qd.setLimpezaExtra(true);
								qd.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Limpeza extra adicionada!");
							}else if(oooooopcao == "Café da manhã e limpeza extra") {
								qd.setCafeManha(false);
								qd.setLimpezaExtra(false);
								qd.setCafeLimpeza(true);
								JOptionPane.showMessageDialog(null, "Café da manhã e limpeza extra adicionados!");
							}
							
						}
						qd.exibirDetalhes();
					}else if(oopcao == "Suíte") {
						s = null;
						s = new Suite(null, null, 0, 0);
						
						s.setNome(JOptionPane.showInputDialog("Digite o nome do contratante:"));
						s.setCPF(JOptionPane.showInputDialog("Digite o CPF do contratante:"));
						
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de dias da estadia:");
							
							if(s.testeInt(valor)) {
								s.setDias(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						while(true) {
							valor = JOptionPane.showInputDialog(null, "Digite a quantidade de pessoas que irão ficar no quarto:");
							
							if(s.testeInt(valor)) {
								s.setNpessoas(Integer.parseInt(valor));
								break;
							}else {
								JOptionPane.showMessageDialog(null, "Por favor, informe um valor válido!");
							}
						}
						
						Object[] ooooooopcoes = {"Sim", "Não"};
						Object ooooooopcao;
						
						ooooooopcao = JOptionPane.showInputDialog(null, "Serviços adicionais?", "Gerenciador", JOptionPane.INFORMATION_MESSAGE, null, ooooooopcoes, ooooooopcoes[0]);
						
						if(ooooooopcao == "Sim") {
							Object[] oooooooopcoes = {"Café da manhã", "Limpeza extra", "Café da manhã e limpeza extra", "Voltar"};
							Object oooooooopcao;
							
							oooooooopcao = JOptionPane.showInputDialog(null, "Escolha o que deseja adicionar:", "Gerenciador", JOptionPane.INFORMATION_MESSAGE ,null, oooooooopcoes, oooooooopcoes[0]);
							
							if(oooooooopcao == "Café da manhã") {
								s.setCafeManha(true);
								s.setLimpezaExtra(false);
								s.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Café da manhã adicionado!");
							}else if(oooooooopcao == "Limpeza extra") {
								s.setCafeManha(false);
								s.setLimpezaExtra(true);
								s.setCafeLimpeza(false);
								JOptionPane.showMessageDialog(null, "Limpeza extra adicionada!");
							}else if(oooooooopcao == "Café da manhã e limpeza extra") {
								s.setCafeManha(false);
								s.setLimpezaExtra(false);
								s.setCafeLimpeza(true);
								JOptionPane.showMessageDialog(null, "Café da manhã e limpeza extra adicionados!");
							}
							
						}
						s.exibirDetalhes();
					}
					
				}while(oopcao != "Voltar");
			}
			
		}while(opcao != "Sair");
	}

}
