package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Board-Like"})
@RequestMapping(value = "/api/v1/board-like")
public class BoardLikeController {

    @PostMapping(value = "")
    @Operation(
            summary = " 추천 생성 ",
            description = " 추천 생성 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("추천 완료");
    }

    @DeleteMapping(value = "{boardLikeId}")
    @Operation(
            summary = " 추천 취소 ",
            description = " 추천 취소 "
    )
    ResponseEntity<String> delete(@PathVariable int boardLikeId) {
        return ResponseEntity.ok(
                Integer.toString(boardLikeId)
        );
    }
}

