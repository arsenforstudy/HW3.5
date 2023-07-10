
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompleteMethods {

    public static void main(String[] args) {
        getUniqueMeasurableItems(List.of(new Apple(), new WaterMelon(), new Tomato())); // 1
        getUniqueMeasurableItems(List.of(new Coin(), new Toy(), new Chair())); // 2
        getUniqueMeasurableItems(List.of(new Water(), new Juice(), new Oil())); // 3
        var packedBeverages = getUniqueMeasurableItems(List.of(new CanOfCoke(), new BottleOfJuice())); // 4
    }

    public static <T

            //1
//            extends MeasuredInKilograms
            //2
//            extends MeasuredInLiters
            //3
//            extends MeasuredInLiters & Countable
            //4
//            жодних змін

            > Set<T> getUniqueMeasurableItems(List<T> list) {
        // some specific processing to happen here
        return new HashSet<T>(list);
    }

    private interface MeasuredInKilograms {
    }

    private static class Apple implements MeasuredInKilograms {
    }

    private static class WaterMelon implements MeasuredInKilograms {
    }

    private static class Tomato implements MeasuredInKilograms {
    }

    private interface Countable {
    }

    private static class Coin implements Countable {
    }

    private static class Toy implements Countable {
    }

    private static class Chair implements Countable {
    }

    private interface MeasuredInLiters {
    }

    private static class Water implements MeasuredInLiters {
    }

    private static class Juice implements MeasuredInLiters {
    }

    private static class Oil implements MeasuredInLiters {
    }

    private static class CanOfCoke implements Countable, MeasuredInLiters {
    }

    private static class BottleOfJuice implements Countable, MeasuredInLiters {
    }
}
