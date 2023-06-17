package com.virgingames.testsuite;

import com.virgingames.bingoinfo.BingoSteps;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.hasItems;

@RunWith(SerenityRunner.class)
public class BingoTest extends TestBase {
    @Steps
    BingoSteps bingoSteps;

    @Title("Getting all Bingo and verifying currency is Sterling")
    @Test
    public void test01() {
        bingoSteps.getAllBingoSterling().body("data.pots.currency", hasItems("GBP"))
                .statusCode(200).log().all();
    }

    @Title("Getting all Bingo and verifying currency is Euro")
    @Test
    public void test02() {
        bingoSteps.getAllBingoEuro().body("data.pots.currency", hasItems("EUR"))
                .statusCode(200).log().all();
    }
}
