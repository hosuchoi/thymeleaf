package lake.pool.thymeleaf.runner;

import lake.pool.thymeleaf.controller.BoardController;
import lake.pool.thymeleaf.entity.Board;
import lake.pool.thymeleaf.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DataCreateRunner implements ApplicationRunner {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Board board1 = Board.builder()
                .content("제목1")
                .title("내용1")
                .build();

        Board board2 = Board.builder()
                .content("제목2")
                .title("내용2")
                .build();

        Board board3 = Board.builder()
                .content("제목3")
                .title("내용3")
                .build();

        Board board4 = Board.builder()
                .content("제목4")
                .title("내용4")
                .build();

        List<Board> boards = new ArrayList<>();
        boards.add(board1);
        boards.add(board2);
        boards.add(board3);
        boards.add(board4);

        boardRepository.saveAll(boards);
    }
}
