    public class Dog extends Animal {
        private int teeth;

        public Dog(String name, int weight, int height, int legs, int teeth) {
            super(name, weight, height, legs);
            this.teeth = teeth;
        }

        public void move(int speed) {
            System.out.println("Dog is running..");
            super.move(speed);
        }
        public void eat(String food) {
            System.out.println("He is eating");
            super.eat(food);
        }

        public int getTeeth() {
            return teeth;
        }

        public void setTeeth(int teeth) {
            this.teeth = teeth;
        }
    }

