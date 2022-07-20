package T2;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.step;

public class WebTestT2 {
    @Test
    @AllureId("11420")
    @DisplayName("Проверить смену региона")
    @Owner("allure8")
    void changeRegion() {
        step("Открыть главную страницу сайта https://karelia.tele2.ru/");
        step("Изменить регион в главном меню на тестовый регион");
        step("Проверить, что регион изменился", () -> {
            step("В верхнем меню отображается новый регион");
        });
    }

    @Test
    @AllureId("11419")
    @DisplayName("Проверка скидки на главной странице сайта")
    @Owner("allure8")
    void discountCheck() {
        step("Открыть главную страницу сайта https://karelia.tele2.ru/");
        step("Проверить скидку при покупке 1 сим-карты");
        step("Проверить скидку при покупке 2-х сим-карт");
        step("Проверить скидку при покупке 3-х сим-карт");
        step("Проверить скидку при покупке 4-х сим-карт");
        step("Проверить скидку при покупке 5 сим-карт");
    }

    @Test
    @AllureId("11421")
    @DisplayName("Проверить ссылку на страницу приложения в GooglePlay")
    @Owner("allure8")
    void toGooglePlay() {
        step("Открыть главную страницу сайта https://karelia.tele2.ru/");
        step("Перейти по ссылке GooglePlay");
        step("Проверить, что открылся Google Play на странице приложения");
    }
}
