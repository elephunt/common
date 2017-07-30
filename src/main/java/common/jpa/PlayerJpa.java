package common.jpa;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by roman on 30/07/17.
 */
@Entity
@Table(name = "player")
public class PlayerJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FirstName")
    private String name;

    @Column(name = "LastName")
    private String lastName;


    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<StatisticsJpa> summaries = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<StatisticsJpa> getSummaries() {
        return summaries;
    }

    public void setSummaries(Set<StatisticsJpa> summaries) {
        this.summaries = summaries;
    }

    @Override
    public String toString() {
        return "PlayerJpa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", summaries=" + summaries +
                '}';
    }
}
