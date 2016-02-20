package cadastro;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Gui extends Frame implements ActionListener{
	private Label loginLabel;
	private Label senhaLabel;
	private Label repetirSenhaLabel;
	private Label vazio;
	
	private JPasswordField senha;
	private JPasswordField repetirSenha;
	private TextField loginTextFeild;
	
	private Button cadastrarButton;
	
	
	public Gui(){
		setLayout(new GridLayout(4, 2));
		setTitle("Cadastro");
		setSize(416, 137);
		
		loginLabel = new Label("Login: ");
		senhaLabel = new Label("Senha: ");
		repetirSenhaLabel = new Label("Repetir senha: ");
		vazio = new Label();
		
		senha = new JPasswordField();
		repetirSenha = new JPasswordField();
		loginTextFeild = new TextField();
		
		cadastrarButton = new Button("CADASTRAR");
		
		this.add(loginLabel);
		this.add(loginTextFeild);
		this.add(senhaLabel);
		this.add(senha);
		this.add(repetirSenhaLabel);
		this.add(repetirSenha);
		this.add(vazio);
		this.add(cadastrarButton);
		
		cadastrarButton.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Senha s = null;
		try{
			s = new Senha(new String(senha.getPassword()), new String(repetirSenha.getPassword()));
		}catch(Exception erro){
			JOptionPane.showMessageDialog(this,
				    erro,
				    "error",
				    JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
}
