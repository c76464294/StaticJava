class Cat {
  int age;
  void eat(int food){
    this.age += food;
    System.out.println("added");
  }
  public Cat(){
    System.out.println("catttt");
  }
}