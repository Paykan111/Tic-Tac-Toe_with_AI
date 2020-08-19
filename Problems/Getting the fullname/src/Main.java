class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        // write your code here
        if (getFirstName() != "" && getLastName() != "") return getFirstName() + " " + getLastName();
        else{
            if (getFirstName() == "" && getLastName() == "") return "Unknown";
            if (getLastName()=="") return getFirstName();
            else return getLastName();
        }
    }
}