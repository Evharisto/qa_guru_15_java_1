package guru.qa;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import guru.qa.data.Team;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TeamRosterTest {

    static Stream<Arguments> teamAndPlayerSelect() {
        return Stream.of(
                Arguments.of(Team.Спартак, List.of("Игрок", "Александр Алексеев", "Александр Максименко", "Александр Селихов", "Антон Шитов", "Даниил Марков", "Михаил Волков")),
                Arguments.of(Team.Краснодар, List.of("Игрок", "Матвей Сафонов", "Михаил Штепа", "Станислав Агкацев", "Виталий Стежко", "Вячеслав Литвинов", "Григорий Жилкин"))
        );
    }

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Disabled("Попытка применения CsvSource")
    @DisplayName("Тест турнирной таблицы c CSV")
    @ParameterizedTest(name = "Проверка отображения в таблице команды {0}")
    @CsvSource(value = {"Спартак", "Краснодар"})
    void checkTeamTestWithCsv(String teamcsv) {
        open("https://www.sports.ru/rfpl/table/");
        $$(".name").findBy(text(teamcsv)).shouldBe(visible);
    }


    @DisplayName("Тест турнирной таблицы")
    @EnumSource(Team.class)
    @ParameterizedTest(name = "Проверка отображения в таблице команды {0}")
    void checkTeamTest(Team team) {
        open("https://www.sports.ru/rfpl/table/");
        $$(".name").findBy(text(team.name())).shouldBe(visible);
    }

    @DisplayName("Тест таблицы состава")
    @MethodSource("teamAndPlayerSelect")
    @ParameterizedTest(name = "Проверка списка игроков для команды {0}")
    void teamAndPlayerSelect (Team team, List<String> playersName) {
        open("https://www.sports.ru/rfpl/table/");
        $$(".name").findBy(text(team.name())).click();
        $$(".tm-item").findBy(text("Состав")).click();
        $$("td.name-td").first(7).shouldHave(CollectionCondition.texts(playersName));

    }

}
