package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Board"})
@RequestMapping(value = "/api/v1/board")
public class BoardController {

    @PostMapping(value = "")
    @Operation(
            summary = " 게시글 생성 ",
            description = " 게시글 생성 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("생성완료");
    }

    @GetMapping(value = "")
    @Operation(
            summary = " 게시글 목록 ",
            description = " 게시글 목록 "
    )
    ResponseEntity<String> paging() {
        return ResponseEntity.ok("목록");
    }

    @GetMapping(value = "{boardId}")
    @Operation(
            summary = " 게시글 상세 ",
            description = " 게시글 상세 "
    )
    ResponseEntity<String> detail(@PathVariable int boardId) {
        return ResponseEntity.ok(
                Integer.toString(boardId)
        );
    }

    @GetMapping(value = "modify/{boardId}")
    @Operation(
            summary = " 게시글 수정을 위한 상세 ",
            description = " 게시글 수정을 위한 상세 "
    )
    ResponseEntity<String> modifyDetail(@PathVariable int boardId) {
        return ResponseEntity.ok(
                Integer.toString(boardId)
        );
    }

    @PutMapping(value = "{boardId}")
    @Operation(
            summary = " 게시글 수정 ",
            description = " 게시글 수정 "
    )
    ResponseEntity<String> put(@PathVariable int boardId) {
        return ResponseEntity.ok(
                Integer.toString(boardId)
        );
    }

    @DeleteMapping(value = "{boardId}")
    @Operation(
            summary = " 게시글 삭제 ",
            description = " 게시글 삭제 "
    )
    ResponseEntity<String> delete(@PathVariable int boardId) {
        return ResponseEntity.ok(
                Integer.toString(boardId)
        );
    }
}

