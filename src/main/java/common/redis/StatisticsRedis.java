package common.redis;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by roman on 30/07/17.
 */
public class StatisticsRedis implements Serializable{

    private Long id;

    private Date date;

    private Long amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StatisticsRedis{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
