#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
} *first = NULL;
void display(struct node *p)
{
    while (p != NULL)
    {
        printf("%d ", p->data);
        p = p->next;
    }
}
struct node *search(struct node *p, int x)
{
    while (p != NULL)
    {
        if (x == p->data)
        {
            return (p);
        }
        else
        {
            p = p->next;
        }
    }
    return NULL;
}
void create(int a[], int n)
{
    int i;
    struct node *t, *last;
    first = (struct node *)malloc(sizeof(struct node));
    first->data = a[0];
    first->next = NULL;
    last = first;
    for (i = 1; i < n; i++)
    {
        t = (struct node *)malloc(sizeof(struct node));
        t->data = a[i];
        t->next = NULL;
        last->next = t;
        last = t;
    }
}

int main()
{

    int a[] = {2, 1, 4, 6, 8, 9, 31};
    create(a, 7);
    struct node *temp;
    temp = search(first, 31);
    if (temp)
    {
        printf("found");
    }
    else
    {
        printf("not found");
    }

    return 0;
}