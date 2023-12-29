package DesignPattern.FacadePattern;

import java.util.List;

public interface IMenu {
    public List<String> GetVegMenu();
    public List<String> GetNonVegMenu();
    public List<String> GetAllMenu();
}
