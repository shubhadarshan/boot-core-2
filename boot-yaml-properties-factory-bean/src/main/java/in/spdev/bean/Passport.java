package in.spdev.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Setter
@Getter
@ToString
@NoArgsConstructor
@ConfigurationProperties(prefix = "passport")
public class Passport {
    private String passportNo;
    private String passportHolderName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date issuedDate;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date expiryDate;
    private String issuedAuthority;
}
