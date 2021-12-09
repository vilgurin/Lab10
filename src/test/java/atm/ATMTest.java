package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    void process() {
        ATM atm = new ATM();
        atm.process(125);
    }
}