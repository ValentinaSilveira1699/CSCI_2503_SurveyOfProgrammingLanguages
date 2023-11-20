/**
 * File: Fan.cs
 * Course: CSCI 2503
 * Author: Valentina Silveira
 * Created on: Nov 17,2023
 */

using System;

public class Fan
{
    private int speed;
    private double radius;
    private string color;

    // Default constructor
    public Fan()
    {
        Speed = 1;
        Radius = 1.53;
        Color = "green";
    }

    // Convenience constructor
    public Fan(double newRadius)
    {
        Radius = newRadius;
    }

    // String description of the fan
    public override string ToString()
    {
        return $"A {Radius:F2} inch {Color} fan at a speed of {Speed}";
    }

    // Properties
    public int Speed
    {
        get { return speed; }
        set { speed = value; }
    }

    public double Radius
    {
        get { return radius; }
        set { radius = value; }
    }

    public string Color
    {
        get { return color; }
        set { color = value; }
    }
}

public class FanTest
{
    public static void Main(string[] args)
    {
        Fan fan1 = new Fan();
        fan1.Speed = 3;
        fan1.Radius = 10.26;
        fan1.Color = "yellow";
        Console.WriteLine(fan1);

        Fan fan2 = new Fan(5.79);
        fan2.Speed = 2;
        fan2.Color = "blue";
        Console.WriteLine(fan2);

        Fan fan3 = new Fan();
        Console.WriteLine(fan3);
    }
}
