package cn.pojo;

public class Person {
    //年龄
    private Integer age;
    //名字
    private  String name;


    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }


    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
