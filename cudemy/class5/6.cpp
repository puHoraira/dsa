#include <bits/stdc++.h>

using namespace std;

class Rect
{
private:
    int len, wid;

public:
    Rect(int len, int wid)
    {
        this->len = len;
        this->wid = wid;
    }
    int area()
    {
        return len * wid;
    }
    void change(int len)
    {
        this->len = len;
    }
};

int main()
{
    Rect r(10, 3);
    cout << r.area() << endl;
    r.change(5);
    cout << r.area() << endl;
}