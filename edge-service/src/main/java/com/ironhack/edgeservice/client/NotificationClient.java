package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.DTO.NotificationDTO;
import com.ironhack.edgeservice.DTO.ResponseDTO;
import com.ironhack.edgeservice.model.Notification;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "notification-client")
public interface NotificationClient {

    @GetMapping("/notification/notificationsByUser/{userID}")
    List<Notification> findAllByUser(@PathVariable Long userID);

    @PostMapping("/notification")
    Notification addNotification(@RequestBody NotificationDTO notificationDTO);

    @DeleteMapping("/notification/{id}")
    ResponseDTO deleteNotification(@PathVariable Long id);
}