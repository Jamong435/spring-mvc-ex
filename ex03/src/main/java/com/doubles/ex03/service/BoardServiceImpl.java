package com.doubles.ex03.service;

import com.doubles.ex03.domain.BoardVO;
import com.doubles.ex03.persistence.BoardDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Inject
    private BoardDAO boardDAO;

    // 입력
    @Override
    public void register(BoardVO boardVO) throws Exception {
        boardDAO.create(boardVO);
    }

    // 조회
    @Override
    public BoardVO read(Integer bno) throws Exception {
        return boardDAO.read(bno);
    }

    // 수정
    @Override
    public void modify(BoardVO boardVO) throws Exception {
        boardDAO.update(boardVO);
    }

    // 삭제
    @Override
    public void remove(Integer bno) throws Exception {
        boardDAO.delete(bno);
    }

    // 목록 : 기본
    @Override
    public List<BoardVO> list() throws Exception {
        return boardDAO.list();
    }

    // 목록 : 페이징

    // 목록 : 페이징 + 검색

}