public class RecieveMarks {
    private double marks;
    private String course;
    public double getMarks(){
        return marks;
    }
    public String getCourse(){
        return course;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    public void setCourse(String course){
        this.course = course;
    }
    RecieveMarks(double marks, String course){
        this.marks = getMarks();
        this.course = getCourse();
    }
}