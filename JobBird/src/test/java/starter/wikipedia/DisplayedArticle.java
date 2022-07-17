package starter.wikipedia;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

public class DisplayedArticle extends PageComponent {

    @FindBy(id="firstHeading")
    private WebElementFacade firstHeading;

    public String getFirstHeading() {
        return firstHeading.getText();
    }
}