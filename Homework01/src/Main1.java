import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/marek/Pulpit/java_gits/ServletsHomeTasks/Homework01/src/earnings.txt");
            Map<String, Worker> workers = new HashMap<>();

            BufferedReader in = new BufferedReader(new FileReader(path.toFile()));
            String line;
            String regex1 = "Kowalsk{1,}";
            String regex2 = "\\d{1,}\\.\\d{1,2}.?zł";
            double cash;
            while ((line = in.readLine()) != null) {
                Pattern compiledPattern = Pattern.compile(regex1);
                Matcher matcher = compiledPattern.matcher(line);
                if (!matcher.find()) {
                    compiledPattern = Pattern.compile(regex2);
                    matcher = compiledPattern.matcher(line);
                    if (matcher.find()) {
                        String resultCash = matcher.group().replaceAll("zł", "");
                        cash = Double.parseDouble(resultCash);
                        workers.put(line, new Worker(line, cash));
                    }
                }
            }

            List<Worker> workersList = new ArrayList<>();
            List<Double> cashList = new ArrayList<>();
            for (Map.Entry<String, Worker> entry : workers.entrySet()) {
                workersList.add(entry.getValue());
                cashList.add(entry.getValue().getCash());
            }

            cashList.sort((o1, o2) -> {
                if (o2 > o1) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                }
                return 0;
            });
            cashList = cashList.subList(0, 3);
            for (double cash2 : cashList) {
                for (Worker worker : workersList) {
                    if (worker.getCash() == cash2) {
                        System.out.println(worker.getDescription());
                        //Prevent from choosing the same worker
                        worker.setCash(-1);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}