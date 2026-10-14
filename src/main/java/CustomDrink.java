public class CustomDrink {

    // Privátní atributy pro základní nápoj a ingredience
    private final String base;
    private final boolean milk;
    private final boolean sugar;
    private final boolean caramel;

    // Privátní konstruktor přebírající hodnoty z Builderu
    private CustomDrink(Builder b) {
        this.base = b.base;
        this.milk = b.milk;
        this.sugar = b.sugar;
        this.caramel = b.caramel;
    }

    // Gettery (vhodné pro unit testy)
    public String getBase() {
        return base;
    }

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSugar() {
        return sugar;
    }

    public boolean hasCaramel() {
        return caramel;
    }

    @Override
    public String toString() {
        return DrinkFactory.createDrink(base).serve()
                + (milk ? ", milk" : "")
                + (sugar ? ", sugar" : "")
                + (caramel ? ", caramel" : "");
    }

    // Vnořená statická třída Builder
    public static class Builder {

        private final String base;
        private boolean milk = false;
        private boolean sugar = false;
        private boolean caramel = false;

        // Konstruktor požadující základní nápoj
        public Builder(String base) {
            this.base = base;
        }

        // Metody pro nastavení ingrediencí (vrací 'this' pro řetězení metod)
        public Builder milk() {
            this.milk = true;
            return this;
        }

        public Builder sugar() {
            this.sugar = true;
            return this;
        }

        public Builder caramel() {
            this.caramel = true;
            return this;
        }

        // Metoda vytvoří výsledný objekt CustomDrink
        public CustomDrink build() {
            return new CustomDrink(this);
        }
    }
}