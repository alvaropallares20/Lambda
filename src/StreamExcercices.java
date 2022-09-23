import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExcercices {

    private int sum(List<Integer> numbres){
        int sum = 0;
        for(int numbre:numbres){
            sum+= numbre;
        }
        return sum;
    }
    private List<Integer> sum10(List<Integer> numbers){
        List<Integer> numberPlus10 = new LinkedList<>();
        for(int number:numbers){
            numberPlus10.add(number + 10);
        }
        return numberPlus10;
    }
    private List<Integer> sum10Fun(List<Integer> numbers){
        return numbers
                .stream()
                .map(number -> number + 10)
                .collect(Collectors.toList());
    }
    private List<Integer> minus10(List<Integer> numbers){
        List<Integer> numberPlus10 = new LinkedList<>();
        for(int number:numbers){
            numberPlus10.add(number - 10);
        }
        return numberPlus10;
    }
    private List<Integer> minus10Fun(List<Integer> numbers){
        return numbers
                .stream()
                .map(number -> number - 10)
                .collect(Collectors.toList());
    }
    private int reduceSum(List<Integer> numbers){
        return numbers
                .stream()
                //suma los numeros de una lista hasta que se combiertan solo en uno
                .reduce(0, (a, b) -> a + b);
    }
    private int reduceMultiply(List<Integer> numbers){
        return numbers
                .stream()
                //multiplica los numeros de una lista hasta que se combiertan solo en uno
                .reduce(1, (a, b) -> a * b);
    }


}
