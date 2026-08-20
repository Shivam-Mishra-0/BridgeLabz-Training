package Day15.classwork.InterfaceDemo1;

class Eagle implements Bird, Animal{

    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }

    @Override
    public void eat(){
        System.out.println("Eagle is eating.");
    }

    public static void main(String args[]){
        Bird eagle = new Eagle();
        Animal a = new Eagle() ;
        eagle.fly();
        a.eat();
    }
}

