package nextsteps.dev.web.jpa.repository;

import nextsteps.dev.web.jpa.entity.CalendarEvent;
import nextsteps.dev.web.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CalendarEventRepository extends CrudRepository<CalendarEvent, Long> {

    List<CalendarEvent> findCalendarEventsByUser(User user);

    List<CalendarEvent> findCalendarEventsByUserAndDate(User user, Date date);

    List<CalendarEvent> findCalendarEventsByUserAndDateBetween(User user, Date startDate, Date endDate);

    List<CalendarEvent> findCalendarEventsByUserAndType(User user, String type);
}
