package person;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * @author lihaiyu
 */
public class PersonInterfaceImpl implements PersonInterface{

    private String fistName = "张";
    private String lastName = "三";

    @Override
    public void setFirstName(String str) {
        this.fistName = str;
    }

    @Override
    public void setLastName(String str) {
        this.lastName = str;
    }

    @Override
    public String getFirstName() {
        return this.fistName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getFullName() {
        return this.fistName+this.lastName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fistName", fistName)
                .append("lastName", lastName)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof PersonInterfaceImpl)) {
            return false;
        }

        PersonInterfaceImpl that = (PersonInterfaceImpl) o;

        return new EqualsBuilder()
                .append(fistName, that.fistName)
                .append(getLastName(), that.getLastName())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(fistName)
                .append(getLastName())
                .toHashCode();
    }
}
