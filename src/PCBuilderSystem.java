package com.mycompany.pcbuildersystem;

public class PCBuilderSystem {

    public static void main(String[] args) {
     System.out.println("PC Customization System Started...\n");

        // 1. Build a Gaming PC
        PCBuilder gamingBuilder = new GamingPCBuilder();
        PCDirector director = new PCDirector(gamingBuilder);
        director.constructPC();
        PC gamingPC = gamingBuilder.getResult();
        System.out.println("Building Gaming PC:");
        gamingPC.showSpecs();

        // 2. Build an Office PC
        PCBuilder officeBuilder = new OfficePCBuilder();
        // Update director to use the office builder
        director = new PCDirector(officeBuilder);
        director.constructPC();
        PC officePC = officeBuilder.getResult();
        System.out.println("Building Office PC:");
        officePC.showSpecs();
    }
}
