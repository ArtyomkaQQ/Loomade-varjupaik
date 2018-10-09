package ee.ut.loomadevp.uudiskirjad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@Table(name = "uudiskirjad")
public class Uudiskiri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 50)
    private String email;

    @NotNull
    @Size(max = 50)
    private String sonum;
}
