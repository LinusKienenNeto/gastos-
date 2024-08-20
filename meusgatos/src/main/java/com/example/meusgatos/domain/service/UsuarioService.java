package com.example.meusgatos.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.meusgatos.domain.model.Usuario;
import com.example.meusgatos.domain.repository.UsuarioRepository;
import com.example.meusgatos.dto.usuario.UsuarioRequestDto;
import com.example.meusgatos.dto.usuario.UsuarioResponseDto;

public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<UsuarioResponseDto> obterTodos() {
        
        List<Usuario> usuarios = usuarioRepository.findAll();

        List<usuarioRepository> usuariosDto = new ArrayList<>();
    }

    @Override
    public UsuarioResponseDto obterPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterPorId'");
    }

    @Override
    public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    @Override
    public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }
    
}
