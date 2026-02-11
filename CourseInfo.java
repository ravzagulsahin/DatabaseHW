import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CourseInfo {

    private String filename;
    private ArrayList<String[]> clist;

    public CourseInfo(String filename) {
        this.filename = filename;
        clist = new ArrayList<>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                if(line.equals("")) continue;

                String[] parts = line.split(",");

                for(int i=0; i<parts.length; i++){
                    parts[i] = parts[i].trim();
                }

                clist.add(parts);
            }

            scanner.close();
        } catch(Exception e){}
    }

    public void addCourse(String dept, String code, String title, int AKTS) {

        String[] newCourse = {dept, code, title, String.valueOf(AKTS)};
        clist.add(newCourse);

        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            for(int i=0; i<clist.size(); i++){
                String[] c = clist.get(i);
                writer.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3]);
            }

            writer.close();
        } catch(Exception e){}
    }

    public ArrayList<String> getCourses(String dept) {

        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i<clist.size(); i++){
            String[] c = clist.get(i);

            if(c[0].equals(dept)){
                answer.add(c[0] + c[1]);
            }
        }

        return answer;
    }

    public void removeCourse(String dept, String code) {

        for(int i=0; i<clist.size(); i++){
            String[] c = clist.get(i);

            if(c[0].equals(dept) && c[1].equals(code)){
                clist.remove(i);
                i--;
            }
        }

        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            for(int i=0; i<clist.size(); i++){
                String[] c = clist.get(i);
                writer.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3]);
            }

            writer.close();
        } catch(Exception e){}
    }

    public void changeAKTS(String dept, String code, int AKTS) {

        for(int i=0; i<clist.size(); i++){
            String[] c = clist.get(i);

            if(c[0].equals(dept) && c[1].equals(code)){
                c[3] = String.valueOf(AKTS);
            }
        }

        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            for(int i=0; i<clist.size(); i++){
                String[] c = clist.get(i);
                writer.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3]);
            }

            writer.close();
        } catch(Exception e){}
    }

    public void changeCourseCode(String dept, String code, String newCode) {

        for(int i=0; i<clist.size(); i++){
            String[] c = clist.get(i);

            if(c[0].equals(dept) && c[1].equals(code)){
                c[1] = newCode;
            }
        }

        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            for(int i=0; i<clist.size(); i++){
                String[] c = clist.get(i);
                writer.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3]);
            }

            writer.close();
        } catch(Exception e){}
    }
}
