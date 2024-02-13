#include <bits/stdc++.h>

using namespace std;
struct Diagonal
{
    int *a;
    int row, col;
    void add_Value(int i, int j)
    {
        if (i == j)
        {
            cout << "Added at" << i << " " << j;
            cin >> a[i];
        }
    }
    int get_value(int i, int j)
    {
        if (i == j)
        {
            return a[i];
        }
        return 0;
    }
};

int main()
{
    Diagonal dia;
    cin >> dia.row >> dia.col;
    dia.a = new int[dia.row];
    for (int i = 0; i < dia.row; i++)
    {
        for (int j = 0; j < dia.col; j++)
        {
            dia.add_Value(i, j);
        }
    }
    for (int i = 0; i < dia.row; i++)
    {
        cout << dia.a[i] << " ";
    }
    cout << "Diagonal matrix values: ";
    for (int i = 0; i < dia.row; i++)
    {
        cout << dia.get_value(i, i) << " ";
    }
}