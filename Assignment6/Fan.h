/**
 * File: Fan.h
 * Course: CSCI 2503
 * Author: Valentina Silveira
 * Created on: Nov 17,2023
 */

#ifndef FAN_H
#define FAN_H

#include <string>

class Fan {
private:
    int speed;
    double radius;
    std::string color;

public:
    // Constructors
    Fan();
    Fan(double newRadius);

    // Destructor
    ~Fan() = default;

    // Accessors/Mutators
    int getSpeed() const;
    void setSpeed(int speed);
    double getRadius() const;
    void setRadius(double radius);
    std::string getColor() const;
    void setColor(const std::string& color);

    // ToString method
    std::string toString() const;
};

#endif // FAN_H
