/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

import Entity.User;
import lombok.*;

/**
 *
 * @author kimkyeonghyun
 */

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private String pw;
    
    public User toEntity(UserDto dto){
        return User.builder()
                .id(dto.id)
                .pw(dto.pw)
                .build();
    }
}
