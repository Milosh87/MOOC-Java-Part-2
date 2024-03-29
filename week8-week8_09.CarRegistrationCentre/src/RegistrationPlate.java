
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
      public int hashCode() {
        if (this.regCode == null || this.country == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
      public String getRegCode() {
          return regCode;
      }
      public String getCountry(){
          return country;
      }
 public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.regCode != compared.getRegCode() || this.country != compared.getCountry()) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }
          if (this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }

        return true;
    }
   
}

