package AdditionalClasses;


public enum UrgencyLevel {
    LOW,
    MEDIUM,
    HIGH;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

