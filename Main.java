import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    String name = "", age = "", color = "";

    people.add(new Person("Tiernan", 21, "Green"));
    people.add(new Person("A", 87, "Pink"));
    people.add(new Person("B", 13, "Yellow"));
    people.add(new Person("C", 55, "Black"));
    people.add(new Person("D", 4, "Green"));

    try{
      FileWriter toWriteFile;
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(toWriteFile);

      for(int i=0; i<people.size(); i++){
        output.write(people.get(i).getname());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
      output.newLine();
      output.flush();
      }
    output.close();
    }
    catch (IOException exception){
      System.out.println("An error occurred: " + exception);
    }
  }
}