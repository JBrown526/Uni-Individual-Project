package nextsteps.dev.web.jpa.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "calendar_event")
public class CalendarEvent {

    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private Long eventId;
    @ManyToOne
    @JoinColumn(name = "user_email", referencedColumnName = "user_email")
    private User user;
    private Date date;
    private String type;
    private String details;

    protected CalendarEvent() {}

    public CalendarEvent(User user, Date date, String type) {
        this.user = user;
        this.date = date;
        this.type = type;
    }

    public CalendarEvent(User user, Date date, String type, String details) {
        this.user = user;
        this.date = date;
        this.type = type;
        this.details = details;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "CalendarEvent{" +
                "eventId=" + eventId +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
