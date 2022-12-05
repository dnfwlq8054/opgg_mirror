package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Report"})
@RequestMapping(value = "/api/v1/report")
public class ReportController {

    @PostMapping(value = "")
    @Operation(
            summary = " 신고하기 ",
            description = " 신고하기 "
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("신고완료");
    }

    @PatchMapping(value = "{reportId}")
    @Operation(
            summary = " 신고하기 수정 ",
            description = " 신고하기 수정 --> [CHECK] 신고내용을 수정할 수 있도록 할지 고민 필요, patch로 할지 put으로 할지도 체크 "
    )
    ResponseEntity<String> patch(@PathVariable int reportId) {
        return ResponseEntity.ok(
                Integer.toString(reportId)
        );
    }

    @GetMapping(value = "{reportId}")
    @Operation(
            summary = " 신고하기 상세 ",
            description = " 신고하기 내용보기 "
    )
    ResponseEntity<String> detail(@PathVariable int reportId) {
        return ResponseEntity.ok(
                Integer.toString(reportId)
        );
    }

    @GetMapping(value = "{targetId}/list")
    @Operation(
            summary = " 타겟에 대한 모든 신고 목록 ",
            description = " 타겟에 대한 모든 신고 목록 "
    )
    ResponseEntity<String> listByTarget(@PathVariable int targetId) {
        return ResponseEntity.ok(
                Integer.toString(targetId)
        );
    }

    @GetMapping(value = "list")
    @Operation(
            summary = " 로그인한 사람의 모든 신고 목록 ",
            description = " 로그인한 사람의 모든 신고 목록 "
    )
    ResponseEntity<String> listBySession() {
        return ResponseEntity.ok(
                "로그인한 사람의 목록"
        );
    }

    @DeleteMapping(value = "{reportId}")
    @Operation(
            summary = " 신고하기 취소 ",
            description = " 신고하기 취소 "
    )
    ResponseEntity<String> delete(@PathVariable int reportId) {
        return ResponseEntity.ok(
                Integer.toString(reportId)
        );
    }
}

