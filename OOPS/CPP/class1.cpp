#include <iostream>

using namespace std;

class Box{
    //public data members
    public:
        double height;
        double length;
        double width;
        /*
        Member function: function inside a class
        delcaration : inside function
        definition: 2 methodes
            1.inside the class 
            2. using scope resolution operator(::)
        */
       //METHOD 1
    //    double getVolume(){
    //        return length*height*width;
    //    }
        // METHOD 2 :
        //function declaration
        double getVolume();
};

double Box::getVolume(){
    return length*height*width;
}

int main(){
    //object for Box class
    Box box1;

    box1.height=3;
    box1.length=3;
    box1.width=3;

    cout<<"Box Height : "<<box1.height<<endl;
    cout<<"Box Length : "<<box1.length<<endl;
    cout<<"Box Width : "<<box1.width<<endl;

    double volume = box1.getVolume();

    cout<<"Volume of the box : "<<volume<<endl;

}