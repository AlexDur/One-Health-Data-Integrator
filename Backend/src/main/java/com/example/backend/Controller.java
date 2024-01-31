package com.example.backend;
import com.example.backend.FehlerControllerInterface;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller implements FehlerControllerInterface, ErrorController {
    @GetMapping("/kulturen")
    public List<Kultur> alleKulturen() {
        // Hier kannst du Logik einfügen, um alle Kulturen aus der Datenbank abzurufen
        // und sie als JSON-Antwort zurückzugeben.
        return null;
    }

    @GetMapping("/kulturen/{id}")
    public Kultur kulturMitId(@PathVariable Long id) {
        // Hier kannst du Logik einfügen, um eine bestimmte Kultur aus der Datenbank abzurufen
        // und sie als JSON-Antwort zurückzugeben.
        return null;
    }

    @GetMapping("/error")
    public String handleError() {
        // Hier kannst du die Logik für die Fehlerbehandlung implementieren
        return "error"; // Hier musst du den richtigen View-Namen eintragen
    }

    @Override
    public String getErrorPath() {
        return "/error"; // Hier den richtigen Pfad für Fehlerbehandlung eintragen
    }

    // Weitere Endpunkte und Controller-Methoden hinzufügen, je nach Bedarf.
}
