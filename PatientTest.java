package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest {

    @Test
    void setFirstName() {
        Patient dv = new Patient();
        String input =  "";
        boolean actualResult = dv.setFirstName();
        Assertions.assertFalse(actualResult);
    }

    @Test
    void setLastName() {
        Patient
    }

    @Test
    void setPhoneNumber() {
        Patient dv = new Patient();
        String input = "hejehe" ;
        boolean actualResult =dv.setPhoneNumber();
        Assertions.assertFalse(actualResult);
    }

    @Test
    void setEmail() {
    }

    @Test
    void setCpr() {
        Patient dv = new Patient();
        String input = "802398" ;
        boolean actualResult =dv.setPhoneNumber();
        Assertions.assertFalse(actualResult);
    }

    @Test
    void setCoronaData() {
    }

    @Test
    void setCoronaLocation() {
    }

    @Test
    void setSenorData() {
    }

    @Test
    void getAge() {
    }

    @Test
    void getGender() {
    }
