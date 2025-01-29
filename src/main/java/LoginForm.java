import javax.swing.*;

public class LoginForm extends JFrame {
    private JPanel pPrincipal;
    private JLabel laLogin;
    private JTextField tfUsuario;
    private JLabel laUsuario;
    private JLabel laPassword;
    private JPasswordField pfPassword;
    private JButton bEnviar;

    public LoginForm(){
        iniciarForma();
    }

    private void iniciarForma(){
        setContentPane(pPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
