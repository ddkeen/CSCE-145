
public class Rectangle extends ShapeBasic{

		private int width;
		private int height;
		
		public Rectangle()
		{
			super();
			this.width = 0;
			this.height = 0;
		}
		
		public Rectangle(int xOffset, int xWidth, int xHeight)
		{
			super(xOffset);
			this.set(xWidth, xHeight);
		}
		
		public int getWidth()
		{
			return this.width;
		}
		
		public int getHeight()
		{
			return this.height;
		}
		
		public void set(int xWidth, int xHeight)
		{
			if(xWidth>0 && xHeight>0)
			{
				this.width = xWidth;
				this.height = xHeight;
			}
		}
		
		public void drawHere()
		{
			drawHorizontalLine();
			drawSides();
			drawHorizontalLine();
		}
		
		private void drawHorizontalLine()
		{
			this.skipSpaces(this.getOffset());
			
			for(int i = 0; i< this.width; i++)
			{
				System.out.println("*");
			}
			System.out.println();
			
		}
		
		private void drawSides()
		{
			this.skipSpaces(this.getOffset());
			System.out.print("*");
			this.skipSpaces(this.width -2);
			System.out.println();
		}
		
		private void skipSpaces(int spaces)
		{
			for (int i = 0; i<spaces; i++)
			{
				System.out.print(" ");
			}
		}
		
		
}
