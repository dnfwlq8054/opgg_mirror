package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Bookmark"})
@RequestMapping(value = "/api/v1/bookmark")
public class BookmarkController {

    @PostMapping(value = "")
    @Operation(
            summary = " 즐겨찾기 생성 ",
            description = " 즐겨찾기 생성 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("즐겨찾기 완료");
    }

    @GetMapping(value = "list")
    @Operation(
            summary = " 로그인한 사람의 모든 즐겨찾기 목록 ",
            description = " 로그인한 사람의 모든 즐겨찾기 목록 [CHECK] :: api 하나로 갈지 아니면 챔피온 즐겨찾기 목럭, 유저 즐겨찾기 목록 따로 갈지 "
    )
    ResponseEntity<String> listBySession() {
        return ResponseEntity.ok(
                "로그인한 사람의 목록"
        );
    }

    @DeleteMapping(value = "{bookmarkId}")
    @Operation(
            summary = " 즐겨찾기 취소 ",
            description = " 즐겨찾기 취소 "
    )
    ResponseEntity<String> delete(@PathVariable int bookmarkId) {
        return ResponseEntity.ok(
                Integer.toString(bookmarkId)
        );
    }
}

