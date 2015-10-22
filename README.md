# FacadePattern

## Interface as a DSL
```java

  final Bios bios = new BiosImpl();
  final Rom rom = new RomImpl();
  final VideoRam videoRam = new VideoRamImpl();
  final MemoryController memoryController = new MemoryControllerImpl(bios,rom,videoRam);
  
  final Sound sound = new SoundImpl();
  final IOPort ioPort = new IOPortImpl();

  final Processor processor = new ProcessorImpl(memoryController,ioPort,sound);
```

## Interface as a Type
```java

  final Bios bios = new BiosImpl();
  final Rom rom = new RomImpl();
  final VideoRam videoRam = new VideoRamImpl();
  final MemoryController memoryController = new MemoryControllerImpl(bios,rom,videoRam);
  
  final Sound sound = new SoundImpl();
  final IOPort ioPort = new IOPortImpl();

  final InternalComponent interalComponent = new ProcessorImpl(memoryController,ioPort,sound);
```


##UML
![](http://i.imgur.com/f7RziXb.png)
