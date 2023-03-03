public class Laptop {

    String name;
    Integer ram;
    Integer hardDrive;
    String operatingSystem;
    String color;
    Double diagonal;

    public Laptop(String name, Integer ram, Integer storageCap, String operatingSystem, 
    String color, Double diagonal) {
        this.name = name;
        this.ram = ram;
        this.hardDrive = storageCap;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format(
                "Марка ноутбука: %s \n объем оперативной памяти: %d Гб \n объем жесткого диска %d Гб \n Операционная система %s \n Цвет %s \n Диагональ %.1f \n",
                this.name, this.ram, this.hardDrive, this.operatingSystem, this.color, this.diagonal);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        if (this.name.equals(laptop.name) && ram.equals(laptop.ram) && hardDrive.equals(laptop.hardDrive)
                && operatingSystem.equals(laptop.operatingSystem) && color.equals(laptop.color)
                && diagonal.equals(laptop.diagonal)) {
            return true;
        } else
            return false;

    }

    @Override
    public int hashCode() {
        return name.hashCode() + ram.hashCode() + hardDrive.hashCode() + operatingSystem.hashCode()
         + color.hashCode() + diagonal.hashCode();
    }

    public int getRam() {
        return this.ram;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

}