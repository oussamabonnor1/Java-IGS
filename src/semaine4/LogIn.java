package semaine4;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

    private JPanel contentPane;
    private JTextField userName;
    private JPasswordField password;
    private JButton btnLogin;
    private JButton btnForgotPassword;
    private JLabel message;
    private JLabel help;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn frame = new LogIn();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LogIn() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 332, 424);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        userName = new JTextField();
        userName.setBounds(96, 121, 124, 20);
        contentPane.add(userName);
        userName.setColumns(10);

        password = new JPasswordField();
        password.setBounds(96, 186, 124, 20);
        contentPane.add(password);

        JLabel lblUsername = new JLabel("username");
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setBounds(95, 96, 125, 14);
        contentPane.add(lblUsername);

        help = new JLabel("");
        help.setHorizontalAlignment(SwingConstants.CENTER);
        help.setBounds(49, 287, 211, 14);
        contentPane.add(help);

        message = new JLabel("Login to access your account");
        message.setFont(new Font("Tahoma", Font.PLAIN, 14));
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setBounds(49, 27, 213, 20);
        contentPane.add(message);

        JLabel lblPassword = new JLabel("password");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setBounds(95, 160, 125, 14);
        contentPane.add(lblPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String pwd = String.valueOf(password.getPassword());

                if(userName.getText().matches("admin")&& pwd.matches("azerty")){
                    StockHandle stock = new StockHandle();
                    stock.setVisible(true);
                    setVisible(false);
                }else{
                    message.setText("Wrong user name or password !");
                }
            }
        });
        btnLogin.setBounds(41, 241, 113, 23);
        contentPane.add(btnLogin);

        btnForgotPassword = new JButton("Forgot password");
        btnForgotPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                help.setText("Your password is azerty");
            }
        });
        btnForgotPassword.setBounds(164, 241, 113, 23);
        contentPane.add(btnForgotPassword);



    }
}

