#include <bits/stdc++.h>

using namespace std;

class Rect
{
private:
    int wid, len;

public:
    Rect();
    Rect(int len, int wid);
    int getlen();
    void changeLen(int len);
    int area();
    //~Rect();
};

Rect::Rect() {}

Rect ::Rect(int a, int b)
{
    this->len = a;
    this->wid = b;
}
int Rect::getlen()
{
    return len;
}
int Rect::area()
{
    return len * wid;
}
void Rect::changeLen(int len)
{
    this->len = len;
}

int main()
{
    Rect r(5, 10);
    cout << r.getlen() << endl;
    cout << r.area() << endl;
    r.changeLen(8);
    cout << r.getlen() << endl;
    cout << r.area() << endl;
}