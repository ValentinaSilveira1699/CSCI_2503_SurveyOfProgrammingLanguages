#include <iostream>

// Function to swap values using pointers
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    // Initializing values
    int num1 = 5, num2 = 10;

    // Printing values and addresses before swap
    std::cout << "Before Swap:\n";
    std::cout << "num1: " << num1 << " (Address: " << &num1 << ")\n";
    std::cout << "num2: " << num2 << " (Address: " << &num2 << ")\n";

    // Swapping values using the swap function
    swap(&num1, &num2);

    // Printing values and addresses after swap
    std::cout << "\nAfter Swap:\n";
    std::cout << "num1: " << num1 << " (Address: " << &num1 << ")\n";
    std::cout << "num2: " << num2 << " (Address: " << &num2 << ")\n";

    return 0;
}
