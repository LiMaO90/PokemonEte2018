import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBouton implements ActionListener {
    Fenetre fenetre;
    Model model;

    public ControlBouton(Model model, Fenetre fenetre) {
        this.fenetre = fenetre;
        this.model = model;
        fenetre.ajouterControlBouton(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if(source == fenetre.getButtonJeu())
            fenetre.changerFenetre("choix");

        else if(source == fenetre.getButtonQuitter())
            System.exit(0);

        else if(source == fenetre.getButtonChoixRetour())
            fenetre.changerFenetre("menu");

        else if(source == fenetre.getButtonChoix0()){
            model.setPokemon(0);
            model.setPokemonRival((int) (Math.random()*3));
            fenetre.changerFenetre("combat");
        }
        else if(source == fenetre.getButtonChoix1()){
            model.setPokemon(1);
            model.setPokemonRival((int) (Math.random()*3));
            fenetre.changerFenetre("combat");
        }
        else if(source == fenetre.getButtonChoix2()){
            model.setPokemon(2);
            model.setPokemonRival((int) (Math.random()*3));
            fenetre.changerFenetre("combat");
        }
        else if(source == fenetre.getButtonFuir())
            fenetre.changerFenetre("choix");
    }
}
