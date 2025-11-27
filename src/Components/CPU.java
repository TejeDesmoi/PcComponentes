package Components;

public class CPU {
    String name;
    String brand;
    String clck_Speed;
    String cores;
    String cache;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClck_Speed() {
        return clck_Speed;
    }

    public void setClck_Speed(String clck_Speed) {
        this.clck_Speed = clck_Speed;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    String tdp;
}
