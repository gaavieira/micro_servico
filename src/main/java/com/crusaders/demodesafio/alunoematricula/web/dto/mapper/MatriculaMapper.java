package com.crusaders.demodesafio.alunoematricula.web.dto.mapper;

import com.crusaders.demodesafio.alunoematricula.entities.Matricula;
import com.crusaders.demodesafio.alunoematricula.web.dto.MatriculaAlunoDto;
import com.crusaders.demodesafio.alunoematricula.web.dto.MatriculaResponseDto;
import org.modelmapper.ModelMapper;

public class MatriculaMapper {

    public static Matricula toMatricula(MatriculaResponseDto createDto) {
        return new ModelMapper().map(createDto, Matricula.class);
    }

    public static MatriculaResponseDto toDto(Matricula matricula) {
        return new ModelMapper().map(matricula, MatriculaResponseDto.class);
    }

    public static MatriculaAlunoDto toDtoId(Matricula matricula) {
        return new ModelMapper().map(matricula, MatriculaAlunoDto.class);
    }
}