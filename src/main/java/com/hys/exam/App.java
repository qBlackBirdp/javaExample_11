package com.hys.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.hys.exam.TodoController.*;

public class App {
    static Scanner sc;
    static int lastId;
    static List<Todo> toDos;

    public App() {
        sc = new Scanner(System.in);
        lastId = 1;
        toDos = new ArrayList<>();
    }

    public static void run() {
        System.out.println("== todo 앱 실행 ==");

        while (true) {
            System.out.print("명령어 ) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("== todo 앱 종료 ==");
                return;
            } else if (cmd.isEmpty()) System.out.println("명령어 똑바로 입력해.");

            switch (cmd) {
                case "add":
                    doWrite();
                    break;
                case "list":
                    showList();
                    break;

                default:
                    if (cmd.startsWith("del")) {
                        System.out.print("삭제할 할일의 번호: ");
                        int id = Integer.parseInt(sc.nextLine().trim());
                        doDelete(id);
                    } else if (cmd.startsWith("modify")) {
                        System.out.print("수정할 할일의 번호: ");
                        int id = Integer.parseInt(sc.nextLine().trim());
                        doModify(id);
                    } else System.out.println("명령어 오류");
                    break;
            }
        }
    }
}