package processor.memoryController;

import processor.memoryController.bios.Bios;
import processor.memoryController.rom.Rom;
import processor.memoryController.videoRam.VideoRam;

/**
 * Created by vicboma on 22/10/15.
 */
public interface MemoryController {
     Bios bios();

     Rom rom();

     VideoRam videoRam();
}
