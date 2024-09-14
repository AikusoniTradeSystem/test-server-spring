package io.github.aikusoni.ats.spring.testserver.constants;

import io.github.aikusoni.ats.spring.core.common.MessageCode;

import static io.github.aikusoni.ats.spring.core.common.MessageCode.of;

public interface TestMessageCode {
    MessageCode HAS_PERMISSION = of("test.has_permission");
}
