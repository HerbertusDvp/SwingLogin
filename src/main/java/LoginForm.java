import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        bEnviar.addActionListener(e -> {
            validar();
        });
    }

    private void validar(){
        //Leer usuarios
        var usuario = this.tfUsuario.getText();
        var password = new String(this.pfPassword.getPassword());

        if (usuario.equals("root") && "admin".equals(password))
            mostrarMensaje("Bienvenido!");
        else if(usuario.equals("root"))
            mostrarMensaje("Password incorrecto");
        else if (password.equals("admin"))
            mostrarMensaje("Usuario incorrecto");
        else
            mostrarMensaje("Datos incorrectos..");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
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
