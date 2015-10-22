package processor;

import processor.ioPorts.IOPort;
import processor.memoryController.MemoryController;
import processor.sound.Sound;

/**
 * Created by vicboma on 17/10/15.
 */
public class ProcessorImpl implements Processor, InternalComponent {

    private MemoryController memoryController;
    private IOPort ioPort;
    private Sound sound;

    public ProcessorImpl(final MemoryController memoryController, final IOPort ioPort, final Sound sound) {
        this.memoryController = memoryController;
        this.ioPort = ioPort;
        this.sound = sound;
    }



    @Override
    public void load(){

    }

    @Override
    public void pause(){

    }

    @Override
    public void reset(){

    }

    @Override
    public void execute(){

    }


    public MemoryController memoryController() {
        return memoryController;
    }

    public IOPort ioPort() {
        return ioPort;
    }

    public Sound sound() {
        return sound;
    }
}
