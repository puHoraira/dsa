#include <bits/stdc++.h>

using namespace std;

template <class T>
class Rect
{
private:
    T wid, len;

public:
    Rect();
    Rect(T len, T wid);
    T getlen();
    void changeLen(T len);
    T area();
    //~Rect();
};

template <class T>
Rect<T>::Rect() {}
template <class T>
Rect<T>::Rect(T a, T b)
{
    this->len = a;
    this->wid = b;
}
template <class T>
T Rect<T>::getlen()
{
    return len;
}
template <class T>
T Rect<T>::area()
{
    return len * wid;
}
template <class T>
void Rect<T>::changeLen(T len)
{
    this->len = len;
}

int main()
{
    Rect r(5.5, 10.5);
    cout << r.getlen() << endl;
    cout << r.area() << endl;
    r.changeLen(6.7);
    cout << r.getlen() << endl;
    cout << r.area() << endl;
    Rect e(5, 10);
    cout << e.getlen() << endl;
    cout << e.area() << endl;
    e.changeLen(6.7);
    cout << e.getlen() << endl;
    cout << e.area() << endl;
}