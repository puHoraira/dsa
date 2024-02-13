#include <bits/stdc++.h>

using namespace std;

void fun1(int n)
{
    //.................... ............................3 2 1--------------------------
    if (n <= 0)
    {
        return;
    }
    cout << n << " ";
    fun1(n - 1);
}

void fun2(int n)
{
    //------------------------------------1 2 3...................
    if (n <= 0)
    {
        return;
    }
    fun2(n - 1);
    cout << n << " ";
}

int sum_of_numbers(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return sum_of_numbers(n - 1) + n;
}
int sum_of_numbers_using_staticAsGlobalVariables(int n)
{
    static int x = 0;
    if (n == 0)
    {
        return 0;
    }
    x++;
    return sum_of_numbers_using_staticAsGlobalVariables(n - 1) + x;
}

void tree_recursion(int n)
{
    if (n == 0)
    {
        return;
    }
    cout << n << " ";
    tree_recursion(n - 1);
    tree_recursion(n - 1);
}

int nested_recursion(int n)
{
    if (n > 100)
    {
        return n - 10;
    }
    else
    {
        return nested_recursion(nested_recursion(n + 11));
    }
}

int sum_of_first_N_natural_numbers(int n)
{
    if (n == 0)
    {
        return 0;
    }
    return n + sum_of_first_N_natural_numbers(n - 1);
}

int factorial(int n)
{
    if (n <= 1)
    {
        return 1;
    }
    return n * factorial(n - 1);
}

int power_noob(int m, int n)
{
    if (n == 0)
    {
        return 1;
    }
    return m * power_noob(m, n - 1);
}
int power_pro(int m, int n)
{

    if (n == 0)
    {
        return 1;
    }
    int x = power_pro(m, n / 2);
    if (x % 2 == 0)
    {
        return x * x;
    }
    else
    {
        return x * x * m;
    }
}

int fibonacci(int n)
{
    if (n <= 2)
    {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

void fibonacci_print(int n)
{
    if (n <= 0)
    {
        return;
    }
    fibonacci_print(n - 1);
    cout << fibonacci(n) << " ";
}

int binomial_ex(int n, int r)
{
    long long int lob = factorial(n), hor = factorial(n - r), horr = factorial(r);
    return lob / (hor * horr);
}

int binomial_ex_pascal(int n, int r)
{
    if (r == 0 || n == r)
    {
        return 1;
    }
    return binomial_ex_pascal(n - 1, r - 1) + binomial_ex_pascal(n - 1, r);
}

int main()
{
    fun1(5);
    cout << endl;
    fun2(5);
    cout << endl;
    cout << sum_of_numbers(10) << endl;
    cout << sum_of_numbers_using_staticAsGlobalVariables(5) << endl;
    tree_recursion(5);
    cout << endl;
    cout << nested_recursion(96) << endl;
    cout << sum_of_first_N_natural_numbers(10) << endl;
    cout << factorial(10) << endl;
    cout << power_noob(5, 3) << endl;
    cout << power_pro(5, 3) << endl;
    cout << fibonacci(6) << endl;
    fibonacci_print(6);
    cout << endl;
    cout << binomial_ex(11, 3) << endl;
    cout << binomial_ex_pascal(11, 3) << endl;
}