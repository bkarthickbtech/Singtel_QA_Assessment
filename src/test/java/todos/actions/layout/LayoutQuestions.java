package todos.actions.layout;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class LayoutQuestions extends UIInteractionSteps {
    public String footer() { return $(FooterSection.FOOTER).getTextContent(); }
}
