package com.hys.exam;

import static com.hys.exam.App.*;

public class TodoController {

    static void doModify(int id) {
        Todo found = foundTodoId(id);
        if (found == null) {
            System.out.printf("%d번 할일은 존재하지 않습니다.\n", id);
        } else {
            System.out.println("할일(기존) : " + found.getBody());
            System.out.print("할일 : ");
            String newBody = sc.nextLine().trim();

            found.setBody(newBody);
        }
    }

    static void doDelete(int id) {
        Todo found = foundTodoId(id);
        if (found == null) {
            System.out.printf("%d번 할일은 존재하지 않습니다.\n", id);
        } else {
            toDos.remove(found);
            System.out.printf("%d번 할일이 삭제되었습니다.\n", id);
        }
    }

    private static Todo foundTodoId(int id) {
        for (Todo todo : toDos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    static void showList() {
        if (toDos.isEmpty()) {
            System.out.println("할일 없음.");
        } else {
            System.out.println("번호      /       명언");
            System.out.println("=".repeat(45));
            for (int i = toDos.size() - 1; i >= 0; i--) {
                Todo todo = toDos.get(i);
                System.out.printf("%d       /       %s\n", todo.getId(), todo.getBody());
            }
        }
    }

    static void doWrite() {
        System.out.print("할일 ) ");
        String body = sc.nextLine().trim();

        int id = lastId++;

        toDos.add(new Todo(id, body));
        System.out.printf("%d번 할일이 등록되었습니다.\n", id);
    }
}