package com.projects.designpatterns;

public class Singleton {
    private static Singleton instance = null;
    private String id;

    protected Singleton() {
        setId("mirela");
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Singleton o = (Singleton) obj;
            return o.id.equals(this.id);
        }

        return super.equals(obj);
    }
}
