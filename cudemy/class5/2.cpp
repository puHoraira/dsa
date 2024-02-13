#include <bits/stdc++.h> // library with built in functions
using namespace std;
void call(int a[])
{
    for (int i = 0; i < 5; i++)
    {
        a[i]++;
    }
}

int main()
{
    int a[5];
    for (int i = 0; i < 5; i++)
    {
        a[i] = i;
    }
    for (int i = 0; i < 5; i++)
    {
        cout << a[i] << " ";
    }
    call(a);
    for (int i = 0; i < 5; i++)
    {
        cout << a[i] << " ";
    }
}
/*
Md. Abu Horaira
abuhoraira1015@gmail.com
01751777543
2021911202
2nd Year
2nd Semester

*/