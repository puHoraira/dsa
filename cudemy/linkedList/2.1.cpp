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
node *head = 0;
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

void create(int a[], int n)
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
}

int main()
{

    int a[] = {1, 2, 3, 4};
    create(a, 4);
    create(a, 4);
}