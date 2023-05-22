package model;

public enum ESex {
    MALE(1,"Nam"), FEMALE(2,"Nữ");
    private int id;
    private String name;
    ESex(int id, String name){
        this.id = id;
        this.name = name;
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
    public static ESex getSexByESexName(String esexName){
        for (ESex eSex: ESex.values()){
            if (eSex.name().equals(esexName)){
                return eSex;
            }
        }
        return null;
    }
    public static ESex getESexById(int id){
        for (ESex eSex: ESex.values()){
            if (eSex.id == id){
                return eSex;
            }
        }
        return null;
    }
}
