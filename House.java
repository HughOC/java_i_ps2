import java.awt.Frame;
import java.awt.Panel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class House
{
	public static void main(String[] args)
	{
		DrawingFrame frame = new DrawingFrame();
	}
}

class DrawingFrame extends Frame
{
	public DrawingFrame()
	{
		final int DEFAULT_FRAME_WIDTH = 400;
		final int DEFAULT_FRAME_HEIGHT = 400;
		setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT );
		setTitle("Hugh's House");
		pane = new DrawingPane();
		add ( pane );
		setVisible( true );
	}
		private DrawingPane pane;
}

class DrawingPane extends Panel
{
	public void paint( Graphics g)
	{
		
		//Sky:
		g.setColor( Color.black);
		int[] xValues_sky = {0, 400, 400, 0 };
		int[] yValues_sky = {0, 0, 200, 200};
		g.fillPolygon( xValues_sky, yValues_sky, 4);
		
		
		//Stars:
		g.setColor( Color.white);
		g.drawOval(10, 10, 1, 1);
		g.drawOval(60, 5, 1, 1);
		g.drawOval(40, 60, 1, 1);
		g.drawOval(200, 40, 1, 1);
		g.drawOval(350, 90, 1, 1);
		g.drawOval(50, 150, 1, 1);
		g.drawOval(100, 125, 1, 1);
		g.drawOval(370, 50, 1, 1);
		g.drawOval(125, 100, 1, 1);
		g.drawOval(300, 100, 1, 1);
		g.drawOval(250, 10, 1, 1);
		g.drawOval(90, 100, 1, 1);
		g.drawOval(170, 50, 1, 1);
		g.drawOval(140, 50, 1, 1);
		g.drawOval(100, 25, 1, 1);
		g.drawOval(300, 28, 1, 1);
		g.drawOval(250, 60, 1, 1);
		g.drawOval(355, 160, 1, 1);
		g.drawOval(200, 80, 1, 1);
		
		
		//Bushes
		Color bushes1 = new Color (0, 102, 0);
		g.setColor(bushes1);
		//LHS of house bushes
		g.fillOval(-20, 150, 40, 70);
		g.fillOval(0, 150, 40, 70);
		g.fillOval(20, 130, 40, 70);
		g.fillOval(20, 170, 40, 70);
		g.fillOval(50, 155, 40, 70);
		g.fillOval(80, 155, 40, 70);
		g.fillOval(95, 150, 40, 70);
		g.fillOval(110, 150, 40, 70);
		g.fillOval(140, 135, 40, 70);
		//RHS of house bushes:
		g.fillOval(300, 155, 40, 70);
		g.fillOval(325, 170, 40, 70);
		g.fillOval(350, 140, 40, 70);
		g.fillOval(370, 160, 40, 70);
		g.fillOval(350, 190, 40, 70);
				
		
		//Grass:
		Color grass = new Color(0, 153, 0);
		g.setColor( grass);
		int[] xValues_grass = {0, 400, 400, 0  };
		int[] yValues_grass = {400, 400, 200, 200};
		g.fillPolygon( xValues_grass, yValues_grass, 4);
		
		
		//Fence
		Color fence = new Color (153, 76, 0);
		g.setColor( fence);
		int[] xValues_fence = {0, 400, 400, 0};
		int[] yValues_fence = {200, 200, 220, 220};
		g.fillPolygon( xValues_fence, yValues_fence, 4);
		
		
		//Fence Lines:
		g.setColor(Color.black);
		{
			int i;
			for (i = 0; i <= 400; i = i + 5)
			{
			g.drawLine(i, 200, i, 219);
			}
		}
		
		
		//Path:
		g.setColor( Color.white);
		int[] xValues_path = {80, 140, 220, 200};
		int[] yValues_path = {400, 400, 300, 300};
		g.fillPolygon( xValues_path, yValues_path, 4);
		
		
		//House front:
		Color housefront = new Color (255, 153, 255);
		g.setColor( housefront);
		//g.setColor(Color.pink);
		int[] xValues1 = { 120, 300, 300, 120 };
		int[] yValues1 = { 180, 180, 300, 300 };
		g.fillPolygon( xValues1, yValues1, 4);
		
		
		//House side:
		Color houseside = new Color (255, 122, 178);
		g.setColor( houseside);
		int[] xValues_houseside = { 300, 320, 320, 300, 300 };
		int[] yValues_houseside = { 180, 160, 280, 300, 180};
		g.fillPolygon( xValues_houseside, yValues_houseside, 4);
		
		
		//Window 1:
		Color window1 = new Color(204, 255, 255);
		g.setColor( window1);
		int[] xValues2 = { 140, 180, 180, 140};
		int[] yValues2 = { 200, 200, 220, 220 };
		g.fillPolygon( xValues2, yValues2, 4);
		Color windowborder = new Color (255, 51, 153);
		g.setColor( windowborder);
		g.drawPolygon( xValues2, yValues2, 4);
		g.drawLine(140, 210, 180, 210);
		g.drawLine(160, 200, 160, 220);
		
		
		//Window 2:
		g.setColor( window1);
		int[] xValues3 = { 240, 280, 280, 240};
		int[] yValues3 = { 200, 200, 220, 220 };
		g.fillPolygon( xValues3, yValues3, 4);
		g.setColor( windowborder);
		g.drawPolygon( xValues3, yValues3, 4);
		g.drawLine(240, 210, 280, 210);
		g.drawLine(260, 200, 260, 220);
		
		
		//Window 3:
		g.setColor( window1);
		int[] xValues4 = { 240, 280, 280, 240};
		int[] yValues4 = { 260, 260, 280, 280 };
		g.fillPolygon( xValues4, yValues4, 4);
		g.setColor( windowborder);
		g.drawPolygon( xValues4, yValues4, 4);
		g.drawLine(240, 270, 280, 270);
		g.drawLine(260, 260, 260, 280);
		
		
		//Window 4:
		g.setColor( window1);
		int[] xValues5 = { 140, 180, 180, 140};
		int[] yValues5 = { 260, 260, 280, 280 };
		g.fillPolygon( xValues5, yValues5, 4);
		g.setColor( windowborder);
		g.drawPolygon( xValues5, yValues5, 4);
		g.drawLine(140, 270, 180, 270);
		g.drawLine(160, 260, 160, 280);
		
		
		//Door:
		Color door = new Color (153, 76, 0);
		g.setColor(door);
		int[] xValues6 = { 200, 220, 220, 200 };
		int[] yValues6 = { 260, 260, 300, 300 };
		g.fillPolygon( xValues6, yValues6, 4);
		
		
		//Door Panel 1:
		Color panel1 = new Color (102, 51, 0);
		g.setColor(panel1);
		int[] xValuespanel1 = {202, 208, 208, 202};
		int[] yValuespanel1 = { 262, 262, 278, 278};
		g.fillPolygon(xValuespanel1, yValuespanel1, 4 );
		
		
		//Door Panel 2:
		g.setColor(panel1);
		int[] xValuespanel2 = {212, 218, 218, 212};
		int[] yValuespanel2 = { 262, 262, 278, 278};
		g.fillPolygon(xValuespanel2, yValuespanel2, 4 );
		
		
		//Door Panel 3:
		g.setColor(panel1);
		int[] xValuespanel3 = {202, 208, 208, 202};
		int[] yValuespanel3 = { 282, 282, 298, 298};
		g.fillPolygon(xValuespanel3, yValuespanel3, 4 );
		
		
		//Door Panel 4:
		g.setColor(panel1);
		int[] xValuespanel4 = {212, 218, 218, 212};
		int[] yValuespanel4 = { 282, 282, 298, 298};
		g.fillPolygon(xValuespanel4, yValuespanel4, 4 );
		
		
		//Door knob:
		Color knob = new Color(0, 0, 0);
		g.setColor(knob);
		g.fillOval(201, 278, 4, 3);
		
		
		//Roof Front:
		Color rooffront = new Color (153, 76, 0);
		g.setColor(rooffront);
		int[] xValues_rooffront = {120, 300, 260, 160  };
		int[] yValues_rooffront = {180, 180, 140, 140  };
		g.fillPolygon( xValues_rooffront, yValues_rooffront, 4);
		
		
		//Roof side:
		Color roofside = new Color(102, 51, 0);
		g.setColor(roofside );
		int[] xValues_roofside = {260, 280, 320, 300};
		int[] yValues_roofside = {140, 120, 160, 180};
		g.fillPolygon( xValues_roofside, yValues_roofside, 4);
		
		
		//Roof top:
		Color rooftop = new Color (102, 51, 0);
		g.setColor(rooftop);
		int[] xValues_rooftop = {180, 280, 260, 160};
		int[] yValues_rooftop = {120, 120, 140, 140};
		g.fillPolygon( xValues_rooftop, yValues_rooftop, 4);
		
		
		//Chimney Front:
		Color chimneyfront = new Color(64, 64, 64);
		g.setColor(chimneyfront);
		int[] xValues_chimneyfront = {200, 220, 220, 200};
		int[] yValues_chimneyfront = {120, 120, 140, 140};
		g.fillPolygon( xValues_chimneyfront, yValues_chimneyfront, 4);
		
		
		//Chimney Top:
		Color chimneytop = new Color (32, 32, 32);
		g.setColor(chimneytop);
		int[] xValues_chimneytop = {200, 210, 230, 220};
		int[] yValues_chimneytop = {120, 110, 110, 120};
		g.fillPolygon( xValues_chimneytop, yValues_chimneytop, 4);
		
		
		//Chimney Side:
		Color chimneyside = new Color (32, 32, 32);
		g.setColor(chimneyside);
		int[] xValues_chimneyside = {220, 230, 230, 220 };
		int[] yValues_chimneyside = {120, 110, 130, 140};
		g.fillPolygon( xValues_chimneyside, yValues_chimneyside, 4);
		
		
	}
}
