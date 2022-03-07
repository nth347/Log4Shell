package com.nth347.log4shell;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4ShellController {
    @RequestMapping("/log4shell")
    public String log4ShellController(@RequestParam String param) {
        Logger logger = LogManager.getLogger(Log4ShellController.class);

        // logger.log(Level.ALL, "param=" + param); // Default level >= ALL level (400 >= 2147483647) = false

        // logger.trace("TRACE - param=" + param); // Default level >= TRACE level (400 >= 600) = false

        // logger.debug("DEBUG - param=" + param); // Default level >= DEBUG level (400 >= 500) = false

        // logger.info("INFO - param=" + param); // Default level >= INFO level (400 >= 400) = true

        logger.warn("WARN - param=" + param); // Default level >= WARN level (400 >= 300) = true

        // logger.error("ERROR - param-" + param); // Default level >= ERROR level (400 >= 200) = true

        // logger.fatal("FATAL - param=" + param); // Default level >= FATAL level (400 >= 100) = true

        // logger.log(Level.OFF, "param=" + param); // Default level >= OFF level (400 >= 0) = true

        //logger.log(Level.INFO, "param=" + param);

        return "Received param=" + param;
    }
}
