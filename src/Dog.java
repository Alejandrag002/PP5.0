public class Dog implements Comparable<Dog>
{
    // instance Variables
    private String name;
    private int age;
    private String breed;
    private  double weight;
    private static int count = 0;

    //constructor
    public Dog ()
    {
       name = null;
       age= 0;
       breed = null;
       weight = 0;
       count ++;
    }
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;

        return output;
    }

    public Dog(String newName, int newAge, String newBreed, double newWeight)
    {
        name = newName;
        age = newAge;
        breed = newBreed;
        weight = newWeight;
        count ++;
    }



    //getters
    public static int getCount()
    {
        return count;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }

    //setters
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setAge(int newAge)
    {
        this.age = newAge;
    }
    public void setBreed(String newBreed)
    {
        this.breed = newBreed;
    }
    public void setWeight (double newWeight)
    {
        this.weight = newWeight;
    }

    /* public int compareTo(Dog someDog)
    {
        if (this.weight < someDog.weight)
        {
            return -1;
        }
        else if (this.weight == someDog.weight)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }*/

    /*public double weightConversion()
    {
      //  weight = weight * 0.45;
        return weight * .45;
    }*/

    public int compareTo(Dog somedog)
    {
        if ( < this.age)
        {
            return -1;
        }
        else if (this.age == this.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
