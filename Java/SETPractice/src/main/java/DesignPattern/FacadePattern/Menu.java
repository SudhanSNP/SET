package DesignPattern.FacadePattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Menu implements IMenu{
    @Override
    public List<String> GetVegMenu() {
        return Stream.of(VegMenu.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> GetNonVegMenu() {
        return Stream.of(NonVegMenu.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> GetAllMenu() {
        List<String> menu = GetVegMenu();
        menu.addAll(GetNonVegMenu());
        return menu;
    }
}
