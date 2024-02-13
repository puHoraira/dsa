#include <bits/stdc++.h>

using namespace std;

struct LL
{
    struct node
    {
        int data;
        node *next;
        node()
        {
            next = 0;
        }
    };
    node *head = NULL;

    void add_value(int n);

    void print();

    void concatation(node *b);

    void merge2(node *b);

    void isLoop();
};
void LL::merge2(node *b)
{
    node *first = head;
    node *second = b;
    node *mergedList = new node;
    node *last = mergedList;

    while (first != nullptr && second != nullptr)
    {
        if (first->data < second->data)
        {
            last->next = first;

            first = first->next;
        }
        else
        {
            last->next = second;
            second = second->next;
        }
        last = last->next;
    }

    if (first != nullptr)
    {
        last->next = first;
    }
    else if (second != nullptr)
    {
        last->next = second;
    }

    head = mergedList->next;

    delete mergedList;
}
void LL::isLoop()
{
    node *first = head;
    node *second = head;
    do
    {
        first = first->next;
        second = second->next;
        second = second ? second->next : second;
    } while (first && second && first != second);
    if (first == second)
    {
        cout << "LOOP" << endl;
    }
    else
    {
        cout << "not a loop" << endl;
    }
}
void LL::add_value(int n)
{
    node *newnode = new node;
    newnode->data = n;
    if (head == 0)
    {
        head = newnode;
    }
    else
    {
        node *tm = head;
        while (tm->next != 0)
        {
            tm = tm->next;
        }
        tm->next = newnode;
    }
}

void LL::print()
{
    node *tm = head;
    while (tm != 0)
    {
        cout << tm->data << " ";
        tm = tm->next;
    }
    cout << endl;
}
void LL::concatation(node *b)
{
    node *tm = head;
    while (tm->next != 0)
    {
        tm = tm->next;
    }
    tm->next = b;
}

int main()
{
    LL a;
    a.add_value(0);
    a.print();
    a.add_value(3);
    a.print();
    a.add_value(44);
    a.print();
    // a.add_value(55);
    // a.print();
    // a.add_value(63);
    // a.print();
    // a.add_value(89);
    a.print();
    LL b;
    b.add_value(1);
    b.print();
    b.add_value(7);
    b.print();
    b.add_value(34);
    b.print();
    // a.concatation(b.head);
    a.print();
    a.merge2(a.head);
    a.print();
}