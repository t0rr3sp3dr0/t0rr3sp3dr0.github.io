#ifdef __APPLE__
#include <iostream>
#include <assert.h>
#include <climits>
#else
#include <bits/stdc++.h>
#endif

using namespace std;

typedef struct node {
    int value;
    node *left;
    node *right;
    bool is_empty;

    node(int value, node *left=NULL, node *right=NULL) {
        this->value = value;
        this->left = left;
        this->right = right;
        this->is_empty = false;
    }

    node *insert(int i) {
        if (this->is_empty) {
            this->value = i;
            this->is_empty = false;
        } else if (i < this->value) {
            if (this->left)
                this->left = this->left->insert(i);
            else
                this->left = new node(i);
        } else if (i > this->value) {
            if (this->right)
                this->right = this->right->insert(i);
            else
                this->right = new node(i);
        }
        return this;
    }

    node *remove(int i) {
        if (this->left && i < this->value)
            this->left = this->left->remove(i);
        else if (this->right && i > this->value)
            this->right = this->right->remove(i);
        else if (this->value == i){
            if (!this->left)
                return this->right;
            else if (!this->right)
                return this->left;
            else {
                node *minimum = this->right->get_min();
                this->value = minimum->value;
                this->right = this->right->remove(minimum->value);
            }
        }
        return this;
    }

    node *get_min() {
        if (this->left)
            return this->left->get_min();
        return this;
    }

    void post_order() {
        if (this->is_empty)
            return;
        if (this->left)
            this->left->post_order();
        if (this->right)
            this->right->post_order();
        cout << this->value << endl;
    }

    bool isBST(int min, int max) {
        if (this->value < min || this->value > max)
            return false;
        else
            return (!this->left || this->left->isBST(min, this->value - 1)) && (!this->right || this->right->isBST(this->value + 1, max));
    }
} bst;

unsigned long integer;
node *parse_tree(string s) {
    assert(s[integer] == '(');
    if (s[++integer] == ')')
        return NULL;
    else {
        unsigned long origin = integer;
        while (s[integer] != ':')
            integer++;
        node *n = new node(stoi(s.substr(origin, integer - origin)));
        integer++;
        n->left = parse_tree(s);
        integer++;
        n->right = parse_tree(s);
        integer++;
        return n;
    }
}

int main() {
    ios::sync_with_stdio(false);

    bst *tree = new bst(0);
    tree->is_empty = true;

    string s;
    while (getline(cin, s)) {
        if (s.empty())
            continue;
        if (s.compare("EOF") == 0)
            break;

        integer = 0;
        node *in = parse_tree(s);

        if (in->isBST(INT_MIN, INT_MAX))
            tree = tree->insert(in->get_min()->value);
        else if (!in->is_empty)
            tree = tree->remove(in->value);
    }

    tree->post_order();

    return 0;
}