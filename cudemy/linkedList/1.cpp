#include <bits/stdc++.h>

using namespace std;

struct node
{
    int data;
    node *next;
    node()
    {
        data = 0;
        next = 0;
    }
};

void print(node *head)
{
    node *temp = head;
    while (temp != 0)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

void print2(node *tm)
{
    if (tm != 0)
    {
        cout << tm->data << " ";
        print2(tm->next);
    }
}
int len2(node *p)
{
    if (p == 0)
    {
        return 0;
    }
    else
    {
        return 1 + len2(p->next);
    }
}
int len(node *p)
{
    int l = 0;
    if (p != 0)
    {
        l++;
        len(p->next);
    }
    return l;
}
void create(int a[], int n, node *&head)
{

    for (int i = 0; i < n; i++)
    {
        int x;
        cin >> x;
        node *newnode = new node();
        newnode->data = x;
        if (head == 0)
        {
            head = newnode;
        }
        else
        {
            node *temp = head;
            while (temp->next != 0)
            {
                temp = temp->next;
            }
            temp->next = newnode;
        }
    }
    print(head);
    cout << endl;
}

int main()
{
    node *head = 0;
    int a[] = {1, 2, 3, 4};
    create(a, 4, head);
    create(a, 4, head);
}