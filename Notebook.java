import java.util.Objects;

public class Notebook {
    private  String name;
    private  int RAM;
    private int HDD;
    private String operSystem;
    private int price;
    public Notebook(String name, int RAM, int HDD, String operSystem, int price){
        this.name = name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.operSystem = operSystem;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Модель: %s\n  Объем оперативной памяти: %d Гб\n  Oбъём жесткого диска %d Гб \n  Операционная система %s \n  Цена: %d \n",
                this.name, this.RAM, this.HDD, this.operSystem, this.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return RAM == notebook.RAM && HDD == notebook.HDD && price == notebook.price && Objects.equals(name, notebook.name) && Objects.equals(operSystem, notebook.operSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, RAM, HDD, operSystem, price);
    }

    public int getRam(){
        return this.RAM;
    }
    public int getHDD(){
        return this.HDD;
    }
    public String getOperSystem(){
        return this.operSystem;
    }
    public int getPrice(){
        return this.price;
    }



}
