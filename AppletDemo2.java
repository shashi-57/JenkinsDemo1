import java.applet.*;
import java.awt.*;
/*<applet code="AppletDemo2.class"width="300"height="300">
</applet>*/
public class AppletDemo2 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
int x[]={200,300,300,200,100,100};
int y[]={0,100,500,700,500,100};
g.fillPolygon(x,y,6);
g.setColor(Color.RED);
g.drawArc(100,200,300,400,500,600);
}
}
