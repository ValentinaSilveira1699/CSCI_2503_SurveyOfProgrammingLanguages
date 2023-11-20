using System;

// Define the Student record
record Student(string FirstName, string LastName, double GPA, string Major, int AttemptedHours, int CompletedHours);

class Program
{
    static void Main()
    {
        // Creating three Student records
        var student1 = new Student("John", "Doe", 3.8, "Computer Science", 90, 75);
        var student2 = new Student("Jane", "Smith", 3.5, "Mathematics", 80, 65);
        var student3 = new Student("Alice", "Johnson", 3.9, "Physics", 95, 85);

        // Printing information about each student
        Console.WriteLine("Student 1: " + student1);
        Console.WriteLine("Student 2: " + student2);
        Console.WriteLine("Student 3: " + student3);

        // Attempting to change values for one record (Won't work due to immutability)
        // student1.GPA = 4.0; // This line will result in a compilation error

        // Comment Explanation:
        // Records in C# are immutable by default, meaning their values cannot be changed after creation.
        // Attempting to modify a value in a record, like student1.GPA = 4.0;, would result in a compilation error.

        // Comparing to class-based approach: Records in C# are more concise and provide value-based equality by default.
    }
}