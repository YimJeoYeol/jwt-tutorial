package me.silvernine.tutorial.dto;

import lombok.*;
import me.silvernine.tutorial.entity.Authority;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityDto {
    private String authorityName;
}