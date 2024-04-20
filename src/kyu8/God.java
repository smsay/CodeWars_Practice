package kyu8;

/*
Basic subclasses - Adam and Eve

According to the creation myths of the Abrahamic religions,
Adam and Eve were the first Humans to wander the Earth.

You have to do God's job.
The creation method must return an array of length 2 containing objects
(representing Adam and Eve). The first object in the array should be an instance of the class Man.
The second should be an instance of the class Woman.
Both objects have to be subclasses of Human. Your job is to implement the Human, Man and Woman classes.

Categories : Fundamentals
 */


import java.util.Arrays;

public class God {

    static Human[] create() {
        return new Human[]{new Man("Adam"), new Woman("Eve")};
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(God.create()));
    }
}
interface Human {

}

class Man implements Human {
    private final String name;

    public Man(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Woman implements Human {
    private final String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}