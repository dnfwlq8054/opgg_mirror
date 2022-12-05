package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Duo"})
@RequestMapping(value = "/api/v1/duo")
public class DuoController {


    @PostMapping(value = "")
    @Operation(
            summary = " 듀오구함 게시글 생성 ",
            description = "듀오구함 게시글 생성"
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("생성");
    }

    @PutMapping(value = "{duoId}")
    @Operation(
            summary = " 듀오구함 수정 ",
            description = " 듀오구함 게시글 수정 "
    )
    ResponseEntity<String> put(@PathVariable int duoId) {
        return ResponseEntity.ok(
                Integer.toString(duoId)
        );
    }

    @GetMapping(value = "")
    @Operation(
            summary = " 듀오구함 페이징 ",
            description = " 듀오구함 게시글 목록 "
    )
    ResponseEntity<String> list() {
        return ResponseEntity.ok("목록");
    }

    @GetMapping(value = "modify/{duoId}")
    @Operation(
            summary = " 듀오구함 수정을 위한 상세 ",
            description = " 듀오구함 게시글 수정을 위한 상세 "
    )
    ResponseEntity<String> modifyDetail(@PathVariable int duoId) {
        return ResponseEntity.ok(
                Integer.toString(duoId)
        );
    }

    @GetMapping(value = "{duoId}")
    @Operation(
            summary = " 듀오구함 상세 ",
            description = " 듀오구함 게시글 상세 "
    )
    ResponseEntity<String> detail(@PathVariable int duoId) {
        return ResponseEntity.ok(
                Integer.toString(duoId)
        );
    }

    @DeleteMapping(value = "{duoId}")
    @Operation(
            summary = " 듀오구함 삭제 ",
            description = " 듀오구함 게시글 삭제 "
    )
    ResponseEntity<String> delete(@PathVariable int duoId) {
        return ResponseEntity.ok(
                Integer.toString(duoId)
        );
    }

    // TODO: 듀오구함 게시판 블랙리스트는 확인해봐야할것 같음. (게시글을 블랙리스트를 하는게 의미가 있는건가..?)
}

