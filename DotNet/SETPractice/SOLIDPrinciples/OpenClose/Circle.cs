namespace SOLIDPrinciples.OpenClose
{
    public class Circle : IShape
    {
        protected double radius;

        public void setRadius(double radius)
        {
            this.radius = radius;
        }
        public double Area()
        {
            return 3.14 * radius * radius;
        }
    }
}
