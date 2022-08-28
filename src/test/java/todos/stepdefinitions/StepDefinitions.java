package todos.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import todos.actions.addtodo.AddNewTodoActions;
import todos.actions.completetodos.CompleteTodoActions;
import todos.actions.filter.FilterItemsActions;
import todos.actions.layout.LayoutQuestions;
import todos.actions.navigate.NavigateActions;
import todos.actions.todolist.TodoListActions;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    @Steps
    AddNewTodoActions addTodo;

    @Steps
    TodoListActions todoItems;

    @Steps
    NavigateActions navigate;

    @Steps
    LayoutQuestions pageLayout;

    @Given("user opens the Todo Application")
    public void opens_the_Todo_Application() {
        navigate.toTheTodoMVCApplication();
    }

    @Then("user should see the credits in the footer")
    public void he_should_see_in_the_footer() {
        assertThat(pageLayout.footer()).contains("TodoMVC");
    }

    @Given("(.*) has not entered any todo items")
    public void has_not_entered_any_todo_items() {
        navigate.toTheTodoMVCApplication();
    }

    @When("user adds {string}")
    public void she_adds(String todoItem) {
        addTodo.itemCalled(todoItem);
    }

    @Then("user todo list should contain:")
    public void the_todo_list_should_contain(List<String> expectedItems) {
        assertThat(todoItems.currentItems()).containsAll(expectedItems);
    }

    @And("the remaining item count should show {string}")
    public void theRemainingItemCountShouldShow(String remainingItemCountText) {
        assertThat(todoItems.numberOfItemsLeftMessage()).isEqualTo(remainingItemCountText);
    }

    @Given("user has a todo list containing")
    public void has_a_list_containing(List<String> expectedItems) {
        navigate.toTheTodoMVCApplication();
        addTodo.itemsCalled(expectedItems);
    }

    @Then("the application should suggest how to add them")
    public void the_application_should_suggest_how_to_add_them() {
        assertThat(addTodo.prompt()).isEqualTo("What needs to be done?");
    }

    @Steps
    FilterItemsActions filterItems;

    @When("user filters the list to show {word} tasks")
    public void filtersBy(String filter) {
        filterItems.by(filter);
    }

    @Steps
    CompleteTodoActions completeTodo;

    @When("user completes {string}")
    public void sheCompletes(String completedTodo) {
        completeTodo.itemCalled(completedTodo);
    }

    @Then("the todo item called {string} should be marked as completed")
    public void theTodoItemCalledShouldBeMarkedAsCompleted(String todoItem) {
        assertThat(completeTodo.isCompleted(todoItem)).isTrue();
    }

    @Then("the page title should include {string}")
    public void thePageTitleShouldInclude(String expectedTitle) {
        assertThat(pageLayout.getTitle()).contains(expectedTitle);
    }

}
