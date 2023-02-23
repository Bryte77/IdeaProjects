public class Markrep extends RecieveMarks {

    Markrep(double marks, String course){
        super(marks,course);
    }
    Markrep(){
        super(00,null);
    }
    public String remark(){
        if (getMarks()<25){
            return "F";
        } else if (getMarks()<45) {
            return "E";
        } else if (getMarks()<50) {
            return "D";
        } else if (getMarks()<60) {
            return "C";
        } else if (getMarks()<80) {
            return "B";
        } else if (getMarks()<=100) {
            return "A";
        }
        return "invalid mark";
    }

}
