package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private ESex eSex;
    private String address;
    private double averageScore;

    public Student() {
    }

    public Student(int id, String name, int age, ESex eSex, String address, double averageScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.eSex = eSex;
        this.address = address;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ESex geteSex() {
        return eSex;
    }

    public void seteSex(ESex eSex) {
        this.eSex = eSex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
//        int id, String name, int age, ESex eSex, String address, double averageScore
        return String.format("%s,%s,%s,%s,%s,%s\n",this.id,this.name,this.age,this.eSex.name(),this.address,this.averageScore);
    }
    public void parseData(String line){
        String[] strings = line.split(",");
        this.id = Integer.parseInt(strings[0]);
        this.name = strings[1];
        this.age = Integer.parseInt(strings[2]);
        this.eSex = ESex.getSexByESexName(strings[3]);
        this.address = strings[4];
        this.averageScore = Double.parseDouble(strings[5]);
    }
}
