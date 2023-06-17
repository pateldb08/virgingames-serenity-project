package com.virgingames.bingoinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BingoSteps {

    @Step("Getting all BingoSterling")
    public ValidatableResponse getAllBingoSterling(){
        return SerenityRest.given().log().all()
                .queryParam("currency", "GBP")
                .when()
                .get(EndPoints.GET_ALL_BINGO)
                .then();
    }
    @Step("Getting all BingoEuro")
    public ValidatableResponse getAllBingoEuro(){
        return SerenityRest.given().log().all()
                .queryParam("currency", "EUR")
                .when()
                .get(EndPoints.GET_ALL_BINGO)
                .then();
    }
}
