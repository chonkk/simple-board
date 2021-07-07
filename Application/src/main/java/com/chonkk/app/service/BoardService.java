package com.chonkk.Application.service;

import com.chonkk.Application.domain.Board;
import com.chonkk.Application.domain.BoardRepository;
import com.chonkk.Application.web.BoardRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public Long save(BoardRequest boardRequest){
        Board board = new Board();
        BeanUtils.copyProperties(boardRequest,board);
        board = boardRepository.save(board);
        return board.getId();
    }

    public List<Board> findAllByOrderByIdDesc(){
        return boardRepository.findAllByOrderByIdDesc();
    }

    public Board findBoardById(Long id){
        return boardRepository.findBoardById(id);
    }

    public void delete(Long id){
        boardRepository.deleteById(id);
    }

}
