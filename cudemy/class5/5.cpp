#include <bits/stdc++.h>

using namespace std;

struct Rect
{
    int len, wid;
};

void ini(struct Rect *p, int a, int b)
{
    p->len = a;
    p->wid = b;
}

int area(struct Rect r)
{
    return r.len * r.wid;
}

void change(struct Rect *p, int l)
{
    p->len = l;
}
int main()
{
    struct Rect r;
    ini(&r, 10, 12);
    area(r);
    change(&r, 90);
}