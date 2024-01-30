package demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class Application {

    @Test
    void shouldRun() {
        assertThat(1+1).isEqualTo(2);
    }
}
