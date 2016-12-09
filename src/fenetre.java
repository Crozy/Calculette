import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fenetre extends Frame implements ActionListener   {

	private Button BtnQuitter;
	private Label   Resultat;
	private Button LeBouttonCE, LeBouttonFois, LeBouttonDivise, LeBouttonMoins, LeBouttonPlus, LeBouttonEgal, LeBouttonPoint, LeBoutton0, LeBoutton1, LeBoutton2, LeBoutton3, LeBoutton4, LeBoutton5, LeBoutton6, LeBoutton7, LeBoutton8, LeBoutton9;
	private float NombreFinale1 = 0, NombreFinale2 = 0, NombreFinale = 0;
	private String NombreText = "", Operateur = "";
	
	public fenetre(String Titre)
	{
		super(Titre);
		this.setLayout(null);
		this.setBounds(100, 100, 600, 600);
		BtnQuitter = new Button("Quitter");
		BtnQuitter.addActionListener(this);
		BtnQuitter.setBounds(250, 500, 100, 50);
		this.add(BtnQuitter); 
		this.setResizable(false);	//Désactive le redimensionnement de la fenêtre
				
		LeBoutton1 = new Button("1");
		LeBoutton1.addActionListener(this);
		LeBoutton1.setBounds(200, 200, 50, 50);
		this.add(LeBoutton1); 
		
		LeBoutton2 = new Button("2");
		LeBoutton2.addActionListener(this);
		LeBoutton2.setBounds(250, 200, 50, 50);
		this.add(LeBoutton2);
		
		LeBoutton3 = new Button("3");
		LeBoutton3.addActionListener(this);
		LeBoutton3.setBounds(300, 200, 50, 50);
		this.add(LeBoutton3);
		
		LeBoutton4 = new Button("4");
		LeBoutton4.addActionListener(this);
		LeBoutton4.setBounds(200, 250, 50, 50);
		this.add(LeBoutton4);
		
		LeBoutton5 = new Button("5");
		LeBoutton5.addActionListener(this);
		LeBoutton5.setBounds(250, 250, 50, 50);
		this.add(LeBoutton5); 
		
		LeBoutton6 = new Button("6");
		LeBoutton6.addActionListener(this);
		LeBoutton6.setBounds(300, 250, 50, 50);
		this.add(LeBoutton6); 
		
		LeBoutton7 = new Button("7");
		LeBoutton7.addActionListener(this);
		LeBoutton7.setBounds(200, 300, 50, 50);
		this.add(LeBoutton7);
		
		LeBoutton8 = new Button("8");
		LeBoutton8.addActionListener(this);
		LeBoutton8.setBounds(250, 300, 50, 50);
		this.add(LeBoutton8); 
		
		LeBoutton9 = new Button("9");
		LeBoutton9.addActionListener(this);
		LeBoutton9.setBounds(300, 300, 50, 50);
		this.add(LeBoutton9);
		
		LeBoutton0 = new Button("0");
		LeBoutton0.addActionListener(this);
		LeBoutton0.setBounds(200, 350, 100, 50);
		this.add(LeBoutton0);
		
		LeBouttonPoint = new Button(".");
		LeBouttonPoint.addActionListener(this);
		LeBouttonPoint.setBounds(300, 350, 50, 50);
		this.add(LeBouttonPoint);
		
		LeBouttonEgal = new Button("=");
		LeBouttonEgal.addActionListener(this);
		LeBouttonEgal.setBounds(200, 400, 200, 50);
		this.add(LeBouttonEgal);
		
		LeBouttonPlus = new Button("+");
		LeBouttonPlus.addActionListener(this);
		LeBouttonPlus.setBounds(350, 200, 50, 50);
		this.add(LeBouttonPlus);
		
		LeBouttonMoins = new Button("-");
		LeBouttonMoins.addActionListener(this);
		LeBouttonMoins.setBounds(350, 250, 50, 50);
		this.add(LeBouttonMoins);
		
		LeBouttonDivise = new Button("/");
		LeBouttonDivise.addActionListener(this);
		LeBouttonDivise.setBounds(350, 300, 50, 50);
		this.add(LeBouttonDivise);
		
		LeBouttonFois = new Button("X");
		LeBouttonFois.addActionListener(this);
		LeBouttonFois.setBounds(350, 350, 50, 50);
		this.add(LeBouttonFois);
		
		Resultat = new Label("Le résultat s'affichera ici");
		Resultat.setBounds(230, 50, 150, 100);
		this.add(Resultat);
		
		LeBouttonCE = new Button("CE");
		LeBouttonCE.addActionListener(this);
		LeBouttonCE.setBounds(200, 150, 200, 50);
		this.add(LeBouttonCE);
		
		this.show();

	}
	
	public void actionPerformed(ActionEvent e) //gestionnaire de l'événement ActionEvent 
	{    
		Object source = e.getSource();
		
			if(source == LeBoutton0)
			{
				NombreText = NombreText + 0;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton1)
			{
				NombreText = NombreText + 1;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton2)
			{
				NombreText = NombreText + 2;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton3)
			{
				NombreText = NombreText + 3;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton4)
			{
				NombreText = NombreText + 4;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton5)
			{
				NombreText = NombreText + 5;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton6)
			{
				NombreText = NombreText + 6;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton7)
			{
				NombreText = NombreText + 7;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton8)
			{
				NombreText = NombreText + 8;
				Resultat.setText(NombreText);
			}
			else if(source == LeBoutton9)
			{
				NombreText = NombreText + 9;
				Resultat.setText(NombreText);
			}
			else if(source == LeBouttonEgal)
			{
				NombreFinale2 = Float.parseFloat(Resultat.getText());
				
				switch (Operateur)
				{
				  case "+":
					  NombreFinale = NombreFinale1 + NombreFinale2;
				    break;
				  case "-":
					  NombreFinale = NombreFinale1 - NombreFinale2;
				    break; 
				  case "/":
					  if(NombreFinale2 == 0)
					  {
						  Resultat.setText("ERREUR");
					  }
					  else
					  {
						  NombreFinale = NombreFinale1 / NombreFinale2;
					  }
				    break; 
				  case "X":
					  NombreFinale = NombreFinale1 * NombreFinale2;
				    break; 
				  default:
					  NombreFinale = 000;             
				}
				
				if(Resultat.getText() != "ERREUR")
				{
				Resultat.setText(NombreFinale + "");
				}
				
			}
			else if(source == LeBouttonMoins)
			{
				//NombreFinale1 = Integer.parseInt(NombreText);
				NombreFinale1 = Float.parseFloat(Resultat.getText());
				NombreText = "";
				Operateur = "-";
				//Resultat.setText("-");
			}
			else if(source == LeBouttonPlus)
			{
				NombreFinale1 = Float.parseFloat(Resultat.getText());
				NombreText = "";
				Operateur = "+";
				//Resultat.setText("+");
			}
			else if(source == LeBouttonDivise)
			{
				NombreFinale1 = Float.parseFloat(Resultat.getText());
				NombreText = "";
				Operateur = "/";
				//Resultat.setText("/");
			}
			else if(source == LeBouttonPoint)
			{
				NombreText = NombreText +".";
				Resultat.setText(NombreText);
			}
			else if(source == LeBouttonFois)
			{
				NombreFinale1 = Float.parseFloat(Resultat.getText());
				NombreText = "";
				Operateur = "X";
				//Resultat.setText("X");
			}
			else if(source == LeBouttonCE)
			{
				NombreText = "";
				Resultat.setText(NombreText);
			}
			else if(source == BtnQuitter)
			{
				this.dispose();
			}
			
	}
}
