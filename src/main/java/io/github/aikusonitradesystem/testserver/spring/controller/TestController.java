package io.github.aikusonitradesystem.testserver.spring.controller;

import io.github.aikusonitradesystem.core.constants.ErrorCode;
import io.github.aikusonitradesystem.core.exception.ATSException;
import io.github.aikusonitradesystem.mvcstandard.model.view.ATSResponseBody;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/test")
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/role/{role-name}")
    public ResponseEntity<ATSResponseBody<String>> roleTest(
            @RequestHeader("X-Roles") String roles,
            @PathParam("role-name") String roleName
    ) throws Exception {
        if (roles == null) {
            throw new ATSException(ErrorCode.FORBIDDEN, "TTC-000001", "권한이 설정되지 않은 계정으로 접근 했습니다.");
        }
        if (!roles.contains(roleName)) {
            throw new ATSException(ErrorCode.FORBIDDEN, "TTC-000002", "권한이 없는 계정으로 접근 했습니다.");
        }
        return ATSResponseBody
                .ok("권한 존재")
                .toResponseEntity();
    }

    // TODO core 모듈에 annotation을 사용해 aspect로 처리하는 기능 추가 필요
//    @HasRole()
//    @GetMapping("/role/{role-name}")
//    public ResponseEntity<ATSResponseBody<String>> roleTestAop(
//    ) throws Exception {
//
//        return ATSResponseBody
//                .ok("권한 존재")
//                .toResponseEntity();
//    }
}
