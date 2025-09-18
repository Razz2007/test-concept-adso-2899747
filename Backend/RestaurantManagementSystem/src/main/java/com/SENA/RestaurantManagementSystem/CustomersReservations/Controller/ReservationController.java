package com.SENA.RestaurantManagementSystem.CustomersReservations.Controller;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Reservation;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.IReservationService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.ReservationReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.ReservationResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/reservation")
public class ReservationController extends ABaseControllerCustomersReservations<Reservation, ReservationReqDto, ReservationResDto, IReservationService> {

    public ReservationController(IReservationService service) {
        super(service, "Reservation");
    }

}