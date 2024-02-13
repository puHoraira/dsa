#include <bits/stdc++.h>

using namespace std;

struct node
{
    int data;
    node *next;
};

void print(node *head) // temporary dia print
{
    node *tm = head;
    while (tm != 0)
    {
        cout << tm->data << " ";
        tm = tm->next;
    }
    cout << endl;
}

void add(node *head) // etate head nia jai koros main head e kokhono change hobena
{
    int n;
    cin >> n;
    while (n--)
    {
        node *newnode = new node();
        cin >> newnode->data;
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

void add2(node *&head) // head return korbo na. input i nibo main head
{
    int n;
    cin >> n;
    while (n--)
    {
        node *newnode = new node();
        cin >> newnode->data;
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

node *add3(node *head) // head return koira kora
{
    int n;
    cin >> n;
    while (n--)
    {
        node *newnode = new node();
        cin >> newnode->data;
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
    return head;
}

void print2(node *head) // etate ami head k paltaia i kaj korlam. tao porer add e head paltay nai
{
    while (head != 0)
    {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

void change(int *t)
{
    *t = 5;
}
int main()
{
    // node *head = NULL;
    // add(head);
    // add(head);
    // add2(head);
    // add(head);
    // add(head);
    // print(head);
    // print2(head);
    // print(head);
    // add2(head);
    // head = add3(head);
    // head = add3(head);
    // print2(head);
    // add2(head);
    // add(head);
    // print(head);
    int *x = new int;
    change(x);
    cout << *x;
}
