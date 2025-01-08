package com.todo.taskmanager.controller.advertisementController.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ADVRequest {

    private Long carId;
    private Long userId;

}
