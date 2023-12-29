namespace SOLIDPrinciples.OpenClose
{
    public class Rectangle : IShape
    {
        private double height;
        private double width;

        public void setHeight(double height) 
        {
            this.height = height;
        }
        public void setWidth(double width) 
        {
            this.width = width;        
        }

        public double Area()
        {
            return height * width;
        }
    }
}
