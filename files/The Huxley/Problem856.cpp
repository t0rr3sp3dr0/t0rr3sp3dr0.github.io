#include <iostream>
#include <string.h>

typedef struct node {
    node *previous;
    int value;
    node *next;

    node(int value, node *next=NULL, node *previous=NULL) {
        this->next = next;
        this->value = value;
        this->previous = previous;
    }
} node;

typedef struct stack {
    node *top;

    stack() {
        top = NULL;
    }

    void push(int value) {
        top = new node(value, top);
    }

    int pop() {
        int i = top->value;
        node *n = top;
        top = top->next;
        delete n;
        return i;
    }

    int size() {
        int i = 0;
        node *cursor = top;
        while (true) {
            if (cursor)
                cursor = cursor->next;
            else
                break;
            i++;
        }
        return i;
    }

    void clear() {
        while (top)
            pop();
    }
} stack;

typedef struct ll {
    node *begin;
    node *end;

    ll() {
        begin = NULL;
        end = NULL;
    }

    void push_front(int value) {
        node *n = new node(value);
        if (!begin) {
            begin = n;
            end = n;
        } else {
            n->next = begin;

            begin->previous = n;
            begin = n;
        }
    }

    void push_back(int value) {
        node *n = new node(value);
        if (!begin) {
            begin = n;
            end = n;
        } else {
            n->previous = end;

            end->next = n;
            end = n;
        }
    }

    int pop_front() {
        int i = begin->value;
        node *n = begin;
        begin = begin->next;
        if (begin)
            begin->previous = NULL;
        else
            end = NULL;
        delete n;
        return i;
    }

    int pop_back() {
        int i = end->value;
        node *n = end;
        end = end->previous;
        if (end)
            end->next = NULL;
        else
            begin = NULL;
        delete n;
        return i;
    }

    void clear() {
        while (begin)
            pop_back();
    }

    node * operator [](int index) {
        node *cursor = begin;
        for (int i = 0; i < index; i++)
            cursor = cursor->next;
        return cursor;
    }

    int length() {
        int i = 0;
        node *cursor = begin;
        while (true) {
            if (cursor)
                cursor = cursor->next;
            else
                break;
            i++;
        }
        return i;
    }
} ll;

int main () {
    int i = 0;
    stack t0;
    ll t1;

    char in[8];
    while (scanf("%s", in) != EOF) {
        if (strcmp(in, "E0") == 0)
            t0.push(i++);
        else if (strcmp(in, "S0") == 0) {
            if (t0.top)
                printf("%d\n", t0.pop());
        } else if (strcmp(in, "E1E") == 0)
            t1.push_front(i++);
        else if (strcmp(in, "E1D") == 0)
            t1.push_back(i++);
        else if (strcmp(in, "S1E") == 0) {
            if (t1.begin)
                printf("%d\n", t1.pop_front());
        } else if (strcmp(in, "S1D") == 0) {
            if (t1.begin)
                printf("%d\n", t1.pop_back());
        } else if (strcmp(in, "FIM") == 0) {
            printf("%d\n", t0.size());
            printf("%d\n", t1.length());
            printf("\n");
            i = 0;
            t0.clear();
            t1.clear();
        }
    }

    return 0;
}
