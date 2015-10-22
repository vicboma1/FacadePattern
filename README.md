# Facade Pattern

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/vicboma1/facadepattern/trend.png)](https://bitdeli.com/free "Bitdeli Badge") [![Analytics](https://ga-beacon.appspot.com/UA-68658653-4/FacadePattern/readme)](https://github.com/igrigorik/ga-beacon)

Is an object that provides a simplified interface to a larger body of code.
* Make a software library easier to use and more readable;
* Reduce dependencies of outside code on the inner workings of a library.
* Allowing more flexibility in developing the system;

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



