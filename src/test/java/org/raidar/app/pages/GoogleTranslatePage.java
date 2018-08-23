package org.raidar.app.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://translate.google.ru/#en/ru/")
public class GoogleTranslatePage extends PageObject {

	@FindBy(id="source")
	private WebElementFacade sourceArea;

	//@FindBy(id="gt-src-is")
	//private WebElementFacade sourceList;

	//@FindBy(id="contribute-target")
	//private WebElementFacade destinArea;

	//@FindBy(name="gt-submit")
	//private WebElementFacade translateButton;

	public void enter_text(String word) {
		//sourceArea.type(word);
		sourceArea.typeAndEnter(word);
		//sourceList.clear();
		//destinArea.setWindowFocus();
	}

	public void translate_text() {
		//translateButton.click();
	}

	public List<String> getDefinitions() {
		WebElementFacade definitionList = find(By.className("gt-def-list"));
		return definitionList.findElements(By.className("gt-def-row")).stream()
		        .map( element -> element.getText() )
		        .collect(Collectors.toList());
	}
}