package com.example.checkList.mapper;

import com.example.checkList.dto.CheckListDto;
import com.example.checkList.entity.CheckList;

public class CheckListMapper {

    public static CheckListDto mapToCheckListDto(CheckList checkList) {
        return new CheckListDto(
                checkList.getListId(),
                checkList.getCheckListStatus(),
                checkList.getDateOfEntry(),
                checkList.getTimingOfAllPlanetsCheckedAndVerified(),
                checkList.getPricesOfAllFishPlanetProductsCheckedAndVerified(),
                checkList.getVerifyValidityOfAllOffers(),
                checkList.getStatusOfDeliveryBoysCheckedAndVerified(),
                checkList.getAnyPreviousOrderNeededToBeCompleted(),
                checkList.getTimeGapBetweenOrderAcceptedAndOrderReady(),
                checkList.getTimeGapBetweenOrderReadyAndPickup()
        );
    }

    public static CheckList mapToCheckList(CheckListDto checkListDto) {
        return new CheckList(
                checkListDto.getListId(),
                checkListDto.getCheckListStatus(),
                checkListDto.getDateOfEntry(),
                checkListDto.getTimingOfAllPlanetsCheckedAndVerified(),
                checkListDto.getPricesOfAllFishPlanetProductsCheckedAndVerified(),
                checkListDto.getVerifyValidityOfAllOffers(),
                checkListDto.getStatusOfDeliveryBoysCheckedAndVerified(),
                checkListDto.getAnyPreviousOrderNeededToBeCompleted(),
                checkListDto.getTimeGapBetweenOrderAcceptedAndOrderReady(),
                checkListDto.getTimeGapBetweenOrderReadyAndPickup()
        );
    }
}
