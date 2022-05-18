/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Dto.User.SignUpDto;
import Dto.User.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author kimkyeonghyun
 */
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {
    private String id;
    private String pw;
    private String pw2;
    
    public static SignUp toEntity(SignUpDto dto){
        return SignUp.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .pw2(dto.getPw2())
                .build();
    }
    
}
