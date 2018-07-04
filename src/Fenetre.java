import javax.swing.*;

public class Fenetre extends JFrame {
    Model model;



    public Fenetre(Model model){
        this.model = model;
        initAttribut();
        ajouterWidget();
        setSize(600,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initAttribut() {

    }

    private void ajouterWidget() {

    }
}
