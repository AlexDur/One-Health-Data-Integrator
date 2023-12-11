package com.example.backend;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FehlerController implements FehlerControllerInterface, ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        // Hier kannst du deine eigene Fehlerseite anzeigen oder eine spezielle Verarbeitung vornehmen.
        return "fehlerseite"; // Hier musst du den Namen deiner Fehlerseite angeben.
    }

    @Override
    public String getErrorPath() {
        return "/error"; // Hier den richtigen Pfad für die Fehlerbehandlung eintragen
    }
}
