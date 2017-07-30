package common.jpa;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by roman on 30/07/17.
 */
@Entity
@Table(name = "statistics")
public class StatisticsJpa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    private PlayerJpa playerJpa;

    @Column(name = "amount")
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

    public PlayerJpa getPlayerJpa() {
        return playerJpa;
    }

    public void setPlayerJpa(PlayerJpa playerJpa) {
        this.playerJpa = playerJpa;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StatisticsJpa{" +
                "id=" + id +
                ", date=" + date +
                ", playerJpa=" + playerJpa +
                ", amount=" + amount +
                '}';
    }
}
