#include <bits/stdc++.h>

using namespace std;

int sum(int n)
{
    if (n > 0)
    {
        return n + sum(n - 1);
    }
    else
    {
        return 0;
    }
}

int fac(int n)
{
    if (n > 0)
    {
        return n * fac(n - 1);
    }
    return 1;
}

long long int exp(int m, int n)
{
    if (n == 0)
    {
        return 1;
    }
    return m * exp(m, n - 1);
}

long long int exp2(int m, int n)
{
    if (n == 0)
    {
        return 1;
    }
    if (n % 2 == 0)
    {
        return exp2(m * m, n / 2);
    }
    else
    {
        return m * exp2(m * m, (n - 1) / 2);
    }
}

double taylor(int x, int n)
{
    static double p = 1, f = 0;
    if (n == 1)
    {
        return 1;
    }
    double r = taylor(x, n - 1);
    p = p * x;
    f++;
    return r + (p / f);
}
void ok()
{
}
double taylor2(int x, int n)
{
    static double po = 1, fo = 1;
    if (n == 0)
    {
        return 1;
    }
    int r = taylor2(x, n - 1);
    po = po * x;
    fo = fo * n;
    return r + (po / fo);
}
int main()
{
    int n;
    cin >> n;
    cout << sum(n) << endl;
}