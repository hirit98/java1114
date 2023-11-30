package Day08;

import java.io.Serializable;

public class Person_ implements Serializable { // 시리얼 코드가 필요함

    private static final long serialVersionUID = 1L;

    private String myName;
    private int myAge;

    public Person_(String myName, int age) {
        this.setPerson(myName, age);
    }

    public void setPerson(String myName, int myAge) {
        this.myName = myName;
        this.myAge = myAge;
    }

}
