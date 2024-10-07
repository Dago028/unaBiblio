package com.biblioteca.unaBiblio.dto;

import com.biblioteca.unaBiblio.models.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private int idUsuario;
    private String token;

    public UsuarioDTO(Usuario usuario) {
        this.idUsuario =  usuario.getUsuario();
        this.token = usuario.getToken();
    }
}
