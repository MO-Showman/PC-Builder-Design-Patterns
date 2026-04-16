
package com.mycompany.pcbuildersystem;


public interface PCBuilder {
    void buildCPU();
    void buildRAM();
    void buildGPU();
    void buildStorage();
    PC getResult();
}
