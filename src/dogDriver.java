public class dogDriver
{
    public static void main (String[] args)
    {
        Dog someDog = new Dog();
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg",12,"Australian Sheepdog", 45.0);
        Dog dog3 = new Dog("Nikki", 6, " Black Pug", 15);

        //System.out.println (dog1);
        //System.out.println (dog2);
        //System.out.println (dog3);

        // Fang output
        System.out.println ("\n------------------\nFang's breed: " + dog1.getBreed());
        System.out.println ("Fang's age: " + dog1.getAge());

        // Nutmeg output
        System.out.println ("\n------------------\nNutmeg's weight: " + dog2.getWeight());

        // My dog output
        System.out.println ("\n------------------\n" + dog3);

        System.out.println ("\n------------------\nThere are " + Dog.getCount() + " dogs");

        int comp1 = dog2.compareTo(dog1);
        int comp2 = dog1.compareTo(dog3);

        if (comp1 == -1)
        {
            System.out.println("Nutmeg is younger than Fang.");
        } // end of if

        else if (comp1 == 0)
        {
            System.out.println("They are the same age.");
        } // end of else if

        else
        {
            System.out.println("Nutmeg is older.");
        } // end of else

        if (comp2 == -1)
        {
            System.out.println("Fang is younger than Nikki.");
        } // end of if

        else if (comp2 == 0)
        {
            System.out.println("They are the same age.");
        } // end of else if
        else
        {
            System.out.println("Fang is older.");
        } // end of else
    } // end of main method
}
