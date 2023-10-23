public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName; 
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        middleName = middleName; 
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age; 
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        birthday = birthday; 
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address; 
    }

   

    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

   

    public static void main(String[] args) {
        
        Person person = new Person("John Louie", "R", "Gaborno", 19, "01/27/2003", "Nivel Hills Lahug Cebu City");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());
    }
}
