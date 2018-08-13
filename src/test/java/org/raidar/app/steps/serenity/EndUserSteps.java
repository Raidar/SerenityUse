package org.raidar.app.steps.serenity;

import org.raidar.app.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    GoogleTranslatePage googleTranslatePage;

    @Step
    public void enters(String keyword) {
        googleTranslatePage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        googleTranslatePage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        // TODO: Realize.
        //assertThat(googleTranslatePage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_required_page() {
        googleTranslatePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}