package gfs.webp.ytlerdi.entitet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nalog {
    private Long id;
    private String email;
    private String ime;
    private String prezime;
    private Nalog backup;
    private String password;
    private String napomena;
}
