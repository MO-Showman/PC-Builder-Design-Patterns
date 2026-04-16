
package com.mycompany.pcbuildersystem;


public class PCDirector {
    private PCBuilder builder;

    public PCDirector(PCBuilder builder) {
        this.builder = builder;
    }

    // This method defines the construction steps sequence
    public void constructPC() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildGPU();
        builder.buildStorage();
    }
}
