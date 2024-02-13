#include <bits/stdc++.h>

using namespace std;

struct Array
{
    int size;
    int *str;
};

void sort(Array &a, int n)
{
    // cout << n << endl;
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (a.str[j] > a.str[j + 1])
            {
                int tm = a.str[j];
                a.str[j] = a.str[j + 1];
                a.str[j + 1] = tm;
            }
        }
    }
}
void display(Array a)
{
    for (int i = 0; i < 10; i++)
    {
        cout << a.str[i] << " ";
    }
    cout << endl;
}

int main()
{
    Array a, b;
    cin >> a.size >> b.size;
    a.str = new int[a.size];
    b.str = new int[b.size];
    for (int i = 0; i < a.size; i++)
    {
        cin >> a.str[i];
    }
    for (int i = 0; i < b.size; i++)
    {
        cin >> b.str[i];
    }

    sort(a, a.size);
    sort(b, b.size);
    cout << "Unions: ";
    // display(a);
    // display(b);
    for (int i = 0; i < a.size; i++)
    {
        cout << a.str[i];
    }
    for (int i = 0; i < b.size; i++)
    {
        cout << b.str[i];
    }
    Array c;
    c.size = a.size + b.size;
    c.str = new int[c.size];
    for (int i = 0, j = 0, k = 0;;)
    {
        if (i == a.size && j == b.size)
        {
            break;
        }
        if (a.size == i)
        {
            c.str[k] = b.str[j];
            k++, j++;
        }
        else if (b.size == j)
        {
            c.str[k] = a.str[i];
            k++, i++;
        }
        else if (a.str[i] == b.str[j])
        {
            continue;
        }
        else
        {
            c.str[k] = a.str[i];
            i++, k++;
        }
    }
    display(c);
}