package main.java.com.example.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConversorUI {
    public static final Target NEGOCIOS = Target.the("menu negocios")
            .located(By.id("header-pymes"));
    public static final Target HERRAMIENTAS = Target.the("herramientas")
            .located(By.id(""));
    public static final Target GESTIONAR = Target.the("gestionar")
            .located(By.xpath(""));
}
