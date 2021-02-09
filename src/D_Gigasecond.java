/**
 * Given a moment, determine the moment that would be after a gigasecond has passed.
 *
 * A gigasecond is 10^9 (1,000,000,000) seconds.
 *
 * Setup
 * Go through the setup instructions for Java to install the necessary dependencies:
 *
 * https://exercism.io/tracks/java/installation
 */


import java.time.LocalDate;
import java.time.LocalDateTime;

public class D_Gigasecond {

    public LocalDateTime validLocalDateTime;
    public static final int GIGASECOND = 1000000000;

    public D_Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public D_Gigasecond(LocalDateTime moment) {
        this.validLocalDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return validLocalDateTime.plusSeconds(GIGASECOND);
    }

}
