package java2kotlin.application.dogs;

import java2kotlin.domain.shared.VaccinationType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UnsupportedVaccinationTypeException extends RuntimeException {
    public UnsupportedVaccinationTypeException(VaccinationType vaccinationType) {
        super("Vaccination type " + vaccinationType.name() +
                " is not allowed yet");
    }
}
