#include <bits/stdc++.h>

using namespace std;

struct Array
{
    int size, length;
    int *str;
};

void display(Array a)
{
    for (int i = 0; i < a.length; i++)
    {
        cout << a.str[i] << " ";
    }
    cout << endl;
}

void add(Array &a, int x)
{
    if (a.length == a.size)
    {
        cout << "Faka nai" << endl;
        return;
    }
    a.str[a.length] = x;
    a.length++;
}

void insert(Array &a, int pos, int x)
{
    int i = a.size - 1;
    while (i >= pos)
    {
        a.str[i] = a.str[i - 1];
        i--;
    }
    a.str[pos - 1] = x;
}

void delete_pos(Array &a, int pos)
{
    for (int i = pos; i < a.length; i++)
    {
        a.str[i] = a.str[i + 1];
    }
    a.length--;
}

void linear_search(Array a, int key)
{
    for (int i = 0; i < a.length; i++)
    {
        if (a.str[i] == key)
        {
            cout << "Found" << endl;
            return;
        }
    }
    cout << "Not Found" << endl;
}

void linear_search_improved(Array &a, int key)
{
    for (int i = 0; i < a.length; i++)
    {
        if (a.str[i] == key)
        {
            cout << "Found" << endl;
            int tm = a.str[i];
            a.str[i] = a.str[0];
            a.str[0] = tm;
            return;
        }
    }
    cout << "Not Found" << endl;
}

int binary_search(Array a, int start, int end, int key)
{
    while (start <= end)
    {
        int mid = start + (end - start) / 2;
        if (a.str[mid] == key)
        {
            cout << "Found at: " << mid << endl;
            return 1;
        }
        else if (a.str[mid] > key)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    cout << "Not Found" << endl;
    return 0;
}

int get(Array a, int idx)
{
    return a.str[idx];
}

void sets(Array a, int idx, int val)
{
    a.str[idx] = val;
}

int maxi(Array a)
{
    int ans = INT_MIN;
    for (int i = 0; i < a.length; i++)
    {
        if (a.str[i] > ans)
        {
            ans = a.str[i];
        }
    }
    return ans;
}
int mini(Array a)
{
    int ans = INT_MAX;
    for (int i = 0; i < a.length; i++)
    {
        if (a.str[i] < ans)
        {
            ans = a.str[i];
        }
    }
    return ans;
}

void reverse(Array &a)
{
    for (int i = 0; i < a.length / 2; i++)
    {
        int tm = a.str[i];
        a.str[i] = a.str[a.length - 1 - i];
        a.str[a.length - 1 - i] = tm;
    }
}

int summ(Array a)
{
    int ans = 0;
    for (int i = 0; i < a.length; i++)
    {
        ans += a.str[i];
    }
    return ans;
}
int avg(Array a)
{
    int ans = 0;
    for (int i = 0; i < a.length; i++)
    {
        ans += a.str[i];
    }
    return ans / a.length;
}

void leftShift(Array &a)
{
    for (int i = 0; i < a.length - 1; i++)
    {
        a.str[i] = a.str[i + 1];
    }
    a.str[a.length - 1] = 0;
}
void rigthtShift(Array &a)
{
    for (int i = a.length - 1; i > 0; i--)
    {
        a.str[i] = a.str[i - 1];
    }
    a.str[0] = 0;
}

int main()
{
    Array a;
    cin >> a.size;
    a.str = new int[a.size];
    int n;
    cin >> n;
    a.length = n;
    for (int i = 0; i < n; i++)
    {
        cin >> a.str[i];
    }
    add(a, 6);
    // display(a);
    add(a, 7);
    /// display(a);
    add(a, 8);
    // display(a);
    add(a, 9);
    // display(a);
    insert(a, 4, 99);
    // display(a);
    add(a, 9);
    insert(a, 1, 99);
    // display(a);
    //  delete_pos(a, 2);
    //  display(a);
    //  delete_pos(a, 1);
    //  display(a);
    //  delete_pos(a, 0);
    //  display(a);
    linear_search(a, 6);
    // display(a);
    linear_search_improved(a, 4);
    display(a);
    cout << binary_search(a, 0, a.length - 1, 6) << endl;
    display(a);
    cout << binary_search(a, 0, a.length - 1, 99) << endl;
    cout << get(a, 3) << endl;
    sets(a, 4, 121);
    display(a);
    cout << maxi(a) << endl;
    cout << mini(a) << endl;
    cout << summ(a) << endl;
    cout << avg(a) << endl;
    display(a);
    reverse(a);
    display(a);
    delete_pos(a, 5);
    add(a, 778);
    display(a);
    reverse(a);
    display(a);

    leftShift(a);
    display(a);
    rigthtShift(a);
    display(a);
}