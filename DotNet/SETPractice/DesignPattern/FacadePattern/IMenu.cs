namespace DesignPattern.FacadePattern
{
    public interface IMenu
    {
        public List<string> GetVegMenu();
        public List<string> GetNonVegMenu();
        public List<string> GetAllMenu();
    }
}
