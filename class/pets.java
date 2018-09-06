public interface Animals {
    void speak();
    void eat();

    public static void main(String[] args) {
      Dog d=new Dog();
      d.speak();
      d.eat();
      cat c=new cat();
      c.speak();
      c.eat();
	}

}
 class Dog implements Animals{
	public void speak() {
		System.out.println("I am a dog, I bark.");
	}
	public void eat() {
		System.out.println("I am a dog, I eat bones.");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("I am a cat, I meow.");
		}
		public void eat() {
			System.out.println("I am a cat, I eat veggies.");
		}
	 }