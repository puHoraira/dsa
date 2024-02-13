#include <bits/stdc++.h>

using namespace std;

struct LL
{
    struct Node
    {
        int data;
        Node *next;
        Node(int data)
        {
            this->data = data;
            this->next = NULL;
        }
    };
    Node *head = NULL;
    Node *tail = NULL;
    void insert(int number)
    {
        Node *newnode = new Node(number);
        if (head == NULL)
        {
            head = tail = newnode;
        }
        else
        {
            tail->next = newnode;
            tail = newnode;
        }
    }
};

int main()
{
}