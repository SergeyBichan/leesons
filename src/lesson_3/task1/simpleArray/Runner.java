package lesson_3.task1.simpleArray;

public class Runner {
    public static void main(String[] args) {
        MySimpleArrayList<String> strings = new MySimpleArrayList<>();
//Добавление
        strings.add("Hello");
        strings.add("From");
        strings.add("My");
        strings.add("SimpleArrayList");
//SOUT
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
        System.out.println(strings.get(3));
//Размер
        System.out.println(strings.size());
//update
        strings.update(1, "update");
        System.out.println(strings.get(1));
//delete
        System.out.println(strings.get(1));
        strings.delete(1);
        System.out.println(strings.get(1));

    }
}
