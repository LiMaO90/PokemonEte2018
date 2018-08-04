import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private Model model;
    private JPanel panelGen;

    private JLabel labelTitre;
    private JButton buttonJeu;
    private JButton buttonQuitter;

    private JLabel labelChoix;
    private JButton buttonChoix1;
    private JButton buttonChoix2;
    private JButton buttonChoix3;
    private JButton buttonChoixRetour;

    private JButton buttonCombat;
    private JButton buttonCombat1;
    private JButton buttonCombat2;
    private JButton buttonCombat3;
    private JButton buttonCombat0;
    private JButton buttonFuir;
    private JButton buttonPokemon;
    private JButton buttonObjet;

    public Fenetre(Model model){
        this.model = model;
        initAttribut();
        ajouterMenue();
        setSize(600,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public JButton getButtonJeu() {
        return buttonJeu;
    }
    public JButton getButtonQuitter() {
        return buttonQuitter;
    }

    public JButton getButtonChoix1() {
        return buttonChoix1;
    }
    public JButton getButtonChoix2() {
        return buttonChoix2;
    }
    public JButton getButtonChoix3() {
        return buttonChoix3;
    }
    public JButton getButtonChoixRetour() {
        return buttonChoixRetour;
    }


    public void ajouterControlBouton(ActionListener actionListener){
        buttonJeu.addActionListener(actionListener);
        buttonQuitter.addActionListener(actionListener);

        buttonChoix1.addActionListener(actionListener);
        buttonChoix2.addActionListener(actionListener);
        buttonChoix3.addActionListener(actionListener);
        buttonChoixRetour.addActionListener(actionListener);

        buttonCombat.addActionListener(actionListener);
        buttonCombat1.addActionListener(actionListener);
        buttonCombat2.addActionListener(actionListener);
        buttonCombat3.addActionListener(actionListener);
        buttonCombat0.addActionListener(actionListener);
        buttonFuir.addActionListener(actionListener);
        buttonPokemon.addActionListener(actionListener);
        buttonObjet.addActionListener(actionListener);
    }

    private void initAttribut() {
        panelGen = new JPanel();
        labelTitre = new JLabel("Simulation combat Pokemon !!!");
        buttonJeu = new JButton("Play");
        buttonQuitter = new JButton("Quitter");

        labelChoix = new JLabel("Choisir un Pokemon : ");
        buttonChoix1 = new JButton(new ImageIcon("ImagePokemon/salameche.jpg"));
        buttonChoix2 = new JButton(new ImageIcon("ImagePokemon/herbizarre.jpg"));
        buttonChoix3 = new JButton(new ImageIcon("ImagePokemon/carapuce.jpg"));
        buttonChoixRetour = new JButton("Retour");

        buttonChoix1.setPreferredSize(new Dimension(50, 50));
        buttonChoix2.setPreferredSize(new Dimension(50, 50));
        buttonChoix3.setPreferredSize(new Dimension(50, 50));

        buttonCombat = new JButton("Combat");
        buttonCombat1 = new JButton("Attaque 1");
        buttonCombat2 = new JButton("Attaque 2");
        buttonCombat3 = new JButton("Attaque 3");
        buttonCombat0 = new JButton("Attaque 4");
        buttonFuir = new JButton("Fuir");
        buttonPokemon = new JButton("Pokemon");
        buttonObjet = new JButton("Objet");
    }

    private void ajouterMenue() {
        JPanel panelPlay = new JPanel();
        panelPlay.add(buttonJeu);

        JPanel panelQuitter = new JPanel();
        panelPlay.add(buttonQuitter);

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(3, 1, 10, 10));
        panelMenu.add(labelTitre);
        panelMenu.add(panelPlay);
        panelMenu.add(buttonQuitter);
        panelGen.add(panelMenu);
        setContentPane(panelGen);
    }

    private void ajouterChoix() {
        JPanel panelChoix = new JPanel();
        panelChoix.setLayout(new GridLayout(1, 3, 10, 10));
        panelChoix.add(buttonChoix1);
        panelChoix.add(buttonChoix2);
        panelChoix.add(buttonChoix3);

        JPanel panelLabel = new JPanel();
        panelLabel.add(labelChoix);

        JPanel panelRetour = new JPanel();
        panelRetour.add(buttonChoixRetour);

        JPanel panelGlobal = new JPanel();
        panelGlobal.setLayout(new GridLayout(3, 1, 10, 10));
        panelGlobal.add(panelLabel);
        panelGlobal.add(panelChoix);
        panelGlobal.add(panelRetour);
        panelGen.add(panelGlobal);
        setContentPane(panelGen);
    }

    private void ajouterCombat(){
        JPanel panelChoix = new JPanel();
        panelChoix.setLayout(new GridLayout(2, 2, 10, 10));
        panelChoix.setBorder(BorderFactory.createLineBorder(Color.red));
        panelChoix.add(buttonCombat);
        panelChoix.add(buttonPokemon);
        panelChoix.add(buttonObjet);
        panelChoix.add(buttonFuir);

    }

    public void changerFenetre(String vue){
        switch(vue){
            case "menu":
                panelGen.remove(0);
                ajouterMenue();
                break;
            case "choix":
                panelGen.remove(0);
                ajouterChoix();
                break;
            case "combat":
                panelGen.remove(0);
                ajouterCombat();
                break;
        }
    }
}
