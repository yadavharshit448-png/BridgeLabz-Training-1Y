package com.gla.interfaces.problem7;

import java.io.Serializable;

// 1. Serializable (Existing)
class BackupData implements Serializable {
    String data = "Important Data";
}

// 2. Cloneable (Existing)
class Prototype implements Cloneable {
    String name;

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// 3. Custom Marker Interface
interface SensitiveData {
}

class UserCredentials implements SensitiveData {
    String username;
    String password;

    public UserCredentials(String u, String p) {
        this.username = u;
        this.password = p;
    }
}

class DataProcessor {
    void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Processing Encrypted Data...");
        } else {
            System.out.println("Processing Normal Data...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Serialization check
        BackupData bd = new BackupData();
        if (bd instanceof Serializable) {
            System.out.println("BackupData is Serializable.");
        }

        // 2. Cloning
        try {
            Prototype p1 = new Prototype("Original");
            Prototype p2 = (Prototype) p1.clone();
            System.out.println("Cloned Object Name: " + p2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 3. Sensitive Data
        DataProcessor dp = new DataProcessor();
        UserCredentials creds = new UserCredentials("admin", "1234");
        dp.process(creds);
        dp.process("Just a string");
    }
}
