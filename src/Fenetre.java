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
    private JButton buttonChoix0;
    private JButton buttonChoix1;
    private JButton buttonChoix2;
    private JButton buttonChoixRetour;

    private JButton buttonCombat;
    private JButton buttonCombat1;
    private JButton buttonCombat2;
    private JButton buttonCombat3;
    private JButton buttonCombat0;
    private JButton buttonFuir;
    private JButton buttonPokemon;
    private JButton buttonObjet;

    private JLabel imagePokemonAllie;
    private JLabel imagePokemonRival;
    private JProgressBar barPVAllie;
    private JProgressBar barPVRival;

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

    public JButton getButtonChoix0() {
        return buttonChoix0;
    }
    public JButton getButtonChoix1() {
        return buttonChoix1;
    }
    public JButton getButtonChoix2() {
        return buttonChoix2;
    }
    public JButton getButtonChoixRetour() {
        return buttonChoixRetour;
    }

    public JButton getButtonFuir() {
        return buttonFuir;
    }

    public void ajouterControlBouton(ActionListener actionListener){
        buttonJeu.addActionListener(actionListener);
        buttonQuitter.addActionListener(actionListener);

        buttonChoix0.addActionListener(actionListener);
        buttonChoix1.addActionListener(actionListener);
        buttonChoix2.addActionListener(actionListener);
        buttonChoixRetour.addActionListener(actionListener);

        buttonCombat.addActionListener(actionListener);
        //buttonCombat1.addActionListener(actionListener);
        //buttonCombat2.addActionListener(actionListener);
        //buttonCombat3.addActionListener(actionListener);
        //buttonCombat0.addActionListener(actionListener);
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
        buttonChoix0 = new JButton(new ImageIcon("ImagePokemon/"+chargerPokemon(0)+".jpg"));
        buttonChoix1 = new JButton(new ImageIcon("ImagePokemon/"+chargerPokemon(1)+".jpg"));
        buttonChoix2 = new JButton(new ImageIcon("ImagePokemon/"+chargerPokemon(2)+".jpg"));
        buttonChoixRetour = new JButton("Retour");

        buttonChoix0.setPreferredSize(new Dimension(50, 50));
        buttonChoix1.setPreferredSize(new Dimension(50, 50));
        buttonChoix2.setPreferredSize(new Dimension(50, 50));

        buttonCombat = new JButton("Combat");
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
        panelChoix.add(buttonChoix0);
        panelChoix.add(buttonChoix1);
        panelChoix.add(buttonChoix2);

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
        imagePokemonAllie = new JLabel(new ImageIcon("ImagePokemon/"+chargerPokemon(model.getPokemon())+".jpg"));
        imagePokemonRival = new JLabel(new ImageIcon("ImagePokemon/"+chargerPokemon(model.getPokemonRival())+".jpg"));
        barPVAllie = new JProgressBar();
        barPVRival = new JProgressBar();
        barPVAllie.setMaximum(50);
        barPVRival.setMaximum(50);
        barPVAllie.setMinimum(0);
        barPVRival.setMinimum(0);
        barPVAllie.setValue(50);
        barPVRival.setValue(50);

        barPVAllie.setStringPainted(true);
        barPVAllie.setForeground(Color.green);

        barPVRival.setStringPainted(true);
        barPVRival.setForeground(Color.green);

        barPVAllie.setString("50/50");
        barPVRival.setString("50/50");

        JPanel panelAllie = new JPanel();
        panelAllie.setLayout(new BoxLayout(panelAllie, BoxLayout.Y_AXIS));
        panelAllie.add(imagePokemonAllie);
        panelAllie.add(barPVAllie);

        JPanel panelRival = new JPanel();
        panelRival.setLayout(new BoxLayout(panelRival, BoxLayout.Y_AXIS));
        panelRival.add(imagePokemonRival);
        panelRival.add(barPVRival);

        JPanel panelGraphique = new JPanel();
        panelGraphique.setLayout(new BoxLayout(panelGraphique, BoxLayout.X_AXIS));
        panelGraphique.add(panelAllie);
        panelGraphique.add(panelRival);

        buttonCombat0 = new JButton("Attaque 1");
        buttonCombat1 = new JButton("Attaque 2");
        buttonCombat2 = new JButton("Attaque 3");
        buttonCombat3 = new JButton("Attaque 4");

        JPanel panelChoix = new JPanel();
        panelChoix.setLayout(new GridLayout(2, 2, 10, 10));
        panelChoix.setBorder(BorderFactory.createLineBorder(Color.red));
        panelChoix.add(buttonCombat);
        panelChoix.add(buttonPokemon);
        panelChoix.add(buttonObjet);
        panelChoix.add(buttonFuir);

        JPanel panelCombat = new JPanel();
        panelCombat.setLayout(new GridLayout(2, 2, 10, 10));
        panelCombat.setBorder(BorderFactory.createLineBorder(Color.red));
        panelCombat.add(buttonCombat0);
        panelCombat.add(buttonCombat1);
        panelCombat.add(buttonCombat2);
        panelCombat.add(buttonCombat3);

        JPanel panelAction = new JPanel();
        panelAction.setLayout(new BoxLayout(panelAction, BoxLayout.X_AXIS));
        panelAction.add(panelCombat);
        panelAction.add(panelChoix);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(panelGraphique);
        panel.add(panelAction);

        panelGen.add(panel);

        setContentPane(panelGen);

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

    private String chargerPokemon(int id){
        String nomPokemon = "";
        switch(id){
            case 0:
                nomPokemon = "salameche";
                break;
            case 1:
                nomPokemon = "herbizarre";
                break;
            case 2:
                nomPokemon = "carapuce";
                break;
        }
        return nomPokemon;
    }
}
