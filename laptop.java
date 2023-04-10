package HW6;

public class laptop {
    private String model;
    private String os;
    private int ozu;

    public laptop(String model, String os, int ozu) {
        this.model = model;
        this.os = os;
        this.ozu = ozu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public int getOzu() {
        return ozu;
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "Модель: " + model + '\n' +
                "OС: " + os + '\n' +
                "ОЗУ: " + ozu + '\n';
    }

    public void filterOs(String os){
        if (this.os.equals(os)) {
            System.out.println(this);
        } 
    }
}
