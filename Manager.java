package QLKhachHang;

import QLSV.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    int n;
    Scanner sc = new Scanner(System.in);
    ArrayList<People> peoplesList = new ArrayList<>();
    People people = new People();


    public void addPeople(){
        System.out.println("Số người thuê  :");
        n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i < n; i++){
            System.out.println("Nhập name: ");
            String name = sc.nextLine();
            System.out.println("Nhập age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập address: ");
            String address = sc.nextLine();
            System.out.println("Nhập số chứng minh thư : ");
            int idCMT = Integer.parseInt(sc.nextLine());
            People people = new People(name, age, address, idCMT);
            peoplesList.add(people);
        }

    }

    public void hienThi(){
        for (People people : peoplesList){
            System.out.println(people);
        }
    }

    public void sortName(){
        Collections.sort(peoplesList, (b1, b2) -> (b1.getTen().compareTo(b2.getTen())));
    }

    public void sortAge(){
        Collections.sort(peoplesList, new Comparator<People>() {
            @Override
            public int compare(People sv1, People sv2) {
                if (sv1.getAge() < sv2.getAge()) {
                    return 1;
                } else {
                    if (sv1.getAge() == sv2.getAge()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }



}
