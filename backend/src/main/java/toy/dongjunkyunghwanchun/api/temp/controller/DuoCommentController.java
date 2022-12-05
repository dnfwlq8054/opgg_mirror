package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Duo-Comment"})
@RequestMapping(value = "/api/v1/duo-comment")
public class DuoCommentController {

    @PostMapping(value = "")
    @Operation(
            summary = " 듀오구함 댓글 생성 ",
            description = " 듀오구함 댓글 생성 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("생성완료");
    }

    @PutMapping(value = "{duoCommentId}")
    @Operation(
            summary = " 듀오구함 댓글 수정 ",
            description = " 듀오구함 댓글 수정 "
    )
    ResponseEntity<String> put(@PathVariable int duoCommentId) {
        return ResponseEntity.ok(
                Integer.toString(duoCommentId)
        );
    }

    @DeleteMapping(value = "{duoCommentId}")
    @Operation(
            summary = " 듀오구함 댓글 삭제 ",
            description = " 듀오구함 댓글 삭제 "
    )
    ResponseEntity<String> delete(@PathVariable int duoCommentId) {
        return ResponseEntity.ok(
                Integer.toString(duoCommentId)
        );
    }
}

