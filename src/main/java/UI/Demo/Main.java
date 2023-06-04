package UI.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        Bmw bmw = new Bmw("BWM", "Black", 2020, 3.5);
//        System.out.println(bmw.makeSound());
//        System.out.println(bmw.getColour());
//        System.out.println(bmw.read1());

//
//        Demo2 myMethod=new Demo2();
//        System.out.println(myMethod.swim("Aygerim",25));
//        Demo2.swim1();
//
//        String name ="Gulzat";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.substring(0,2));
//
//        List<Integer> listOffNumbers=new ArrayList<>();
//        listOffNumbers.add(5);
//        listOffNumbers.add(41);
//        listOffNumbers.add(55);
//        listOffNumbers.add(4);
//        listOffNumbers.add(88);
//
//
//        List<Integer> listOffNumbers1= Arrays.asList(100,200,500,600,300,700);
//
//        List<Integer> newList=listOffNumbers1.stream()
//                .filter(n-> n >=300)
//                .collect(Collectors.toList());
//                //.forEach(System.out::println);
//        System.out.println(newList);
//
//         List<String> usersList=new ArrayList<>();
//         usersList.add("Aigul");
//         usersList.add("Meerim");
//         usersList.add("Aygerim");
//         usersList.add("Nazira");
//         usersList.add("Jyldyz");
//         usersList.add("Asel5");
//
//         usersList.stream()
//                 .filter(str->str.startsWith("M"))
//                 .forEach(System.out::println);

//         for(String str:usersList){
//             if(str.length()>=6){
//                 System.out.println(str);
//             }
//
//         }
//
//          for (int j = 0; j < usersList.size(); j++) {
//            String user = usersList.get(j);
//            if (user.length() >= 5) {
//                System.out.println(user);
//            }
//         }

//
//          String name="Izat";
//          String result = "";
//           for(int i=name.length()-1;i>=0;i--){
//               result= result+name.charAt(i);
//           }
//        System.out.println(result);


        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Aygerim", 1, 75));
        listOfStudents.add(new Student("Aygul", 2, 80));
        listOfStudents.add(new Student("Jyldyz", 3, 90));
        listOfStudents.add(new Student("Meerim", 4, 85));
        listOfStudents.add(new Student("Asel", 5, 77));

        listOfStudents.stream()
                .filter(n-> n.getGrade()>80)
                .forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        listOfStudents.stream()
                .filter(str->str.getName().endsWith("m"))
                .forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        listOfStudents.stream()
                .map(str->str.getName().toUpperCase())
                .forEach(System.out::println);

    }

}


