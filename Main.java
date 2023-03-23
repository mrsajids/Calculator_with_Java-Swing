import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel panel;
    private JTextField text;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton equalbutton;
    private JButton plusbutton;
    private JButton cButton;
    private JTextField text1;
    private JButton buttonsub;
    private JButton buttonmul;
    private JButton buttondiv;
    private JButton a9Button;

    int ch;
    double d,result=0,d2=1;
    void check(){
        switch (ch){
            case 1:
                result=result+d; //1
                break;
            case 2:
                result=result-d;
                break;
            case 3:
                result=result*d;//d=12 d=6

                break;
            case 4:
                result=result/d;
                break;
        }
    }
    Main(){ 
      setContentPane(panel);
        setTitle("Calculator");
        setSize(600,400);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"1");
                text1.setText(text1.getText()+"1");
                d=Double.parseDouble(text.getText()); //1
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"2");
                text1.setText(text1.getText()+"2");
                d=Double.parseDouble(text.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"3");
                text1.setText(text1.getText()+"3");
                d=Double.parseDouble(text.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"4");
                text1.setText(text1.getText()+"4");
                d=Double.parseDouble(text.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"5");
                text1.setText(text1.getText()+"5");
                d=Double.parseDouble(text.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"6");
                text1.setText(text1.getText()+"6");
                d=Double.parseDouble(text.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"7");
                text1.setText(text1.getText()+"7");
                d=Double.parseDouble(text.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"8");
                text1.setText(text1.getText()+"8");
                d=Double.parseDouble(text.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"0");
                text1.setText(text1.getText()+"0");
                d=Double.parseDouble(text.getText());
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                text1.setText("");
                result=d=0;
            }
        });
        plusbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // text.setText(text.getText()+"+"); ////
                ch=1; text.setText(""); //ch=1
                text1.setText(text1.getText()+"+");
                check();
            }
        });
        equalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check();
                text.setText(""); text1.setText("");
                text1.setText(String.valueOf(result));
                text.setText(String.valueOf(result));
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText()+"9");
                text1.setText(text1.getText()+"9");
                d=Double.parseDouble(text.getText());
            }
        });
        buttonsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch=2; text.setText(""); //ch=1
                text1.setText(text1.getText()+"-");
                check();
            }
        });
        buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch=4; text.setText(""); //ch=1
                text1.setText(text1.getText()+"/");
                result=d;
               // check();
            }
        });
        buttonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch=3; text.setText(""); //ch=1
                text1.setText(text1.getText()+"x");
                result=1;
                check();
            }
        });
    }

    public static void main(String[] args) {
        Main c=new Main();
    }
}
