package nextsteps.dev.web.service;

import nextsteps.dev.web.jpa.entity.CalendarEvent;
import nextsteps.dev.web.jpa.entity.User;
import nextsteps.dev.web.jpa.repository.CalendarEventRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalendarEventService extends BaseService<CalendarEvent, Long>{

    private final CalendarEventRepository calendarEventRepository;

    public CalendarEventService(CalendarEventRepository calendarEventRepository) {
        super(calendarEventRepository);
        this.calendarEventRepository = calendarEventRepository;
    }

    public List<CalendarEvent> getAllUser(User user) {
        return new ArrayList<>(calendarEventRepository.findCalendarEventsByUser(user));
    }
}
