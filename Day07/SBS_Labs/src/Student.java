public class Student {

    // 멤버변수 private - department, grade, id, name, address
    protected String department; // 학과
    String grade; // 학년
    String id; // 학번
    String name; // 이름
    String address; // 주소

    public Student(String nGrade, String strId, String strName, String strAddress) {
        this.grade = nGrade;
        this.id = strId;
        this.name = strName;
        this.address = strAddress;
    }

    // SetDepartment 메서드를 구현해서 학과 메서드를 get 함.
    public void SetDepartment(String strDepartment) {
        this.department = strDepartment;
    }


}
