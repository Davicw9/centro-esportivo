package br.com.davi.centroesportivo.web.dto;

import br.com.davi.centroesportivo.entity.User;
import br.com.davi.centroesportivo.enums.Role;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String email,
        Role role,
        Boolean active
) {
    public UserResponseDTO(User user){
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getActive()
        );
    }
}
