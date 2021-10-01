package ru.danvu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FindOwnerTest {

	@Test
	void findOwnerTest() {
		Selenide.open("http://localhost:8080/owners/find");
		$("#lastname").val("Franklin");
		$("button[type='submit']").click();
		$("table.table").should(Condition.visible);
		$$("tr").find(text("Name")).should(text("George Franklin"));
	}
}
