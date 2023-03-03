public class Person
{ // these are the attributes
    private String firstName;
    private String surname;
    private Pet myPet;

    // contstrcutors
    public Person (String fName, String sName)
    {
        this.firstName = fName;
        this.surname = sName;
    }
    // methods
    public String getFirstName() // getters
    {
        return this.firstName;   //setters
    }
    public String getSurname() // getters
    {
        return this.surname; // setters
    }
    public String getFullName() //getters
    {
        return firstName + " " + surname;  //setters
    }
    public void setSurname(String surname) // gives the user the oportunity to change surname if married
    {
        this.surname = surname;
    }

    public void setMyPet(Pet myPet)
    {
        this.myPet = myPet;
    }

    public Pet getMyPet()
    {
        return myPet;
    }
}
