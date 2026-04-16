
package com.mycompany.pcbuildersystem;


public class GamingPCBuilder implements PCBuilder {
    private PC pc;

    public GamingPCBuilder() {
        this.pc = new PC();
    }

    @Override
    public void buildCPU() {
        pc.setCpu("Intel Core i9-14900K"); 
    }
    
    @Override
    public void buildRAM() {
        pc.setRam("32GB DDR5 6000MHz"); 
    }
    
    @Override
    public void buildGPU() {
        pc.setGpu("NVIDIA RTX 4090 24GB"); 
    }
    
    @Override
    public void buildStorage() {
        pc.setStorage("2TB NVMe Gen5 SSD"); 
    }

    @Override
    public PC getResult() {
        return this.pc; 
    }
}
