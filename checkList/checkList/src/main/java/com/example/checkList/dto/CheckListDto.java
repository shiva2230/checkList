package com.example.checkList.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckListDto {
    private Long listId;
    private Boolean checkListStatus;
    private LocalDateTime dateOfEntry;
    private Boolean timingOfAllPlanetsCheckedAndVerified;
    private Boolean pricesOfAllFishPlanetProductsCheckedAndVerified;
    private Boolean verifyValidityOfAllOffers;
    private Boolean statusOfDeliveryBoysCheckedAndVerified;
    private Boolean anyPreviousOrderNeededToBeCompleted;
    private Boolean timeGapBetweenOrderAcceptedAndOrderReady;
    private Boolean timeGapBetweenOrderReadyAndPickup;


}
