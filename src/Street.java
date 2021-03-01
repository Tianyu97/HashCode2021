import java.util.*;
public class Street {
    public int intersection_1;
    public int intersection_2;
    public String name;
    public int timePass;
    public int greenTime;
    public Queue<Car> queue;

    public Street(int intersection_1, int intersection_2, String name, int timePass) {
        this.intersection_1 = intersection_1;
        this.intersection_2 = intersection_2;
        this.name = name;
        this.timePass = timePass;
        this.greenTime = 0;
        this.queue = new LinkedList<>();
    }

    public Street(int intersection_1, int intersection_2, String name, int timePass, Queue<Car> queue, int greenTime) {
        this.intersection_1 = intersection_1;
        this.intersection_2 = intersection_2;
        this.name = name;
        this.timePass = timePass;
        this.greenTime = greenTime;
        this.queue = queue;
    }
    
}
