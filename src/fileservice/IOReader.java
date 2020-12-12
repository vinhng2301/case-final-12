package fileservice;

import model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class IOReader {
    public static ArrayList<Employee> arrayList=new ArrayList<>();
    public static ArrayList<Employee> fileRead(String path){
        File file = new File(path);
        if(arrayList == null) {
            arrayList = new ArrayList<>();
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                float salary = Float.parseFloat(split[2]);
                int workhour = Integer.parseInt(split[3]);
                float totalSalary = Float.parseFloat(split[4]);
                Employee employee = new Employee(id,name,salary,workhour,totalSalary);
                arrayList.add(employee);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
