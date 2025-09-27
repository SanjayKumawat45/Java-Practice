import LinkedList.Node;
import innerclasses.Car;
import innerclasses.Computer;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class    Main {
    public static void main(String[] args) {

//        int age = 20;
//        int year = 2025;
//        int month = 6;
//
//        System.out.println("Age: "+age+" Year: "+year+" Month: "+month);
//
//        double price = 200.5;
//        double gpa = 9;
//
//        char grade = 'A';

        Boolean isStudent = true;
//
//
//        System.out.println("GPA: "+gpa+" isStudent: "+isStudent);


//        if(isStudent){
//            System.out.println("You are a student");
//        }
//        else{
//            System.out.println("You are not a student");
//        }
//
//        String name = "Sanjay";
//
//        System.out.println("Hello " + name);


        Scanner input = new Scanner(System.in);

//        System.out.print("Enter Your Name: ");
//        String name =  input.nextLine();
//
//        System.out.print("Enter Your Age: ");
//        int age = input.nextInt();
//
//        System.out.println("Hello "+name+"!");
//        System.out.println("You are "+ age+" years old.");

// cart

//        String Item;
//        int quantity;
//        double price;
//        double total;
//
//
//        System.out.print("Enter Item Name: ");
//        Item = input.nextLine();
//
//        System.out.print("Enter Quantity: ");
//        quantity = input.nextInt();
//
//        System.out.print("Enter Price: ");
//        price = input.nextDouble();
//
//        total = price * quantity;
//
//        System.out.println("Total bill\n");
//        System.out.println("Item: " +Item+ "\nQuantity: "+quantity+"\nTotal Price: " + total);


// rock paper scissor game

//        Random random = new Random();
//
//        int number = random.nextInt(1,3);
//
//        System.out.println(number);
//
//        System.out.println("Enter one Rock, Paper and Scissor: ");
//        String userInput = input.nextLine();
//        String computerInput = "?";
//
//
//        if(number == 1){
//            computerInput = "rock";
//        } else if (number == 2) {
//            computerInput = "paper";
//        }
//        else if (number == 3) {
//            computerInput = "scissor";
//        }
//
//
//        System.out.println("Battle!");
//        System.out.println("Your choice vs Computer's choice");
//        System.out.println(userInput+" vs "+ computerInput);
//
//
//
//
//        if (Objects.equals(userInput, "Rock") || Objects.equals(userInput, "rock")){
//            if (number == 1){
//                System.out.println("its a draw!");
//
//            }
//            else if (number == 2){
//                System.out.println("Computer won the game!");
//            }
//            else {System.out.println("You won the game!");}
//        } else if (Objects.equals(userInput, "Paper") || Objects.equals(userInput, "paper")){
//
//            if (number == 2){
//                System.out.println("its a draw!");
//                return;
//            }
//            else if (number == 3){
//                System.out.println("Computer won the game!");
//                return;
//            }
//            else {System.out.println("You won the game!");
//            return;}
//
//        } else{
//
//            if (number == 3){
//                System.out.println("its a draw!");
//            }
//            else if (number == 1){
//                System.out.println("Computer won the game!");
//            }
//            else {System.out.println("You won the game!");}
//
//        }




//        for(int i = 1; i<11; i++){
//            System.out.println(i);
//        }


//        int i = 1;
//
//        while (i<11){
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<0);





        // Strings!

        //Classes oops

//        Test.Car c1 = new Test.Car();
//
//        c1.speed = 0;

//        c1.accelerate(100);
//        c1.accelerate(20);
//        c1.accelerate(40);
//
//        System.out.println(c1.getModel());
//        System.out.println(c1.speed);
//
//        c1.brake(80);
//        System.out.println(c1.speed);

//        Test.Cat c1 = new Test.Cat();
//        Test.Animal c2 = new Test.Cat();
//
//        c1.name = "Doraemon";
//        c1.age = 2;
//        c1.breed = "Persian";
//
//        c2.name = "Tom";
//        c2.age = 1;
//        c2.makeSound();
//
//
//        System.out.println(c1.name);
//        System.out.println(c1.age);
//        System.out.println(c1.breed);
//        c1.makeSound();


//        Car car = new Car("Tesla");
//        Car.Engine engine = car.new Engine();
//        engine.start();
//        engine.stop();

//        Computer computer = new Computer("Apple", "Mac Air", "Mac Os");
//        computer.getOs().displayInfo();

//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(4);
//        list.add(9);

//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for(int i = 0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//
//        for (int i: list){
//            System.out.println(i);
//        }

//        System.out.println(list.contains(4));
//        System.out.println(list.contains(0));


//        list.remove(2);
//        System.out.println(list.size());

//        list.add(2, 50);
//
//        for (int i: list){
//            System.out.println(i);
//        }

//        list.set(2, 0);

//        for (int i: list){
//            System.out.println(i);
//        }

//        System.out.println(list);


//        Node node1 = new Node();
//        Node node2 = new Node();
//
//        node2.value = 2;
//        node1.value = 1;
//        node1.next = node2;
//        node2.next = null;


//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.add(5);
//
//        linkedList.removeIf(x -> x % 2 == 0);
//
//        System.out.println(linkedList);
//
//
//        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
//
//        System.out.println(animals);

//
//        Vector<Integer> vector = new Vector<>(12, 4);
//
//
//        System.out.println(vector.size());



//        Stack<Integer> stack = new Stack<>();
//
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        System.out.println(stack);
//
//        stack.pop();
//
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.search(2));


//        List<String> shoppingList = new ArrayList<>();
//        shoppingList.add("Milk");
//        shoppingList.add("Eggs");
//        shoppingList.add("Butter");
//        System.out.println("Initial Shopping List: "+ shoppingList);
//
//        for(String item : shoppingList){
//            System.out.println(item);
//
//            if (item.equals("Eggs")){
//                shoppingList.add("Butter");
//                System.out.println("Added Butter while reading.");
//            }
//        }
//
//        System.out.println("Updated Shopping List: " + shoppingList);





//        List<String> shoppingList = new CopyOnWriteArrayList<>(f);
//        shoppingList.add("Milk");
//        shoppingList.add("Eggs");
//        shoppingList.add("Butter");
//        System.out.println("Initial Shopping List: "+ shoppingList);
//
//        for(String item : shoppingList){
//            System.out.println(item);
//
//            if (item.equals("Eggs")){
//                shoppingList.add("Butter");
//                System.out.println("Added Butter while reading.");
//            }
//        }
//
//        System.out.println("Updated Shopping List: " + shoppingList);

//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Sanjay");
//        map.put(2, "Shreyansh");
//        map.put(3, "Yash");
//        System.out.println(map);
//
//        String student = map.get(1);
//        System.out.println(student);
//        System.out.println(map.get(99));
//
//        System.out.println(map.containsKey(3));
//        System.out.println(map.containsValue("Sanjay"));
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


//        HashMap<Person, String> map = new HashMap<>();
//        Person p1 = new Person("Alice", 1);
//        Person p2 = new Person("Bob", 2);
//        Person p3 = new Person("Oggiy", 3);
//        Person p4 = new Person("Doraemon", 4);
//        Person p5 = new Person("Shinchan", 5);
//        Person p6 = new Person("Doraemon", 4);
//
//
//        map.put(p1, "Manager"); // hashcode1 --> index1
//        map.put(p2, "Developer");// hashcode2 --> index2
//        map.put(p3, "Ceo"); // hashcode3 --> index3
//        map.put(p4, "Product Manager"); // hashcode4 --> index4
//        map.put(p5, "Tester"); // hashcode5 --> index5
//        map.put(p6, "User"); // hashcode4 --> index4 --> equals --> replace
//
//        System.out.println("HashMap Size: "+ map.size());
//        System.out.println("Value for p1: "+ map.get(p1));
//        System.out.println("Value for p2: "+ map.get(p2));
//        System.out.println("Value for p3: "+ map.get(p3));
//        System.out.println("Value for p4: "+ map.get(p4));
//        System.out.println("Value for p5: "+ map.get(p5));
//        System.out.println("Value for p6: "+ map.get(p6));
//        //        System.out.println(p1);
//
//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("Shubham",90); // hashcode1 --> index1
//        map2.put("Neha", 92); // hashcode2 --> index2
//        map2.put("Shubham", 99); // hashcode1 --> index1 -->equals() --> replace





//        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        linkedHashMap.put("Orange", 10);
//        linkedHashMap.put("Apple", 30);
//        linkedHashMap.put("Guava", 20);
//
//        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


//        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
//        studentMap.put("Bob",99 );
//        studentMap.put("Alice",90 );
//        studentMap.put("Ram",91 );
//        studentMap.put("shyam",89 );
//
//
//        System.out.println(studentMap);


//        String key1 = new String("Key");
//        String key2 = new String("Key");
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put(key1,1);
//        map.put(key2,2);
//
//        System.out.println(map);


//
//        String key1 = new String("Key");
//        String key2 = new String("Key");
//
//        Map<String, Integer> map = new IdentityHashMap<>();
//        map.put(key1,1);
//        map.put(key2,2);
//
//        System.out.println(map);



        // sortedMap

        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b-a);

        map.put(99, "Shubham");
        map.put(92, "Ram");
        map.put(20, "Rohit");
        map.put(50, "Chirag");

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(92));
        System.out.println(map.tailMap(92));
//



















        input.close();

    }

}



class LRUCache<K, V> extends LinkedHashMap{

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}


//    class Person{
//        private String name;
//        private int id;
//
//        public Person(String name, int id){
//            this.name = name;
//            this.id = id;
//        }
//
//        public int getId(){
//            return id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(name, id);
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj){
//                return true;
//            }
//            if (obj == null) {
//                return false;
//            }
//            if (getClass() != obj.getClass()){
//                return false;
//            }
//            Person other = (Person) obj;
//            return id == other.getId() && Objects.equals(name, other.getName());
//
//        }
//
//        @Override
//        public String toString() {
//        return "id: "+ id + ",  " + "name: "+ name;
//        }
//    }