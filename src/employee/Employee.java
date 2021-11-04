package employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String phone;
    private String address;
    private String city;
    private String code;

    public enum Gender {
        MALE,
        FEMALE
    }

    private Employee() {}
    public Role getRole() { return this.role; }
    public String getName() { return this.givenName; }
    public String getSurname() { return this.surName; }
    public Gender getGender() { return this.gender; }
    public String getDept() { return  this.dept; }
    public int getAge() { return this.age; }

    @Override
    public String toString() {
        return "Employee{" +
                "givenName='" + givenName + '\'' +
                ", surName='" + surName + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                ", dept='" + dept + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", code='" + code +
                '}';
    }

    public static class Builder {
        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private Role role;
        private String dept;
        private String phone;
        private String address;
        private String city;
        private String code;

        public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
        }
        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }
        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }
        public Builder setDept(String dept) {
            this.dept = dept;
            return this;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.givenName = this.givenName;
            employee.surName = this.surName;
            employee.age = this.age;
            employee.gender = this.gender;
            employee.role = this.role;
            employee.dept = this.dept;
            employee.phone = this.phone;
            employee.address = this.address;
            employee.city = this.city;
            employee.code = this.code;
            return employee;
        }
    }

    public static List<Employee> createShortList() {

        List<Employee> list = new ArrayList<>();

        list.add(new Builder()
                .setGivenName("Igor")
                .setSurName("Ardacov")
                .setAge(31)
                .setGender(Gender.MALE)
                .setRole(Role.MANAGER   )
                .setDept("General Management")
                .setPhone("39183911")
                .setAddress("Rbs Street 32")
                .setCity("Moscow")
                .setCode("31")
                .build());
        list.add(new Builder()
                .setGivenName("Ivan")
                .setSurName("Donchenko")
                .setAge(21)
                .setGender(Gender.MALE)
                .setRole(Role.MANAGER)
                .setDept("General Management")
                .setPhone("7334521")
                .setAddress("Gko Street 12")
                .setCity("Moscow")
                .setCode("31")
                .build());
        list.add(new Builder()
                .setGivenName("Julia")
                .setSurName("Kulagina")
                .setAge(31)
                .setGender(Gender.FEMALE)
                .setRole(Role.EXECUTIVE)
                .setDept("Product")
                .setPhone("4231531")
                .setAddress("Tdf Avenue")
                .setCity("Novosibirsk")
                .setCode("76")
                .build());
        list.add(new Builder()
                .setGivenName("Ugarov")
                .setSurName("Victor")
                .setAge(20)
                .setGender(Gender.MALE)
                .setRole(Role.STAFF)
                .setDept("Product")
                .setPhone("542395")
                .setAddress("JGF Street")
                .setCity("Novosibirsk")
                .setCode("76")
                .build());
        list.add(new Builder()
                .setGivenName("Polina")
                .setSurName("Karseva")
                .setAge(22)
                .setGender(Gender.FEMALE)
                .setRole(Role.STAFF)
                .setDept("Sales")
                .setPhone("5423123")
                .setAddress("Gre Road")
                .setCity("Moscow")
                .setCode("34")
                .build());
        list.add(new Builder()
                .setGivenName("Igor")
                .setSurName("Apoyan")
                .setAge(31)
                .setGender(Gender.MALE)
                .setRole(Role.EXECUTIVE)
                .setDept("Product")
                .setPhone("543421")
                .setAddress("Rew Street")
                .setCity("Novosibirsk")
                .setCode("68")
                .build());
        list.add(new Builder()
                .setGivenName("David")
                .setSurName("Loginov")
                .setAge(24)
                .setGender(Gender.MALE)
                .setRole(Role.MANAGER)
                .setDept("General Management")
                .setPhone("5748234")
                .setAddress("Rbs Street 32")
                .setCity("Moscow")
                .setCode("31")
                .build());
        return list;
    }
}
