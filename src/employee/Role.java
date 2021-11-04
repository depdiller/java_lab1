package employee;

public enum Role {
    STAFF(120d, 0.1d),
    MANAGER(150d, 0.2d),
    EXECUTIVE(200d, 0.3d);

    private final double premium;
    private final double salary;
    Role(double salary, double premium) { this.premium = premium; this.salary = salary; }

    public double getSalary() {
        return this.salary;
    }

    public double getPremium() {
        return this.premium;
    }
}
