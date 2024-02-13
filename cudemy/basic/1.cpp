#include <bits/stdc++.h>
using namespace std;

struct Student
{
    string name;
    int roll;
    string address;
    void print()
    {
        cout << "Name: " << name << " Roll: " << roll << " Address: " << address << endl;
    }
};

void referencing()
{
    int n = 10;
    int &t = n;
    cout << "n is :" << n << " t is: " << t << endl;
    t++;
    cout << "After operation : "
         << "n is :" << n << " t is: " << t << endl;
}

void passByValue(int a, int b)
{
    int tm = a;
    a = b;
    b = tm;
}

void passByAddress(int *a, int *b)
{
    int tm = *a;
    *a = *b;
    *b = tm;
}
void passByReference(int &a, int &b)
{
    int tm = a;
    a = b;
    b = tm;
}

struct Rectangle
{
    int length;
    int width;
};
void changeLength_value(struct Rectangle r)
{
    r.length = 3;
}
void changeLength_address(struct Rectangle *r)
{
    r->length = 3;
}

void changeLength_Reference(struct Rectangle &r)
{
    r.length = 88;
}

void initialize_Value(struct Rectangle *r, int length, int width)
{
    r->length = length;
    r->width = width;
}

int area(struct Rectangle r)
{
    return r.length * r.width;
}

void changeLength(struct Rectangle *r, int length)
{
    r->length = length;
}

class Rectangle2
{
public:
    int length, width;
    void initialize_Value(int length, int width)
    {
        this->length = length;
        this->width = width;
    }
    int area()
    {
        return length * width;
    }
    void changeLength(int length)
    {
        this->length = length;
    }
};

class Rectangle3
{
private:
    int length, width;

public:
    void initialize_Value3(int length, int width);
    int area();
    void changeLength(int length);
};
void Rectangle3::initialize_Value3(int length, int width)
{
    this->length = length;
    this->width = width;
}
int Rectangle3::area()
{
    return length * width;
}
void Rectangle3::changeLength(int length)
{
    this->length = length;
}

class Arithmetic
{
private:
    int a;
    int b;

public:
    int add();
    int sub();
    Arithmetic(int a, int b);
};
Arithmetic::Arithmetic(int a, int b)
{
    this->a = a;
    this->b = b;
}
int Arithmetic::add()
{
    return a + b;
}
int Arithmetic::sub()
{
    return a - b;
}

template <class T>

class Arithmetic2
{
private:
    T a;
    T b;

public:
    T add();
    T sub();
    Arithmetic2(T a, T b);
};
template <class T>
Arithmetic2<T>::Arithmetic2(T a, T b)
{
    this->a = a;
    this->b = b;
}
template <class T>
T Arithmetic2<T>::add()
{
    return a + b;
}
template <class T>
T Arithmetic2<T>::sub()
{
    return a - b;
}

int main()
{
    Student horaira;
    horaira.name = "horaira";
    horaira.address = "Rampura";
    horaira.roll = 26;
    horaira.print();
    referencing();
    int a = 10, b = 2;
    cout << "Original value: " << a << " " << b << endl;
    passByValue(a, b);
    cout << "Pass by value: " << a << " " << b << endl;
    passByAddress(&a, &b);
    cout << "Pass by Address: " << a << " " << b << endl;
    passByReference(a, b);
    cout << "Pass by Reference: " << a << " " << b << endl;

    Rectangle rec;
    rec.length = 9;
    rec.width = 5;
    cout << "Length: " << rec.length << " Width: " << rec.width << endl;
    changeLength_value(rec);
    cout << "Length: " << rec.length << " Width: " << rec.width << endl;
    changeLength_address(&rec);
    cout << "Length: " << rec.length << " Width: " << rec.width << endl;
    changeLength_Reference(rec);
    cout << "Length: " << rec.length << " Width: " << rec.width << endl;
    Rectangle newrec;
    initialize_Value(&newrec, 5, 7);
    cout << "Old area is: " << area(newrec) << endl;
    changeLength(&newrec, 12);
    cout << "New area is: " << area(newrec) << endl;
    Rectangle2 newrec2;
    newrec2.initialize_Value(4, 5);
    cout << "Old area is: " << newrec2.area() << endl;
    newrec2.changeLength(8);
    cout << "New area is: " << newrec2.area() << endl;
    Rectangle2 newrec3;
    newrec3.initialize_Value(9, 5);
    cout << "Old area is: " << newrec3.area() << endl;
    newrec3.changeLength(8);
    cout << "New area is: " << newrec3.area() << endl;

    Arithmetic ari1(99, 6);
    cout << "Sum without template:" << ari1.add() << endl;
    cout << "Minus without template:" << ari1.sub() << endl;
    Arithmetic2 ari2(99, 6);
    cout << "Sum without template:" << ari2.add() << endl;
    cout << "Minus without template:" << ari2.sub() << endl;
    Arithmetic2 ari3('B', '0');
    cout << "Sum without template:" << ari3.add() << endl;
    cout << "Minus without template:" << ari3.sub() << endl;
}