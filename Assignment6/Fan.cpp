/**
 * File: Fan.cpp
 * Course: CSCI 2503
 * Author: Valentina Silveira
 * Created on: Nov 17,2023
 */

#include "Fan.h"
#include <iostream>
#include <iomanip>

// Default constructor
Fan::Fan() {
    setSpeed(1);
    setRadius(1.53);
    setColor("green");
}

// Convenience constructor
Fan::Fan(double newRadius) {
    setRadius(newRadius);
}

// Accessors/Mutators
int Fan::getSpeed() const {
    return speed;
}

void Fan::setSpeed(int speed) {
    this->speed = speed;
}

double Fan::getRadius() const {
    return radius;
}

void Fan::setRadius(double radius) {
    this->radius = radius;
}

std::string Fan::getColor() const {
    return color;
}

void Fan::setColor(const std::string& color) {
    this->color = color;
}

// ToString method
std::string Fan::toString() const {
    return "A " + std::to_string(radius) + " inch " + color + " fan at a speed of " + std::to_string(speed);
}
