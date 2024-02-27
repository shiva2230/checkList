package com.example.checkList.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "check_List")
public class CheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long listId;

    @Column(name = "checkList_status")
    private Boolean checkListStatus;

    @Column(name = "date_of_entry")
    private LocalDateTime dateOfEntry;

    @Column(name = "timing_of_all_planets_is_checked_and_verified")
    private Boolean timingOfAllPlanetsCheckedAndVerified;

    @Column(name = "prices_of_all_fishplanet_products_are_checked_and_verified")
    private Boolean pricesOfAllFishPlanetProductsCheckedAndVerified;

    @Column(name = "verify_the_validity_of_all_offers")
    private Boolean verifyValidityOfAllOffers;

    @Column(name = "status_of_delivery_boys_is_checked_and_verified")
    private Boolean statusOfDeliveryBoysCheckedAndVerified;

    @Column(name = "any_previous_order_is_needed_to_be_completed")
    private Boolean anyPreviousOrderNeededToBeCompleted;

    @Column(name = "timegap_between_order_accepted_and_order_ready")
    private Boolean timeGapBetweenOrderAcceptedAndOrderReady;

    @Column(name = "timegap_between_order_ready_and_pickup")
    private Boolean timeGapBetweenOrderReadyAndPickup;



}
