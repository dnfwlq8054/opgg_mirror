package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"User"})
@RequestMapping(value = "/api/v1/user")
public class UserController {


    @PostMapping(value = "")
    @Operation(
            summary = "유저 생성",
            description = "유저 생성"
    )
    ResponseEntity<String> post() {
        return ResponseEntity.ok("생성완료");
    }

    @GetMapping(value = "{nickname}")
    @Operation(
            summary = " 회원 정보 ",
            description = " 닉네임으로 회원 정보 조회 "
    )
    ResponseEntity<String> info(@PathVariable String nickname) {
        return ResponseEntity.ok(nickname);
    }

    @GetMapping(value = "{userId}")
    @Operation(
            summary = " 회원 정보 ",
            description = " 회원 일련번호로 회원 정보 조회 "
    )
    ResponseEntity<String> info(@PathVariable int userId) {
        return ResponseEntity.ok(Integer.toString(userId));
    }

    @GetMapping(value = "info")
    @Operation(
            summary = " 회원 정보 ",
            description = " 내 정보 조회 "
    )
    ResponseEntity<String> me() {
        return ResponseEntity.ok("내 정보 조회");
    }

    @PutMapping(value = "")
    @Operation(
            summary = " 내 정보 수정 ",
            description = " 내 정보 수정 "
    )
    ResponseEntity<String> put() {
        return ResponseEntity.ok("내 정보 수정");
    }

    @DeleteMapping(value = "{userId}")
    @Operation(
            summary = " 회원 삭제 ",
            description = " 회원 삭제 "
    )
    ResponseEntity<String> delete(@PathVariable("userId") String userId) {
        return ResponseEntity.ok(userId);
    }
}

