```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the number of people: ");
        int numberOfPeople = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter the step count: ");
        int stepCount = Convert.ToInt32(Console.ReadLine());

        List<int> people = new List<int>();
        for (int i = 0; i < numberOfPeople; i++)
        {
            people.Add(i + 1);
        }

        int index = 0;
        while (people.Count > 1)
        {
            index = (index + stepCount - 1) % people.Count;
            people.RemoveAt(index);
        }

        Console.WriteLine("The person who survives is: " + people[0]);
    }
}
```