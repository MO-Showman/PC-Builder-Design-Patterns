
package com.mycompany.pcbuildersystem;


public class OfficePCBuilder implements PCBuilder {
    private PC pc;

    public OfficePCBuilder() {
        this.pc = new PC();
    }

    @Override
    public void buildCPU() {
        pc.setCpu("Intel Core i5-13400"); 
    }
    
    @Override
    public void buildRAM() {
        pc.setRam("16GB DDR4 3200MHz"); 
    }
    
    @Override
    public void buildGPU() {
        pc.setGpu("Integrated Intel UHD Graphics"); 
    }
    
    @Override
    public void buildStorage() {
        pc.setStorage("512GB NVMe SSD."); 
    }

    @Override
    public PC getResult() {
        return this.pc; 
    }
}
