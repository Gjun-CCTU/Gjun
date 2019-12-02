package layout;

import java.awt.*;

public class MyFrame extends Frame {
    Label lb = new Label();
    Button btn1 = new Button();
    Button btn2 = new Button("green");
    Button btn3 = new Button("blue");
    Button btn4 = new Button("bye");

    public MyFrame(int w, int h, int x, int y, String name){
        setLayout(null);
        setVisible(true);
        setSize(w, h);
        setLocation(x, y);
        setTitle(name);
        setBackground(Color.PINK);

        lb.setText("Android ");
        lb.setBackground(Color.YELLOW);
        lb.setSize(200, 50);
        lb.setLocation(50, 50);

        btn1.setLabel("red");
        btn1.setSize(50, 30);
        btn1.setLocation(50, 110);

        btn2.setBounds(100, 110, 50, 30);
        btn3.setBounds(150, 110, 50, 30);
        btn4.setBounds(200, 110, 50, 30);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(lb);


    }

    public void getMyFrameName(){
        lb.setText(btn1.getLabel()+"  "+
                btn2.getLabel()+"  "+
                btn3.getLabel()+"  "+
                btn4.getLabel());
    }
}
