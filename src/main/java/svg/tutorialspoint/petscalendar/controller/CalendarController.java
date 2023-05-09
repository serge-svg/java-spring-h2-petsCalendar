package svg.tutorialspoint.petscalendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import svg.tutorialspoint.petscalendar.service.CalendarService;

@RestController
@RequestMapping(path="/pets-calendar")
public class CalendarController {

    CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }
}
