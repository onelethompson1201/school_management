/*  Davin Carstens 220021333
 */
package za.ac.cput.domain.users;

import java.util.Objects;

public class Employee
{
    private String staffId;
    private String email;
    private String name;

    public Employee(String staffId, String email, String name) {
        this.staffId = staffId;
        this.email = email;
        this.name = name;
    }

    private Employee(Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public static class Builder{
        private String staffId, email, name;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Employee employee){
            this.staffId = employee.staffId;
            this.email = employee.name;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(staffId, builder.staffId) && Objects.equals(email, builder.email) && Objects.equals(name, builder.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(staffId, email, name);
        }
    }
}
