package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",   // тест по условию 1
            "2,100000,60000,150000",    // тест по условию 2
            "-1,-10000,3000,20000",     // тест при некорректном значении income
            "-1,10000,-3000,20000",     // тест при некорректном значении expenses
            "-1,10000,3000,-20000"      // тест при некорректном значении threshold
    })
    public void testWithCsvSource(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/params.csv")
    public void testWithCsvFileSource(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
