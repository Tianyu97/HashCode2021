import java.util.*;
public class Intersection {
    public int id;
    public List<String> income;
    public List<String> output;
    public Schedule schedule;

    public Intersection(int id) {
        this.id = id;
        this.income = new ArrayList<>();
        this.output = new ArrayList<>();
        this.schedule = new Schedule();
    }
    public Intersection(int id, List<String> income, List<String> output, Schedule schedule) {
        this.id = id;
        this.income = income;
        this.output = output;
        this.schedule = schedule;
    }
}

// class intersection():
//     def __init__(self):
//         self.ID = 0
//         self.income = []
//         self.output = []
