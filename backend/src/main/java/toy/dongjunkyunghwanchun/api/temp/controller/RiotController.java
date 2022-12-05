package toy.dongjunkyunghwanchun.api.temp.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = {"Riot"})
@RequestMapping(value = "/api/v1/riot")
public class RiotController {


    @GetMapping(value = "{username}")
    @Operation(summary = " 유저명으로 정보 조회 ", description = "소환사명으로 정보 조회")
    ResponseEntity<String> userInfo(@PathVariable String username) {
        return ResponseEntity.ok(username);
    }
}

