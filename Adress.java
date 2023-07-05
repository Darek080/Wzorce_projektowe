public class Adress {
    private final String city;
    private final String street;
    private final String postalCode;
    private final int number;

    private Adress(final String street, final String city,  final String postalCode, final int number) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.number = number;
    }
    public static Adress.Builder builder() {
        return new Adress.Builder();
    }
    public static final class Builder {
        private String street;
        private String city;
        private String postalCode;
        private int number;

        public Adress build() {
            return new Adress(street, city, postalCode, number);
        }
        public Builder street(String street){
            this.street = street;
            return this;
        }
        public Builder city(String city){
            this.city = city;
            return this;
        }
        public Builder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }
        public Builder number(int number){
            this.number = number;
            return this;
        }
    }
}