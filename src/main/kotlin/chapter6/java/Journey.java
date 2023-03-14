package chapter6.java;

public class Journey {

    private String name;

    public Journey(String name) {
        this.name = name;
    }

    public Location getDepartsFrom() {
        return new Location("location");
    }

    public static <U extends Comparable<? super U>, T> int getDuration(T t) {
        return 0;
    }
}
