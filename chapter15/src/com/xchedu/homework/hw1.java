package com.xchedu.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class hw1 {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        DAO<User> userDAO = new DAO<User>();
        userDAO.save("1",new User(1,15,"smith"));
        userDAO.save("2",new User(2,35,"john"));
        userDAO.save("3",new User(3,45,"white"));

        List<User> list = userDAO.list();
        System.out.println(list);

        userDAO.update("3",new User(3,55,"black"));
        userDAO.delete("1");
        list = userDAO.list();
        System.out.println(list);

        System.out.println(userDAO.get("2"));
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    @Test
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    @Test
    public T get(String id) {
        return map.get(id);
    }

    @Test
    public void update(String id, T entity) {
        map.put(id, entity);
    }

    //遍歷map，將value封裝到ArrayList返回
    @Test
    public List<T> list(){
        List<T> ts = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            ts.add(t);
        }
        return ts;
    }

    @Test
    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}