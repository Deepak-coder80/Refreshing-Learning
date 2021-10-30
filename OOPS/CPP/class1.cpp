#include <iostream>

using namespace std;

class Box{
    //public data members
    public:
        int height;
        int length;
        int width;
};

int main(){
    //object for Box class
    Box box1;

    box1.height=33;
    box1.length=33;
    box1.width=33;

    cout<<"Box Height : "<<box1.height<<endl;
    cout<<"Box Length : "<<box1.length<<endl;
    cout<<"Box Width : "<<box1.width<<endl;
}