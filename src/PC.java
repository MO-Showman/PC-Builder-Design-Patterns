
package com.mycompany.pcbuildersystem;


public class PC {
    private String cpu;
    private String ram;
    private String gpu;
    private String storage;

    // Setters
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu; 
    }
    public void setStorage(String storage) {
        this.storage = storage; 
    }

    public void showSpecs() {
        System.out.println("========= PC Configuration =========");
        System.out.println("CPU:     " + cpu);
        System.out.println("RAM:     " + ram);
        System.out.println("GPU:     " + gpu);
        System.out.println("Storage: " + storage);
        System.out.println("====================================\n");
    }
}
