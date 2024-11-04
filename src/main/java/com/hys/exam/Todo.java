package com.hys.exam;

public class Todo {
    private int id;
    private String body;

    public Todo(int id, String body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}