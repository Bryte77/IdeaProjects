
public class Animals {
    private  String tail,name,fur,type,cry;

    public Animals(String tail, String name, String fur) {
        this.tail = tail;
        this.name = name;
        this.fur = fur;
    }

    public Animals(String tail, String name, String fur, String type, String cry) {
        this.tail = tail;
        this.name = name;
        this.fur = fur;
        this.type = type;
        this.cry = cry;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }
}


