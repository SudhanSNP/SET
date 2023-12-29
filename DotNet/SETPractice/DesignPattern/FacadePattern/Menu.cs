namespace DesignPattern.FacadePattern
{
    public class Menu : IMenu
    {
        public List<string> GetNonVegMenu()
        {
            return Enum.GetValues(typeof(VegMenu))
                .Cast<VegMenu>()
                .Select(v => v.ToString())
                .ToList();
        }

        public List<string> GetVegMenu()
        {
            return Enum.GetValues(typeof(NonVegMenu))
                .Cast<NonVegMenu>()
                .Select(v => v.ToString())
                .ToList();
        }

        public List<string> GetAllMenu()
        {
            List<string> menu = GetVegMenu();
            List<string> nonVegMenu = GetNonVegMenu();
            menu.AddRange(nonVegMenu);
            return menu.ToList();
        }
    }
}
