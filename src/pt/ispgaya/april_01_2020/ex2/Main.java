package pt.ispgaya.april_01_2020.ex2;


import pt.ispgaya.Read;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        int code = 0;
        int option = 0;
        do {

            System.out.println("1 - Insert students");
            System.out.println("2 - Search grade");
            System.out.println("3 - Change grade");
            System.out.println("4 - Students list");
            System.out.println("5 - Sort Alphabetically");
            System.out.println("6 - Exit");

            option = Read.Int();
            switch (option) {
                case 1:
                    System.out.print("Insert name: ");
                    String name = Read.String();
                    System.out.print("Insert Grade: ");
                    double grade = Read.Double();
                    Student student = new Student(name, code, grade);
                    students[code] = student;
                    break;
                case 2:
                    System.out.print("Grade to Search: ");
                    grade = Read.Double();
                    for (Student student1 : students) {
                        if (student1 != null) {
                            if (student1.getGrade() == grade) {
                                System.out.println(student1.toString());
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Não");
                    break;
                case 4:
                    for (Student student1 : students) {
                        if (student1 != null) {
                            System.out.println(student1.toString());
                        }
                    }
                    break;
                case 5:
                    sortStrings(students);
                    for (Student student1 : students) {
                        if (student1 != null) {
                            System.out.println(student1.toString());
                        }
                    }
                    break;
            }
            code++;
        } while (option != 6);
    }

    public static void sortStrings(Student[] arr) {
        Student temp;

        // Sorting strings using bubble sort
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] != null && arr[i] != null) {
                    if (arr[j].getName().compareTo(arr[i].getName()) > 0) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}

class Student {
    private String name;
    private int code;
    private double grade;

    Student(String name, int code, double grade) {
        this.name = name;
        this.code = code;
        this.grade = grade;
    }

    public String getName() { return this.name; }

    public int getCode() { return this.code; }

    public double getGrade() { return this.grade; }

    public String toString() { return "Name: " + this.name + " (" + this.code + ") - Grade: " + this.grade; }
}

