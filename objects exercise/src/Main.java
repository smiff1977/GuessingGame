public class Main
{
    public static void main(String [] args)
    {
        Person bob = new Person("Bob", "Smith");
        Person sarah = new Person("Sarah", "Smith");
        Pet marvin = new Pet("Marvin", "Dog");

        sarah.setSurname("Jones"); //if sarah changes surname
        sarah.setMyPet(marvin); //initialise marvin as name if this is left blank "sarah has no pet is initialised below"

        System.out.println(bob.getFullName());
        System.out.println(sarah.getFullName());

        Pet theirPet = sarah.getMyPet();

        if (theirPet == null) // checks if a name has been initialized - if not null is default
        {
            System.out.println(sarah.getFirstName() + " has no pet");
        }
        else
        {
            System.out.println(sarah.getFirstName() + " has a pet called " + theirPet.getName());
        }




    }
}
