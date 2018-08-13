package org.raidar.app.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://translate.google.com/?hl=ru")
public class GoogleTranslatePage extends PageObject {

	@FindBy(id="source")
	private WebElementFacade sourceArea;

	@FindBy(name="gt-submit")
	private WebElementFacade translateButton;

	public void enter_keywords(String keyword) {
		sourceArea.type(keyword);
	}

	public void lookup_terms() {
		translateButton.click();
	}

	public List<String> getDefinitions() {
		return null;

		//WebElementFacade definitionList = find(By.tagName("ol"));
		//return definitionList.findElements(By.tagName("li")).stream()
		//        .map( element -> element.getText() )
		//        .collect(Collectors.toList());
	}
}