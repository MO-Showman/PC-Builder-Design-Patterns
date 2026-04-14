# PC Builder System - UML Class Diagram

This diagram strictly follows the Builder Design Pattern structure as referenced in standard Java Design Patterns literature.

```mermaid
classDiagram
  class PC {
    -String cpu
    -String ram
    -String gpu
    -String storage
    +setCpu(String cpu) void
    +setRam(String ram) void
    +setGpu(String gpu) void
    +setStorage(String storage) void
    +showInfo() void
  }

  class PCBuilder {
    <<interface>>
    +buildCPU() void
    +buildRAM() void
    +buildGPU() void
    +buildStorage() void
    +getPC() PC
  }

  class GamingPCBuilder {
    -PC pc
    +GamingPCBuilder()
    +buildCPU() void
    +buildRAM() void
    +buildGPU() void
    +buildStorage() void
    +getPC() PC
  }

  class OfficePCBuilder {
    -PC pc
    +OfficePCBuilder()
    +buildCPU() void
    +buildRAM() void
    +buildGPU() void
    +buildStorage() void
    +getPC() PC
  }

  class PCDirector {
    -PCBuilder builder
    +PCDirector(PCBuilder builder)
    +constructPC() void
  }

  %% Relationships
  PCBuilder <|.. GamingPCBuilder : Implements
  PCBuilder <|.. OfficePCBuilder : Implements
  GamingPCBuilder --> PC : Creates
  OfficePCBuilder --> PC : Creates
  PCDirector o-- PCBuilder : Aggregation
