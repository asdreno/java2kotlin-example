package java2kotlin.domain.shared;

public class Country {

    private String countryCode;

    private String name;

    private VaccinationType requiredVaccinationType;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VaccinationType getRequiredVaccinationType() {
        return requiredVaccinationType;
    }

    public void setRequiredVaccinationType(VaccinationType requiredVaccinationType) {
        this.requiredVaccinationType = requiredVaccinationType;
    }
}
