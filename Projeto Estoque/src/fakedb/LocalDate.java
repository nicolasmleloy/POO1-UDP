package fakedb;

public class LocalDate {

    public static java.time.LocalDate now;

    public static java.time.LocalDate now() {
        return java.time.LocalDate.now();
    }
}
