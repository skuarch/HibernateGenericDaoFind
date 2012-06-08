import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.LinkedHashSet;

public class Event implements Serializable {
    private Long id;
    private int duration;
    private String name;
    private Date startDate;

    public Event() {

    }

    public Event(String name) {
        this.name = name;
    }

    /**
     * @hibernate.id generator-class="native" column="uid"
     * @return
     */
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    /**
     * @hibernate.property column="name"
     * @return
     */
    public String getName() { return name; }
    public void setName(String name) { this.name = name;   }

    /**
     * @hibernate.property column="start_date"
     * @return
     */
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    /**
     * @hibernate.property column="duration"
     * @return
     */
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

}
