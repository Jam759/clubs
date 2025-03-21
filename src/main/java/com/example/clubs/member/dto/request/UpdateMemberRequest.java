package com.example.clubs.member.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UpdateMemberRequest {


    @NotBlank(message = "닉네임은 필수 입력 값입니다.")
    private String memberUserName;

    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String memberEmail;

}
