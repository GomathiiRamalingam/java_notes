/*
<applet code = Toyface width =300 height =350 >
</applet> */
import java.applet.Applet;
import java.awt.*;
public class Toyface
 extends Applet
 {
	 public void init()
	 {
		 setBackground(Color.green);
		 setForeground(Color.red);
	 }
 public void paint(Graphics gp)
{
int x1=100,y1=100;
int w1=200,h1=200;
gp.drawOval(x1,y1,w1,h1);
int x2=140,y2=140;
int w2=40,h2=40;
gp.drawOval(x2,y2,w2,h2);
int x3=120,y3=300;
int w3=180,h3=200;
gp.drawOval(x3,y3,w3,h3);
int x4=220,y4=140;
int w4=40,h4=40;
gp.drawOval(x4,y4,w4,h4);
int x5=180,y5=190;
int w5=45,h5=45;
gp.drawOval(x5,y5,w5,h5);
gp.drawArc(150,180,100,80,0,-180);
//gp.drawArc(150,180,100,30,0,-180);
gp.drawOval(150,150,20,30);
gp.fillOval(150,160,20,20);
gp.drawOval(230,150,20,30);
gp.fillOval(230,160,20,20);
gp.drawLine(160,480,160,580);
gp.drawLine(266,480,266,580);
gp.drawOval(265,580,40,10);
gp.drawOval(159,580,40,10);
gp.drawOval(145,340,130,160);
gp.fillOval(145,340,130,160);
gp.drawLine(70,10,103,170);
gp.drawLine(70,10,170,103);
gp.drawLine(330,10,300,180);
gp.drawLine(330,10,210,103);
gp.drawLine(132,350,80,450);
gp.drawOval(80,450,20,10);
gp.fillOval(80,450,20,10);
gp.drawLine(290,350,350,450);
gp.drawOval(350,450,20,10);
gp.fillOval(350,450,20,10);
}

 }