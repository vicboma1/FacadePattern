package processor;

import processor.ioPorts.IOPort;
import processor.memoryController.MemoryController;
import processor.sound.Sound;

/**
 * Created by vicboma on 22/10/15.
 */
public interface InternalComponent {

     MemoryController memoryController();
     IOPort ioPort();
     Sound sound();
}
