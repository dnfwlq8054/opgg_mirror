package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Board-Comment"})
@RequestMapping(value = "/api/v1/board-comment")
public class BoardCommentController {

    @PostMapping(value = "")
    @Operation(
            summary = " 게시글 댓글 생성 ",
            description = " 게시글 댓글 생성 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("생성완료");
    }

    @PutMapping(value = "{boardCommentId}")
    @Operation(
            summary = " 게시글 댓글 수정 ",
            description = " 게시글 댓글 수정 "
    )
    ResponseEntity<String> put(@PathVariable int boardCommentId) {
        return ResponseEntity.ok(
                Integer.toString(boardCommentId)
        );
    }

    @DeleteMapping(value = "{boardCommentId}")
    @Operation(
            summary = " 게시글 댓글 삭제 ",
            description = " 게시글 댓글 삭제 "
    )
    ResponseEntity<String> delete(@PathVariable int boardCommentId) {
        return ResponseEntity.ok(
                Integer.toString(boardCommentId)
        );
    }
}

